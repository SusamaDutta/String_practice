package StringP;
import java.util.Scanner;

//remove space from a string
public class Str3 {
	public static String logic(String s) {
		String r="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				r=r+s.charAt(i);
			}
		}
	return r;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String: ");
		String str=sc.nextLine();
		String s = logic(str);
		System.out.println(s);
	}
}
