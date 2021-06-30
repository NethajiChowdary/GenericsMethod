package generics;

public class PrintArray
{
	public static void main(String[] args)
	{	
	String s1 = "Apple";
	String s2 = "Banana";
	String s3 = "Pineapple";
	if (s1.length() > s2.length() && s1.length() > s3.length())
		System.out.println("Largest String is "  +s1);
	else if (s2.length() > s1.length() && s2.length() > s3.length())
		System.out.println("Largest String is "  +s2);
	else
		System.out.println("Largest String is "  +s3);
	}
}	
		