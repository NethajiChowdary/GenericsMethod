package generics;

public class PrintArray
{
	public static void main(String[] args)
	{	
		float x =10.5f , y = 27.8f , z = 76.5f;
		if ( x>y && x>z )
		System.out.println(x+ " is the largest number");
		else if ( y>x && y>z)
		System.out.println(y+  " is the largest number");
		else
		System.out.println(z+  " is the largest number");
	}
}	
		