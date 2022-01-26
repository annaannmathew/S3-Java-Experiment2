import java.util.Scanner;
public class palindromestring
{
    public static void main(String args[])
    {
        String str, rev = "";
        Scanner imp= new Scanner(System.in);
        System.out.println("Enter a string:");
        str =imp.nextLine();
        int length = str.length();
        for (int i=length-1; i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev))
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }
}