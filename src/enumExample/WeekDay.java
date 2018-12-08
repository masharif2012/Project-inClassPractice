package enumExample;

public class WeekDay {
Week day;
public WeekDay() {}
public WeekDay(Week day) {
	this.day = day;
}

public void wahatShouldIdoToday() {
	switch(day) {
	case Monday:
		System.out.println(".....");
		break;
	case Tuesday:
		System.out.println(".......");
		break;
	case Wednesday:
		System.out.println(".....");
		break;
	case Thursday:
		System.out.println(".....");
		break;
	case Friday:
		System.out.println(".....");
		break;
	case Saturday:
		System.out.println("......");
		break;
	case Sunday:
		System.out.println("......");
		break;
	default:
		System.out.println("no more days left.");
		
	}
	
}





}
