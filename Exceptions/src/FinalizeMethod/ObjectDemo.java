package FinalizeMethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectDemo extends GregorianCalendar {
	public static void main(String[] args) throws Throwable {
//	      try {
	         // create a new ObjectDemo object
	         ObjectDemo cal = new ObjectDemo();
	         Calendar cal1 = Calendar.getInstance();
	         // print current time
	         System.out.println("" + cal.getTime());
	         System.out.println("" + cal.getCalendarType());
	         System.out.println("" + cal.toZonedDateTime());
	         //System.out.println("" + cal.from(null));
	         System.out.println("" + cal1.getTime());
	         // finalize cal
	         System.out.println("Finalizing...");
	         cal.finalize();
	         System.out.println("Finalized.");

//	      } catch (Throwable ex) {
//	         ex.printStackTrace();
//	      }
	   }

}
