package OOPSC26CS070;

class Add{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class MethodOverload {
	public static void main(String[] args) {
		Add add=new Add();
		add.add(10,20);
		add.add(10,20,30);
	}

}
