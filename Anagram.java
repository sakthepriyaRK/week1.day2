package week1.day2;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="stops";
	String s2="posts";
	int l1=s1.length();
	int l2=s2.length();
	if(l1==l2)
	{
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println( ch1);
		System.out.println( ch2);
	if(Arrays.equals(ch1,ch2))
		{
System.out.println("anagram");
	}
	else {System.out.println("not");
	}
	}
	else
{ 
		System.out.println("length not equal");
		}
	}}

