package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class MyCalendar {
	
	Calendar calendar = Calendar.getInstance();

	public void add(int field, int amount) {
		calendar.add(field, amount);
	}
	
	public int get(int field) {
		return calendar.get(field);
	}

	public int getGreatestMinimum(int field) {
		return calendar.getGreatestMinimum(field);
	}

	public int getLeastMaximum(int field) {
		return calendar.getLeastMaximum(field);
	}

	public int getMaximum(int field) {
		return calendar.getMaximum(field);
	}

	public int getMinimum(int field) {
		return calendar.getMinimum(field);
	}

	public void roll(int field, boolean up) {
		calendar.roll(field, up);
		
	}

}
