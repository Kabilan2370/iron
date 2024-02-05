package com.nor;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner an = new Scanner(System.in);
		System.out.println("Enter a numbers :");
		
		int a = an.nextInt();
		
		int[] b = new int[a];
		System.out.println("Enter a "+a+"numbers :");
		
		int total = 0;
		
		for(int c = 0;c < a;c++) {
			b[c] = an.nextInt();
		}
		System.out.println("Enter a number ? what you want found a position :");
		
		int val = an.nextInt();
		
		for(int d = 0;d < a;d++) {
			if(b[d] == val) {
				total = d + 1;
			}
				
		}
		if(total == 0) {
			System.out.println("You enterd number is not found!");
		}
		else
			System.out.println("Your entered number "+val+" is "+total+" position");
		
		
		
		
		
		
		
	}

}
