package practice;

import java.util.Scanner;

public class myDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and address : ");
		
		String name = sc.next();
		String address = sc.next();
		long mobile = sc.nextLong();
		
		System.out.println("Name: " + name+ ", Address: " + address+ ", Mobile: " + mobile);
		
		
		
		

	}

}
