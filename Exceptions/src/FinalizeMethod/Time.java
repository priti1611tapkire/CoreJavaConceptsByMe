package FinalizeMethod;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Time {
	public static void main(String args[])
    {
        // declaring an array to store month abbreviations
        String month[] = { "Jan", "Feb", "Mar", "Apr",
                           "May", "Jun", "Jul", "Aug",
                           "Sep", "Oct", "Nov", "Dec" };
  
        // declaring an array to store AM or PM
        String amPm[] = { "AM", "PM" };
  
        /* Creating an object of GregorianCalendar class
             using default constructor*/
        GregorianCalendar gcal = new GregorianCalendar();
  
        // displaying the date, time, time zone and locale
        System.out.print("Date: "
                         + month[gcal.get(Calendar.MONTH)] + " "
                         + gcal.get(Calendar.DATE) + ", "
                         + gcal.get(Calendar.YEAR) + "\n"
                         + "Time: "
                         + gcal.get(Calendar.HOUR) + ":"
                         + gcal.get(Calendar.MINUTE) + ":"
                         + gcal.get(Calendar.SECOND) + " "
                         + amPm[gcal.get(Calendar.AM_PM)] + "\n"
                         + "Time Zone: " + gcal.getTimeZone().getDisplayName()
                         + "\n"
                         + "Locale: "
                         + Locale.getDefault().getDisplayName());
    } // end of main function
}
