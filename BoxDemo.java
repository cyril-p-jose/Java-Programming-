package OOPSC26CS070;
import java.util.Scanner;
class Box{
	double width,height,depth;
	//no arg constructor
	/*Box()
	{
		height=2;
		width=4;
		depth=5;
	}
	*/
	Box(double height,double width,double depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	
	double calculateVolume() {
		
		
		return(width*height*depth);
	}
	
}


public class BoxDemo {
	public static void main(String []args) {
		
		Box mybox=new Box(5,10,15);
		Box mybox1=new Box(5,3,15);
		Box mybox2=new Box(5,10,8);
		
		double volume=mybox.calculateVolume();
		double volume1=mybox1.calculateVolume();
		double volume2=mybox2.calculateVolume();
		
		System.out.println("volume is "+volume);
		System.out.println("volume is "+volume1);
		System.out.println("volume is "+volume2);
	}
	
}
