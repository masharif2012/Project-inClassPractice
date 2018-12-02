package OverLoadingPKG;

public class TestOverLoading {

	public static void main(String[] args) {
		
		
		OverLoading obj = new OverLoading();
		
		obj.addition();
		
		obj.addition(20);
		
		obj.addition(25, 30);
		
		obj.addition("heloo strings", 15.67);
		
		obj.addition("string 2.....", 40);
		
	}

}
