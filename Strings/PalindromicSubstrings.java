package Strings;

public class PalindromicSubstrings
{
    public static boolean isPalindrome(String str)
    {
        int start=0,end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static int findNoOfPalindromicSubstrings(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                if(isPalindrome(str.substring(i,j)))
                {
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        String str = "abbd";
        System.out.println("\nNo of Palindromic Substrings: "+findNoOfPalindromicSubstrings(str));
    }
}
