package oopPolymorphismOverLoadingOverriding;

	public class FieldCalculator {
	
	public int areaOfland(int a, int b) {
		
		int total = a + b;
		return total;
	}

	public int areaOfland(int a, int b, int c) {
		
		int total = a + b + c;
		return total;	
	}

	public int areaOfland(int a, int b, int c, String location) {
	
	int city = Integer.parseInt(location);
	
	int total = a + b + c + city;
	return total;
	
}


}


