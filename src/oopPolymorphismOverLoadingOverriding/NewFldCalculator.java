package oopPolymorphismOverLoadingOverriding;

public class NewFldCalculator extends FieldCalculator {

@Override	
public int areaOfland(int a, int b, int c) {
		
		int total = a + b + c -1; // Overriding the logic of the method 
		return total;	
	}
	
	
	
	
	
	
	
}
