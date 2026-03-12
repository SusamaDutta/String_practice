package StringP;

//Check the given string is valid password or not.
public class Str5 {
	
	public static boolean validPasswordOrNot(String s) 
{
	int countLower=0,countUpper=0,countNumber=0,countSpecial=0;
	
	for(char c:s.toCharArray())
{
		if(c>='0' && c<='9') {
			countNumber++;
		}
		else if(c>='A' && c<='Z') {
			countUpper++;
		}
		else if(c>='a' && c<='z') {
			countLower++;
		}
		else {
			countSpecial++;
		}
}
	if(s.length()>=8 && countSpecial>=1 && countNumber>=1 && countUpper>=2 && countLower>=2)
	
		return true;	
	else 
		return false;
	
	}

	public static void main(String[] args) {

		String s = "pintu0101@gmaile.com";
		System.out.print(validPasswordOrNot(s));
	}

}
