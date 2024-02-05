
package com.nor;

class mentor{
	String name = "Lenovo";
	
	float number = 34.3425f;
	
	void moniter(){
		System.out.println("Execution of method.");
	}
}

class second extends mentor{ 
	
	String name = "Dell";
	second(){
		System.out.println("operation execute.");
	}
	
	void offer() {
		System.out.println(name);
		//System.out.println(super.name);
	}
}

class door extends second{
	
	door(){
		super();
		System.out.println("Samsung.");
	}
	
	
	
	void offer() {
		System.out.println("Welcome to third class.");
		
		
	
	//super.offer();
		
}
}


public class numerral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		door an = new door();
		
		an.offer();
		
		

	}

}
