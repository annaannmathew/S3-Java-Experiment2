import java.util.Scanner;
public class multiplymatrix
{  
    public static void main(String args[])
    {
        int a[][]=new int[50][50];  
        int b[][]=new int[50][50];    
        int m,n,i,j;
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        m=imp.nextInt();
        System.out.println("Enter the number of coloumns");
        n=imp.nextInt();
        int c[][]=new int[m][n];
        System.out.println("Enter the elements of 1st matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=imp.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=imp.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {    
            for(j=0;j<n;j++)
            {    
                c[i][j]=0;      
                for(int k=0;k<3;k++)      
                {      
                    c[i][j]+=a[i][k]*b[k][j];      
                } 
                System.out.print(c[i][j]+" ");
            }
            System.out.println();   
        }    
    }
}  