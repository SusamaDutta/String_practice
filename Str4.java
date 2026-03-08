package StringP;

//Count number of vowels ,consonants, numbers, special characters
public class Str4 {
	public static void Logic(String s) {
		
		int vowels=0,consonants=0,numbers=0,special=0;
		
		for(int i=0; i< s.length();i++) {
			
			char c = s.charAt(i);
		
		if('a'==c||'e'==c||'i'==c||'o'==c||'u'==c) {
			vowels++;
		}
		else if('a'<=c && 'z'>=c) {
			consonants++;
		}
		else if('0'<=c && '9'>=c) {
			numbers++;
		}
		else {
			special++;
		}
	  }	
		System.out.println("vowels: "+vowels);
		System.out.println("consonants: "+consonants);
		System.out.println("numbers: "+numbers);
		System.out.println("special: "+special);
	}
	
	public static void main(String []arg) {
		String string = "Susama100@gmail.com!";
		string = string.toLowerCase();
		Logic(string);
	}
}

output:
vowels: 6
consonants: 8
numbers: 3
special: 3
