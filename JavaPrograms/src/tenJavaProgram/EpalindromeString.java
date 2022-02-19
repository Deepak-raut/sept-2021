package tenJavaProgram;

public class EpalindromeString {

	public static void main(String[] args) {
		
		String s="deef";
		
		String b="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		
		if(s.equals(b)) 
		{
		   System.out.println(b+"- "+"string is palindrome");
		}
		else
		{
			System.out.println(b+"- "+"string is not palindrome");
		}

	

}}
