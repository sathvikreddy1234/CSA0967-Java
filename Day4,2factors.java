import java.util.*;
class deepak
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int i,j,k=0,n;
	System.out.println("Enter the number:");
	n=s.nextInt();
	System.out.println("Factors of "+n);
	for (i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	System.out.println(i);
	}
	}
	}
}
	