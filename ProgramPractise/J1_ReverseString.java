package ProgramPractise;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class J1_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reverse whole String and check whether it is palindrome
		String str="Java Programming";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("ReversedString is :"+rev);		
		if(str.equals(rev)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
		
		//Reverse 2nd String
		String str1="Selenium Automation";
		System.out.println(str1.trim());
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(0, 5));
		String[] splitted = str1.split(" ");
		System.out.println(Arrays.toString(splitted));
		String s1=splitted[0];
		String s2=splitted[1];
		String rever="";
		for(int i=s2.length()-1;i>=0;i--) {
			rever=rever+s2.charAt(i);
		}
		
		String result=s1+" "+rever;
		System.out.println("Reversed String is :"+result);
		
		//Count Strings
		String str2="Cucumber FrameWork";
		System.out.println("Total count of String is :"+str2.length());
		String[] words = str2.split(" ");
		
		System.out.println("Length of first word is :"+words[0].length());
		System.out.println("Length of second word is :"+words[1].length());
		
		int lowerCase=0;
		int upperCase=0;
		for(char ch:str2.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				upperCase++;
			}else if(Character.isLowerCase(ch)){
				lowerCase++;
			}
		}
		
		System.out.println("Total Count of LowerCase is :"+lowerCase);
		System.out.println("Total Count of UpperCase is :"+upperCase);
		
	   //Count specific word,
		String str3="Pproggrammmmingg";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(char ch:str3.toCharArray()) {
			set.add(ch);
		}
		
		System.out.println("To charArray is :"+set);
		
		StringBuilder sb=new StringBuilder();
		for(char ch:set) {
			sb.append(ch);
		}
		System.out.println("Removed Duplicate :"+sb.toString());
	}	
}
