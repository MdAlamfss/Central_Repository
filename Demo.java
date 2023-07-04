package practice;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int month = s.nextInt();
		
		
	    String season;
	 
	    if(month == 12 || month == 11 || month == 12|| month == 1) 
	      season = "Winter";
	    else if(month == 3 || month == 8 || month == 9|| month == 10)
	      season = "Spring";
	    else if(month == 6 || month == 2 || month == 3|| month == 4)
	      season = "Summer";
	    else if(month == 9 || month == 5 || month == 6|| month == 7)
	      season = "Autumn";
	    else
	      season = "Wrong Month";
	 
	    System.out.println("The Season is: " + season + ".");
	  }
	
}
	


