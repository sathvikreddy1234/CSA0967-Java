import java.util.*;
class deepak
{
public static void main(String args[])
	{
	double q,r;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of A:");
	int a = s.nextInt();
	System.out.println("Enter the value of B:");
	int b = s.nextInt();
	q = a/b;
	r = a%b;
	System.out.println("The Quotient and Remainder:"+q+","+r+"");
	}
}
