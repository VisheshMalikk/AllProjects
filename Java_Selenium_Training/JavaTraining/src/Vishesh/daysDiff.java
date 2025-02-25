package Vishesh;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class daysDiff {

	public static void main(String[] args) throws Exception {

		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date date1 = df.parse("11/26/2023");
		Date date2 = df.parse("11/29/2023");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(date1);
		cal2.setTime(date2);

		int numberOfDays = 1;
		while (cal1.before(cal2)) {
			if ((Calendar.SATURDAY != cal1.get(Calendar.DAY_OF_WEEK))
					&& (Calendar.SUNDAY != cal1.get(Calendar.DAY_OF_WEEK))) {
				numberOfDays++;
			}
			cal1.add(Calendar.DATE, 1);
		}
		System.out.println(numberOfDays);

	}

}
