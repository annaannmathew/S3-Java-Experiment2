import java.util.Scanner;
public class searchchar
{
   public static void main(String args[])
   {
        String str;
        int flag=0;
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter the String");
        str=imp.nextLine();
        int length = str.length();
        System.out.println("Enter the character to be searched");
        char ch=imp.next().charAt(0);
        for(int i=0;i<length;i++)
        {
            if(str.charAt(i)==ch)
            {
		flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Character found");
        }
        else
            System.out.println("Character not found");
   }
}