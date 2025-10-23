package ProgramPractise;

public class P1_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method-1,
		String str="Automation";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is :"+rev);

		
		//Method-2,
		String str1="Automation";
		StringBuilder sb=new StringBuilder(str1);
		System.out.println("Reveresd String is :"+sb.reverse());

		
		//Method-3,
		String str2="Automation";
		char[] charArray = str2.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}
}
