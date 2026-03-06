package StringP;

import java.util.Scanner;

//count number of character
public class Str1{
	
	public static int method1(String a) {
		char[] c=a.toCharArray();
		int count=0;
		for(char x:c) {
			count++;
		}
		return count;
	}
	
	public static void method2(String b) {
		int count=0;
		for(int i=0;i<b.length();i++) {
			count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] agrs) {
	   // String s = "Hellohii";
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    int a=method1(s);
	    System.out.println(a);
	    method2(s);
	    
	}
}
