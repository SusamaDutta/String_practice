package StringP;
import java.util.Scanner;

//count the char excepts spaces
public class Str2 {
	
	public static int logic(String s) {
		int count =  0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		return count;
	}
	
	public static int logic2(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return s.length()-count;
	}
	
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		int c=logic(str);
		int d = logic2(str);
		System.out.println("Logic : "+c);
		System.out.println("Logic2 : "+d);
		
	}

}
