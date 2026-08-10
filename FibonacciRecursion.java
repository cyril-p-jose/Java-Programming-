package OOPSC26CS070;

import java.util.Scanner;
class RecFib{
	static int n1=0,n2=1,n3=0;// for efficient we use static
	void printFib(int count) {
		if(count>0) {
			n3=n1+n2;
			System.out.print(" "+ n3);
			n1=n2;
			n2=n3;
			printFib(count-1);
		}
	}
	
}

public class FibonacciRecursion {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		RecFib ob=new RecFib();
		System.out.println("enter limit:");
		int count=s.nextInt();
		int n1=0,n2=1,n3,i;
		
		System.out.print(n1+ " "+n2);
		ob.printFib(count);
	}

}
