package com.nor;

abstract class op{
	abstract void pro();
}


class embed extends op{
	
	void pro() {
		System.out.println("This method is not work");
	}
	
	void varience() {
		System.out.println("Production evaluation");
	}
}

class core extends embed{
	void pro() {
		System.out.println("This is last method");
	}
}

public class first extends core{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		embed an = new core();
		an.pro();
		
		
		
	}

}
