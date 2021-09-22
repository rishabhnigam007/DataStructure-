import java.util.*;

public class Shortest_String_palindrome 
{
    static String shortestPalindrome(String s) 
    {
	if (s == null || s.length() <= 1)
		return s;
 
	String result = null;
	int len = s.length();
	int mid = len / 2;	
        
	for (int i = mid; i >= 1; i--) 
        {
            if (s.charAt(i) == s.charAt(i - 1)) 
            {
		if ((result = scanFromCenter(s, i - 1, i)) != null)
                    return result;
            }
            else 
            {
		if ((result = scanFromCenter(s, i - 1, i - 1)) != null)
                    return result;
            }
	}
	return result;
    }
 
    private static String scanFromCenter(String s, int l, int r) 
    {
	int i = 1;
    	//scan from center to both sides
	for (; l - i >= 0; i++) 
        {
            if (s.charAt(l - i) != s.charAt(r + i))
			break;
	}
	//if not end at the beginning of s, return null 
	if (l - i >= 0)
            return null;
	StringBuilder sb = new StringBuilder(s.substring(r + i));
        	sb.reverse();
	return sb.append(s).toString();
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string :");
        String s=sc.next();
        String palindrome = shortestPalindrome(s);
        System.out.println("Shortest Palindrome : "+palindrome);
    }
}