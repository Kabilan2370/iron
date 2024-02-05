package com.nor;
import java.util.Scanner;
import java.util.InputMismatchException;

public class swapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner an = new Scanner(System.in);
		
		System.out.println("How many numbers do you want store :");
		int count = an.nextInt();
		int[] add = new int[count];
		
		System.out.println("Enter a numbers :");
		for(int i = 0;i < count;i++) {
			add[i] = an.nextInt();
			
		}
		System.out.println("Your entered values are,....");
		for(int k = 0;k < count;k++) {
			System.out.print(add[k]+" ");
		}
		
	
			
		
			
		
		
		
				

	}

}
