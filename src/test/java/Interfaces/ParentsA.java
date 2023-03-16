package Interfaces;

public class ParentsA {
	
	protected String getHome(){
		return "my father have 11 millon dollar";
		 // return method 
	}
	protected void getAudi() { // void method
		 System.out.println( "my father have audi car");
	 }
	
	protected void getGold(double age) { // parameter method
		 System.out.println(age);
	 }
	protected static void getisland() { // static method
		System.out.println("my father have an island");
	}
	
	public static void main(String[] args) {
		
	
		
		ParentsA abc = new ParentsA();   // object create 

		System.out.println(abc.getHome()); // printing return method
	abc.getAudi(); // printing void method
	abc.getGold(10.34); // printing parameter method
		
	ParentsA.getisland();
		
		
	}
	
	

}
