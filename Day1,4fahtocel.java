import java.util.*;
class deepak
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the fahrenheit:");
	int f = s.nextInt();
	double c = (f-32)*5/9;
	System.out.println("celcius:"+c);
	}
}