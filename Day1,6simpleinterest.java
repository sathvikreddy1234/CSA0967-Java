import java.util.*;
class deepak
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the principle:");
	int p = s.nextInt();
	System.out.println("Enter the time:");
	int t = s.nextInt();
	System.out.println("Enter the rate of interest:");
	int r = s.nextInt();
	double si = p*t*r/100;
	System.out.println("simple interest:"+si);
	}
}
