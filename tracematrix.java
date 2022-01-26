import java.util.*;  
public class tracematrix  
{  
    public static void main(String args[])  
    {  
        int array[][] = new int[5][5];  
        int i, j,row,column;  
        double sum = 0;  
        Scanner imp= new Scanner(System.in);  
        System.out.print("Enter the number of rows: ");  
        row=imp.nextInt();  
        System.out.print("Enter the number of columns: ");  
        column=imp.nextInt();  
        System.out.println("Enter matrix:");  
        for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < column; j++)   
            {  
                array[i][j] =imp.nextInt();
            }  
        }  
        System.out.println("Matrix is\n");  
        for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < column; j++)  
            {  
                System.out.print(array[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
        System.out.println("Trace is ");  
        for(i = 0; i < row; i++)
        {    
            for(j = 0; j < column; j++)  
            {
                if(i==j)  
                {  
                    sum = sum + (array[i][j]);  
                }  
            }  
        }
        System.out.println(sum);
    }
}