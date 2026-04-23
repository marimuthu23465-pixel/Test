package com.mycompany.stringoperations;


// StringOperations.java
public class StringOperations
{

    // Find Duplicate Characters
    public String duplicate(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i + 1; j < str.length(); j++) 
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    result = result + str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }

    
    public String removeSpace(String str)
    {
        return str.replace(" ", "");
    }

    
    public String reverse(String str)
    {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}