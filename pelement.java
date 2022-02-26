import java.util.Scanner;
public class pelement
{
    public static void main(String args[])
    {
	int a[]=new int[100];
	int n,i,replace,c;
	Scanner imp =new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	n=imp.nextInt();
	System.out.println("Enter the elements");
	for(i=0;i<n;i++)
	{
	    a[i]=imp.nextInt();
	}
	System.out.println("Enter the position of the element");
	c=imp.nextInt();
	System.out.println("Enter the new element");
	replace=imp.nextInt();
	a[c-1]=replace;
	System.out.println("New Array");
	for(i=0;i<n;i++)
	{
	    System.out.println(a[i]);
	}
    }
}
