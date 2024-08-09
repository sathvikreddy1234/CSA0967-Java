import java.util.*;
class deepak
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int rev=0,i,n;
	System.out.println("Enter the number:");
	n=s.nextInt();
	while (n!=0)
	{	
	i=n%10;
	rev=rev*10+i;
	n=n/10;
	}
	System.out.println("The number after reverse:"+rev);
	}
}