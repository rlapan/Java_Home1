package HW3;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addData(new Date(), 3, 15, 2); 
	}

	public static void addData(Date date, int day, int month, int year) {
		
		System.out.println(date);
		Calendar calendar= Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(Calendar.DAY_OF_MONTH, day);
		calendar.add(Calendar.MONTH, month);
		calendar.add(Calendar.YEAR, year);
		System.out.println(calendar.getTime());
	}

}
