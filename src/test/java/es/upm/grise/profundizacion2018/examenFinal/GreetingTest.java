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
		Greeting greeting = new Greeting(calendar);
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		MyCalendar calendar = mock(MyCalendar.class);
		when(calendar.get(Calendar.HOUR_OF_DAY)).thenReturn(8);
		Greeting greeting = new Greeting(calendar);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		MyCalendar calendar = mock(MyCalendar.class);
		when(calendar.get(Calendar.HOUR_OF_DAY)).thenReturn(8);
		Greeting greeting = new Greeting(calendar);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}
	
	@Test
	public void smokeTest4() {
		MyCalendar calendar = mock(MyCalendar.class);
		when(calendar.get(Calendar.HOUR_OF_DAY)).thenReturn(8);
		Greeting greeting = new Greeting(calendar);
		assertEquals("Good morning", greeting.getGreeting(null));
		
	}

}
