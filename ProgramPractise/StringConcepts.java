package ProgramPractise;

import java.util.Arrays;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Programming";
		System.out.println("Length is :"+str.length());
		System.out.println("Char at 5 :"+str.charAt(5));
		System.out.println("Substring :"+str.substring(0, 5));
		System.out.println("Contains :"+str.contains("Pro"));
		System.out.println("Starts with :"+str.startsWith("Java"));
		System.out.println("Ends with :"+str.endsWith("ing"));
		
		//Comparison,
		String s1="Test";
		String s2="test";
		System.out.println("Equals :"+s1.equals(s2));
		System.out.println("EqualsIgnore :"+s1.equalsIgnoreCase(s2));
		
		//Replace and Split
		String replaced = str.replace("Java", "Core_Java");
		System.out.println("Replace String is :"+replaced);
		String[] splited = str.split(" ");
//		System.out.println("Splitted is :"+splited);
		for(String splits:splited) {
			System.out.println(splits);
		}
		
		//Trim and CaseSensitive,
		String s3=" Hello world ";
		System.out.println("Trimmed :"+s3.trim());		
		System.out.println("UpperCase is :"+s3.toUpperCase());
		System.out.println("LowerCase is :"+s3.toLowerCase());
		
		//StringBuilder
		StringBuilder sb=new StringBuilder("Welcome");
		sb.append(" Lokesh");
		sb.insert(0, "Hello");
		sb.replace(0, 5, "Hello  MR");
		sb.reverse();
		System.out.println("StringBuilder content is :"+sb.toString());
		

	}

}
