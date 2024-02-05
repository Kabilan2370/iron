package com.nor;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 5;
		 
	      
	      for(int a = 1;a <= n;a++) {
	    	  for(int d = 1;d <= 2*(n-a);d++) {
	    		  System.out.print("+");
	    	  }
	    	  for(int c = 1;c <= a;c++) {
	    		  System.out.print("+ ");
	    	  }
	    	 
	    	 
	    	  System.out.println();
	      }
	      System.out.println("$$$$$$$$$$$$$$$$$$");
	      
	      for(int d = n;d >= 1;d--) {
	    	  for(int e = 2*(n-d);e >= 1;e--) {
	    		  System.out.print("+");
	    	  }
	    	  for(int f = 1;f <= d;f++) {
	    		  System.out.print("* ");
	    	  }
	    	  
	    	  for(int g = 1;g <= d;g++) {
	    		  System.out.print("+ ");
	    	  }
	    	  System.out.println();
	
	      }
	      
	      System.out.println("####################");
	      
	      for(int a = 1;a <= n;a++) {
	    	  for(int b = a;b <= n-1;b++) {
	    		  System.out.print("+ ");
	    	  }
	    	  int k = 1;
	    	  for(int c = 1;c <= a;c++) {
	    		  System.out.print(k+" ");
	    		  k = k + 1;
	    	  }
	    	  
	    	  System.out.println();
	      }
	      
	      System.out.println("########################");
	      
	      for(int a = n;a >= 1;a--) {
	    	  for(int b = 1;b <= a-1;b++) {
	    		  System.out.print("+ ");
	    	  }
	    	  
	    	  for(int c = n;c > a;c--) {
	    		  System.out.print("* ");
	    	  }
	    	  System.out.println();
	      }
	      
	    	 
	   
	    	 
	      
	      
	    

	}

}
