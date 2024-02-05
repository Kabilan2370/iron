package com.nor;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		for(int b = 2;count < 10;b++) {
			int store = 0;
			
			for(int c = 2;c < b;c++) {
				if(b % c == 0) {
					store++;
				}
			}
			if(store == 0) {
				System.out.print(b+" ");
				count++;
			}
		}
		
		
	}
}
				
		
		