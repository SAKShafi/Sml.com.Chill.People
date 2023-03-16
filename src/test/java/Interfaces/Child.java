package Interfaces;

public class Child extends ParentsA {
	
	
	protected static void getMobile() {
		System.out.println("child have iphone 15 ");
	}
	
	protected void getCar() {
		
		System.out.println("child have BMW ");
		
	}
	
	public static void main(String[] args) {
		
		Child jawad = new Child();
		 jawad.getCar();// child class
		 Child.getMobile(); // child class
		jawad.getAudi(); // parents class
		jawad.getGold(10.34);// parents class
		System.out.println(jawad.getHome());// parents class
		Child.getisland();
	}

}
