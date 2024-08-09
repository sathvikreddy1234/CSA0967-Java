import java.util.*;
class deepak
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int m=s.nextInt();
	int rem,num,k;
	num=0;
	while (m!=0)
	{
	rem=m%10;
	num=num+rem;
	m=m/10;
	}
	k=num;
	System.out.println("Sum of digits:"+k);
	}
}