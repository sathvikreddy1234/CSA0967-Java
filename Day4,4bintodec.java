import java.util.*;
import java.lang.Math;
class deepak
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int rem,sum=0,k=0,n,c=0;
	System.out.println("Enter the Binary Number:");
	n=s.nextInt();
	c=n;
	System.out.println(n);
	n=c;
	while(n!=0)
	{
	rem=n%10;
	sum+=rem*Math.pow(2,k);
	k++;
	n=n/10;
	}
	System.out.println("The Decimal Number:"+sum);
	}
}
