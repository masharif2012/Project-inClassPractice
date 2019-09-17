package dateAndTIME;

import java.time.Instant;
import java.time.LocalTime;

public class CurrentTime {

	public static void main(String[] args) {
		// to see the current local time
		LocalTime time = LocalTime.now();
		System.out.println("The Current Local Time is: "+time);

		
		// To see the current date and (GMT) time.
		//Instant inst = Instant.now();
		System.out.println("This is the GMT(Date & Time): "+Instant.now());
	}

}
