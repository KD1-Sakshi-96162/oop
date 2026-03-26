
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] arg)
	{
		double num1=0.0;
		double num2=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 : ");
		num1=sc.nextDouble();
		System.out.println("enter num2 : ");
		num2=sc.nextDouble();
		double avg=(num1+num2)/2;
		System.out.println("avg : " +avg);
		if(!sc.hasNextInt())
		{
			if(sc.hasNextDouble())
			{
				num1=sc.nextDouble();
			}
			
		}
			
	}

}
