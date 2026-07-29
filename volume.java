package OOPSC26CS070;
import java.util.Scanner;
class Box{
	double width;
	double height;
	double depth;
	
	double volume() {
		Scanner sc=new Scanner(System.in);
		System.out.print("width =");
		width=sc.nextInt();
		System.out.print("height =");
		height=sc.nextInt();
		System.out.print("depth =");
		depth=sc.nextInt();
		
		return(width*height*depth);
	}
	
}


public class BoxDemo {
	public static void main(String []args) {
		Box mybox=new Box();
		mybox.width=10;
		mybox.height=20;
		mybox.depth=15;
		double vol=mybox.volume();
		System.out.println("volume is "+vol);
	}
	
}
