package Strings;

//Toggle the case of all characters in a String.

public class ToggleCase
{
    public static String toggleCase(String str)
    {
        for(int i =0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                if(Character.isUpperCase(str.charAt(i)))
                    str = str.substring(0,i)+Character.toLowerCase(str.charAt(i))+ str.substring(i+1);
                else
                    str = str.substring(0,i)+Character.toUpperCase(str.charAt(i))+ str.substring(i+1);
            }

        }
        return str;
    }
    public static void main(String[] args)
    {
        String str = "Predator Op Is L;eGEnd";
        System.out.println("ORIGINAL STRING: "+str);
        System.out.println("TOGGLED STRING: "+toggleCase(str));
    }
}
