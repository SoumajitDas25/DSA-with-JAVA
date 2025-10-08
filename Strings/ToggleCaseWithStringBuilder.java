package Strings;

public class ToggleCaseWithStringBuilder
{
    public static StringBuilder toggleCase(String s)
    {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                    str.setCharAt(i,Character.toLowerCase(ch));
                else
                    str.setCharAt(i,Character.toUpperCase(ch));
            }
        }
        return str;
    }
    public static void main(String[] args)
    {
        String str = "DsA With #JAva";
        System.out.println("ORIGINAL STRING: "+str);
        System.out.println("TOGGLED STRING: "+toggleCase(str));
    }
}
