import java.util.Calendar;
import java.util.Date;

public class GetDaysInMonth {
  public static void main(String[] args)
  {
  /*Calendar calendar = Calendar.getInstance();
  int year = 2020;
  int month = Calendar.FEBRUARY;
  int date = 5;
  calendar.set(year, month, date);
  int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
  System.out.println("Number of Days: " + days);*/
	
	Calendar cal = Calendar.getInstance();  // or pick another time zone if necessary
	cal.set(Calendar.MONTH, Calendar.JANUARY);
	cal.set(Calendar.DAY_OF_MONTH, 1);      // 1st day of month
	cal.set(Calendar.YEAR, 2020);
  
  Date startDate = cal.getTime();
	
	cal.setTime(startDate);
//	cal.set(Calendar.DAY_OF_MONTH, 1); 
	int myMonth=cal.get(Calendar.MONTH);

	while (myMonth==cal.get(Calendar.MONTH)) {
	System.out.println(cal.getTime());
	System.out.println("in dev branch");
	cal.add(Calendar.DAY_OF_MONTH, 1);
	}
  }
}