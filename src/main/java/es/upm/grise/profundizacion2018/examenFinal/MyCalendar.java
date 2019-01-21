package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class MyCalendar extends Calendar {
	
	Calendar calendar;
	
	public MyCalendar() {
		calendar = Calendar.getInstance();
	}

	@Override
	public void add(int field, int amount) {
		calendar.add(field, amount);
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getGreatestMinimum(int field) {
		return calendar.getGreatestMinimum(field);
	}

	@Override
	public int getLeastMaximum(int field) {
		return calendar.getLeastMaximum(field);
	}

	@Override
	public int getMaximum(int field) {
		return calendar.getMaximum(field);
	}

	@Override
	public int getMinimum(int field) {
		return calendar.getMinimum(field);
	}

	@Override
	public void roll(int field, boolean up) {
		calendar.roll(field, up);
		
	}

}
