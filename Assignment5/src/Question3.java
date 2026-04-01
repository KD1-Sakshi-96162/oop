import java.util.Scanner;
public class Question3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string : ");
	String str=sc.nextLine();
	str=str.trim();
	String[] string=str.split("\\s+");
	int count=string.length;
	System.out.println("number of words: " + count);
}
}
