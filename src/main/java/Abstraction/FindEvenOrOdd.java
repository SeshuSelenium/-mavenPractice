package Abstraction;

import java.util.Scanner;

public class FindEvenOrOdd {
	
	public void m1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any integer valuen");
		int a = s.nextInt();
		
		if(a % 2 ==0) {
			System.out.println(a+ " : it is Even number");   // if it is even number it will print "it is Even number"
		}else {
			System.out.println(a + " : it is Odd number");   // if it is odd number it will print "it is Odd number"
		}
		
		System.out.println(a % 2==0);   // it will return true or false
	}
	

	public static void main(String[] args) {
		FindEvenOrOdd find = new FindEvenOrOdd();   // it is object for this class
		find.m1();    // call method by using object reference

	}

}
