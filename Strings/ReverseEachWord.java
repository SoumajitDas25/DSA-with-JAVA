package Strings;

public class ReverseEachWord
{
    public static StringBuilder reverse(String str)
    {
        StringBuilder result = new StringBuilder("");
        StringBuilder reverseWord = new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                reverseWord.append(str.charAt(i));
            }
            else {
                reverseWord.reverse();
                result.append(reverseWord+" ");
                reverseWord.delete(0, reverseWord.length()); //to empty the mutable String
            }
        }
        reverseWord.reverse();
        result.append(reverseWord); //to append the final word
        return result;
    }
    public static void main(String[] args)
    {
        String str = "DSA Is Fun  With Java";
        System.out.println("\nResult: "+reverse(str));
    }
}