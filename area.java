
public class area {
	area(double s)
	{
		System.out.println("\n area of square : "+(4*s));
	}
	 area(double l, double b)
	 {
		 System.out.println("\n area of rectangle : "+(l*b));
	 }
public static void main(String args[])
{
	area a = new area(4);
	area a1= new area(2.9,4.7);
}
}