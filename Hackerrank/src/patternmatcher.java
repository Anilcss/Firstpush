import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternmatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to search");
		String s=sc.next();
		Pattern pt=Pattern.compile("[^a-z]",Pattern.CANON_EQ);
		Matcher mt=pt.matcher(s);
		boolean found=mt.find();
		
		System.out.println(found);
		
	}

}
