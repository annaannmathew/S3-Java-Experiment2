import java.util.Scanner;
public class transpose
{  
    public static void main(String args[])
    { 
        int original[][]=new int[50][50];
        int m,n,i,j;
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        m=imp.nextInt();
        System.out.println("Enter the number of coloumns");
        n=imp.nextInt();
        int transpose[][]=new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                original[i][j]=imp.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {    
            for(j=0;j<n;j++)
            {    
                transpose[i][j]=original[j][i];  
            }    
        }
        System.out.println("Orginal Matrix\n");  
        for(i=0;i<m;i++)
        {    
            for(j=0;j<n;j++)
            {    
                System.out.print(original[i][j]+" ");    
            }    
            System.out.println();   
        }    
        System.out.println("Transpose Matrix\n");  
        for(i=0;i<m;i++)
        {    
            for(j=0;j<n;j++)
            {    
                System.out.print(transpose[i][j]+" ");    
            }    
            System.out.println();   
        }    
    }
}  