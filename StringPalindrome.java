package week1.day2;

public class StringPalindrome {
public static void main(String[] args) {
	

	String s1="madam";
	String s2="";
	int len=s1.length();
	for(int i=len-1;i>=0;i--)
		{
		s2=s2+s1.charAt(i);
		}
	if(s1.equals(s2))
		
		{System.out.println("palindrome");} 
	else {System.out.println("not palindrome");
	}
	}
}
