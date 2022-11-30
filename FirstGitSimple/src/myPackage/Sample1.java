package myPackage;

import java.util.Scanner;

public class Sample1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		 System.out.println("Enter your Name");
		 String name = sc.nextLine();
		 System.out.println("Welcome "+name+" in Axis Bank ");
		 
		 System.out .println("Enter your Id ");
		 String Aa = sc.nextLine();
		 System.out.println("Your ID is : " +Aa);
		 
		 sc.close();
	}

}
