import java.util.Scanner;
public class replacechar
{
   public static void main(String args[])
   {
        String str;
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter the String");
        str=imp.nextLine();
        int length = str.length();
        System.out.println("Enter the character to be searched");
        char ch=imp.next().charAt(0);
        System.out.println("Enter the character to be replaced");
        char replace=imp.next().charAt(0);
        String replaceString=str.replace(ch,replace);
        System.out.println("New String is "+replaceString);
   }
}