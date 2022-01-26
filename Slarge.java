import java.util.Scanner;
public class Slarge
{
    public static int getSecondLargest(int[] a,int total)
    {
        int temp;
        for (int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String args[])
    {
        int a[]=new int[100];
        int n,i;
        Scanner imp = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n=imp.nextInt();
        System.out.println("Enter the elements in the array");
        for(i=0;i<n;i++)
        {
            a[i]=imp.nextInt();
        }
        
        System.out.println("Second Largest: "+getSecondLargest(a,n));
    }
}
