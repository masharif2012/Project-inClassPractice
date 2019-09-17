package dateAndTIME;

import java.time.LocalDate;
import java.time.Month;

public class CurrentDate {

	public static void main(String[] args) {
		// Using any predefined Date.
		//LocalDate d1 =LocalDate.of(1980, 01,12);
		//System.out.println(d1);
		//or
		LocalDate d2 =LocalDate.of(1980, Month.JANUARY,12);
		System.out.println(d2);
		
	
		// To view the Current Date
		LocalDate d = LocalDate.now();
		System.out.println("Today's Date is: "+d);
		

	}

}
