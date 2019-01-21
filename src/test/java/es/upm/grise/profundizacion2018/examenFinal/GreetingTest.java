package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.Calendar;

public class GreetingTest {

	@Test
	public void smokeTest1() {
		MyCalendar calendar = mock(MyCalendar.class);
		when(calendar.get(Calendar.HOUR_OF_DAY)).thenReturn(8);
		Message message = new Message();
		Greeting greeting = new Greeting(calendar, message);
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		MyCalendar calendar = mock(MyCalendar.class);
		when(calendar.get(Calendar.HOUR_OF_DAY)).thenReturn(6);
		Message message = new Message();
		Greeting greeting = new Greeting(calendar, message);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		MyCalendar calendar = mock(MyCalendar.class);
		when(calendar.get(Calendar.HOUR_OF_DAY)).thenReturn(5);
		Message message = new Message();
		Greeting greeting = new Greeting(calendar, message);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}
	
	@Test
	public void smokeTest4() {
		MyCalendar calendar = mock(MyCalendar.class);
		when(calendar.get(Calendar.HOUR_OF_DAY)).thenReturn(8);
		Message message = mock(Message.class);
		when(message.getDefaultLanguage()).thenReturn(Language.ENGLISH);
		when(message.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");
		Greeting greeting = new Greeting(calendar, message);
		assertEquals("Good morning", greeting.getGreeting(null));
		verify(message, times(1)).getDefaultLanguage();
		verify(message, times(1)).getMessage(TimeOfTheDay.MORNING,Language.ENGLISH);
	}

	@Test
	public void smokeTest5() {
		MyCalendar calendar = mock(MyCalendar.class);
		when(calendar.get(Calendar.HOUR_OF_DAY)).thenReturn(6);
		Message message = mock(Message.class);
		when(message.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");
		Greeting greeting = new Greeting(calendar, message);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
		verify(message, never()).getDefaultLanguage();
		verify(message, times(1)).getMessage(TimeOfTheDay.MORNING,Language.ENGLISH);
	}
}
