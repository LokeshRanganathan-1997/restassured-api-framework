package ProgramPractise;

import java.util.*;

public class P2_Occurence {
	public static void main(String[] args) {

		//		String str="Automation";
		//		Map<Character,Integer> map=new HashMap<Character,Integer>();
		//		for(char ch:str.toCharArray()) {
		//			map.put(ch, map.getOrDefault(ch, 0)+1);
		//		}
		//		System.out.println("Character Frequency is :"+map);


		//		String str1="Automation Testing";
		//		Map<Character,Integer>m=new HashMap<Character,Integer>();
		//		for(char c:str1.toCharArray()) {
		//			m.put(c, m.getOrDefault(c, 0)+1);
		//		}
		//		System.out.println("Character Occurence is :"+m);


		//		String str2="Java Programming";
		//		Map<Character,Integer>map=new HashMap<Character,Integer>();
		//		for(char c:str2.toCharArray()) {
		//			map.put(c, map.getOrDefault(c, 0)+1);
		//		}
		//		System.out.println("Count of Each words is :"+map);

		//		String str3="Java Programming";
		//		int count=0;
		//		for(char c:str3.toCharArray()) {
		//			if(c=='J') {
		//				count++;
		//			}
		//		}
		//		System.out.println("Count of J :"+count);

		//		String str4="Java Programming";
		//		int upperCase=0;
		//		int lowerCase=0;
		//		for(char c:str4.toCharArray()) {
		//			if(Character.isUpperCase(c)) {
		//				upperCase++;
		//			}else if(Character.isLowerCase(c)) {
		//				lowerCase++;
		//			}
		//		}
		//		System.out.println("Count of UpperCase :"+upperCase);
		//		System.out.println("Count of LowerCase :"+lowerCase);


		//		String str5="Java Programming";
		//		String upper="";
		//		String lower="";
		//		for(char c:str5.toCharArray()) {
		//			if(Character.isUpperCase(c)) {
		//				upper=upper+c;
		//				
		//			}else if(Character.isLowerCase(c)) {
		//				lower=lower+c;
		//			}
		//		}
		//		System.out.println("LowerCase is :"+lower);
		//		System.out.println("UpperCase is :"+upper);

		//		String str6="Java Programming";
		//		String result=str6.substring(5);
		//		System.out.println("Result is :"+result);
		//		
		//		
		//		String str7="Java Programming";
		//		String[] split = str7.split(" ");
		//		System.out.println("2nd word is :"+split[0]);

		//        String str8="Java Programming";
		//        String result="";
		//        for(char c:str8.toCharArray()) {
		//        	if(result.indexOf(c)==-1) {
		//        		result=result+c;
		//        	}
		//        }
		//        System.out.println("Removed duplicates is :"+result);
		//        
		//        
		//        String str9="aabbccdeeefg";
		//        for(char c:str9.toCharArray()) {
		//        	if(str9.indexOf(c)==str9.lastIndexOf(c)) {
		//        		System.out.println("First Non repeated character is :"+c);
		//        	}
		//        }
		//      
		//Occurence program,
		String str10="aaaAAbbbBBccc2312321312@!@#@#@#CCddDD deEfff ghhhHiiiI";
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(char c:str10.toCharArray()) {
			//if(c!=' ') {
			map.put(c, map.getOrDefault(c, 0)+1);
		}                
		//}
		System.out.println("Occurence is :"+map);


		//Count of UpperCase and LowerCase,
		String str11="aaaAAbbbBBccc2312321312@!@#@#@#CCddDD deEfff ghhhHiiiI";
		int upperCase=0;
		int lowerCase=0;
		for(char d:str11.toCharArray()) {
			if(Character.isUpperCase(d)) upperCase++;
			else if(Character.isLowerCase(d)) lowerCase++;
		}
		System.out.println("Count of UpperCase is :"+upperCase);
		System.out.println("Count of LowerCase is :"+lowerCase);


		//Print UpperCase and LowerCase,
		String str12="aaaAAbbbBBccc2312321312@!@#@#@#CCddDD deEfff ghhhHiiiI";
		String upper="";
		String lower="";
		for(char e:str12.toCharArray()) {
			if(Character.isUpperCase(e)) upper=upper+e;
			else if(Character.isLowerCase(e)) lower=lower+e;
		}
		System.out.println("Values of UpperCase is :"+upper);
		System.out.println("Values of LowerCase is :"+lower);
		
        
		//Count vowels,
		String str13="aaaAAbbbBBccc2312321312@!@#@#@#CCddDD deEfff ghhhHiiiI";
        int count=0;
        for(char f:str13.toCharArray()) {
        	if("AEIOUaeiou".indexOf(f)!=-1) {
        		count++;
        	}
        }
    	System.out.println("Vowels count is :"+count);
    	
    	
    	//Print vowels,
		String str14="aaaAAbbbBBccc2312321312@!@#@#@#CCddDD deEfff ghhhHiiiI";
        String vowels="";
        for(char g:str14.toCharArray()) {
        	if("AEIOUaeiou".indexOf(g)!=-1) {
        		vowels=vowels+g;
        	}
        }
        System.out.println("Vowels print :"+vowels);
	}
}
