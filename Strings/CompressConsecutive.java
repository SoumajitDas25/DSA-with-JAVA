package Strings;

//Compress a String such that the consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//Input: aaabbbbccddde
//Output: a3b4c2d3e

public class CompressConsecutive
{
    public static String compress(String str)
    {
        if(str.length()==0)
            return "";
        else
        {
            char character = str.charAt(0);
            StringBuilder result=new StringBuilder("");
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                if(character==str.charAt(i))
                    count++;
                else
                {
                    result.append(character);
                    if(count>1)
                        result.append(count);
                    count=1;
                    character=str.charAt(i);
                }
            }
            result.append(character); //for the last character
            if(count>1)
                result.append(count);
            return result+"";
        }
    }
    public static void main(String[] args)
    {
        String str = "aaabbbbccddde";
        System.out.println("Compressed String: "+compress(str));
    }
}
