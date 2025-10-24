package Batch57Project;


public class ContructorOverloading {

	ContructorOverloading(int a)
	{
		System.out.println("my first constructor");
	}
	ContructorOverloading(int a , double b)
	{
		System.out.println("my seconf contructor");
	}
	ContructorOverloading(double a)
	{
		System.out.println("my thirst contructor");
		}
	public static void main(String[] args) {
		System.out.println("we love software testing");
		new ContructorOverloading(1);
		new ContructorOverloading(3,0.04);
		new ContructorOverloading(0.04);
	}
}
