import java.util.Scanner;

public class wordcount {
		public static void main(String[] args) {
			Scanner ip=new Scanner(System.in);
			System.out.println("Enter the word to count");
			String s=ip.nextLine();
			int count=s.split("\\s").length;
			System.out.println(count);
System.out.println("Test for git pull");
		}
}
