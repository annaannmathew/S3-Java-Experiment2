import java.util.*;
public class Largematrix
{
    public static void large(int a[][], int m, int n)
    {
        int i = 0, j;
        int max = 0;
        while (i < m)
        {
            for ( j = 0; j < n; j++)
            {
                if (a[i][j] > max)
                {
                    max = a[i][j];
                }
            }
            i++;
        }
        System.out.println("Largest element is "+max);
    }

    public static void main(String[] args)
    {
        int n, m,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of the matrix");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        large(a,m,n);
    }
}
