package generics;

public class PrintArray 
{
	public static <T extends Comparable<T>>T maximum(T x, T y, T z)
	{
		T max = x;
		
		if ( y.compareTo(max) > 0) 
				max = y;
		
		if ( z.compareTo(max) > 0)
		        max = z;
		
		return max;
	}
	public static void main(String[] args)
	{
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 23,55,64, maximum(23,55,64));
		System.out.printf("Maximum of %.1f,%.1f and %.1f is %.1f\n\n", 4.5,6.4,77.4, maximum(4.5,6.4,77.4));
		System.out.printf("Maximum of %s,%s and %s is %s\n", "Mac","Windows","Linux", maximum("Mac","Windows","Linux"));
		
	}
}	
		