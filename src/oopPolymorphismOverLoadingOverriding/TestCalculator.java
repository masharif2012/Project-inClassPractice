package oopPolymorphismOverLoadingOverriding;

public class TestCalculator {

	public static void main(String[] args) {
	
		FieldCalculator fCal = new FieldCalculator(); //object created.
		
		System.out.println(fCal.areaOfland(5, 10));
		
		System.out.println(fCal.areaOfland(5, 12, 20)); 
		
		
		
		NewFldCalculator nFCal = new  NewFldCalculator(); //object created.
		
		
		System.out.println(nFCal.areaOfland(5, 12, 20));
		
		System.out.println(nFCal.areaOfland(5, 12, 20, "3110"));

	}

}

