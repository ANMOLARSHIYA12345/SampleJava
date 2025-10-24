package Batch57Project;

public class Fifth {
	Fifth(int a)
	{
		System.out.println("My First Constructor");
	}
	Fifth(int a, double b)
	{
		System.out.println("My Second contructor");
	}
	Fifth(int a, double b, char c)
	{
		System.out.println("My third contructor");
	}

	public static void main(String[] args) {
System.out.println("my fourth consructor");
new Fifth(30);
new Fifth(40,0.05);
new Fifth(24,0.02,'A');
	}

}
