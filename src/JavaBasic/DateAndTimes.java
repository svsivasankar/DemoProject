package JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateAndTimes {

	public static void main(String[] args) {
		DateAndTimes.getCurrentDateTime();
		DateAndTimes.FormatDateTime();
		DateAndTimes.CalendarClassGetDateTime();
		DateAndTimes.setFutureDateTime();
		DateAndTimes.setPastDateTime();
		DateAndTimes.CalendarClassFormatDateTime();
	}

	public static void getCurrentDateTime() {
		// create a object for date class
		Date dt = new Date();
		System.out.println("Current Date & Time Is : " + dt);
	}

	public static void FormatDateTime() {
		// create a object for date class
		Date getDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
		System.out.println("Formatted Date & Time Is : " + dateFormat.format(getDate).toString());
	}

	public static void CalendarClassGetDateTime() {
		//Calendar calendar = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		Date getDateTime = cal.getTime();
		System.out.println("Calendar Class Get Current Date & Time Is : " + getDateTime);
	}

	//@SuppressWarnings("static-access")
	public static void setFutureDateTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_YEAR, 5);
		Date futureDateTime = calendar.getTime();
		System.out.println("Calendar Class Set Future Date & Time Is : " + futureDateTime);
	}

	@SuppressWarnings("static-access")
	public static void setPastDateTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_YEAR,-9);
		Date pasDatetime = calendar.getTime();
		//calendar.add(calendar.DAY_OF_YEAR, -3);
		//Date pastDateTime = calendar.getTime();
		System.out.println("Calendar Class Set Past Date & Time Is : " + pasDatetime);
	}

	@SuppressWarnings("static-access")
	public static void CalendarClassFormatDateTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_YEAR, -3);
		Date DateTime = calendar.getTime();
		SimpleDateFormat formatDates = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		System.out.println("Calendar Class Format Date & Time Is : " + formatDates.format(DateTime).toString());
	}

}

// ithula ella formate + day and - days ella concepts irukku ya 
//i have worked ok ya i il check and tell you i have dubt on window handling da il ask you later da i have some urgent work now 
