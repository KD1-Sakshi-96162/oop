import java.util.Scanner;
public class Program10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("num : ");
	int num=sc.nextInt();
	System.out.println("num : " + num);
	
	String binary =Integer.toBinaryString(num);
	System.out.println("num : " + binary);
	
	String octal=Integer.toOctalString(num);
	System.out.println("num : " +octal);
	
	String hex=Integer.toHexString(num);
	System.out.println("num : " +hex);
	
	
}
}
