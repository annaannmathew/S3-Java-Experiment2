import java.util.Scanner;
public class smallarray
{
    public static void main(String args[])
    {
	int a[]=new int[100];
	int n,i,small;
	Scanner imp=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	n=imp.nextInt();
	System.out.println("Enter the elements");
	for(i=0;i<n;i++)
	{
	    a[i]=imp.nextInt();
	}
	small=a[0];
	for(i=1;i<n;i++)
	{
	    if(a[i]<small)
	    {
		small=a[i];
		break;
	    }
	}
	System.out.println("Smallest element "+small);
    }
}
