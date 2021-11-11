package week1.day2;

public class FindTypes {
	public static void main(String[] args) {
		String test="$$ welcome to the 2nd automation class $$";
		int letter=0,space=0,num=0,specialcharacter=0,count=0;
		char[] ch=test.toCharArray();
		int len=ch.length;
		for (int i = 0; i < len; i++)
		{
			if(Character.isLetter(ch[i]))
			{
			letter++;
				
			}
			else if(Character.isDigit(ch[i]))
			{
			num++;
			}
			else if(Character.isWhitespace(ch[i]))
			{
				space++;
			}
			else 
			{
				specialcharacter++;
			}
			}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialcharacter);
		
		}
	}


