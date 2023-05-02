import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternmatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to search");
		String s = sc.next();
		char[] ch = s.toCharArray();
		Pattern small = Pattern.compile("[a-z]", Pattern.CANON_EQ);
		Pattern caps=Pattern.compile("[A-Z]",Pattern.CANON_EQ);
		int smallletter = 0, capsletter = 0, number = 0, specialchar = 0;
		for (int i = 0; i < s.length(); i++) {
				String sm1,sm2,sm3=null;
				sm1=Character.toString(ch[i]);
				sm2=Character.toString(ch[i]);
			Matcher mt = small.matcher(sm1);
			Matcher cp=caps.matcher(sm2);
			boolean sm = mt.find();
			boolean cap1=cp.find();
			if (sm == true) {smallletter++;} 
			if (cap1==true) {capsletter++;}
			
			
			
		}

		System.out.println("Small letter  "+smallletter);
		System.out.println("Caps letter  "+capsletter);
		
		
	System.out.println(valid(smallletter,capsletter));

	}
private static boolean valid(int smallletter,int capsletter) {
	
	if(smallletter>=1 && capsletter>=1)
	{
		return true;
	}
	return false;
}

}
