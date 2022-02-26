import java.util.Scanner;
public class sumarray
{
    public static void main(String args[])
    {
	int a[]=new int[100];
	int n,i,sum=0;
	Scanner imp=new Scanner(System.in);
	System.out.println("Enter the number");
	n=imp.nextInt();
	System.out.println("Enter the elements of the arary");
	for(i=0;i<n;i++)
	{
	    a[i]=imp.nextInt();
	}
	for(i=0;i<n;i++)
	{
	    sum=sum+a[i];
	}
	System.out.println("Sum is "+sum);
    }
}
