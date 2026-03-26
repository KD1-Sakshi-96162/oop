import java.util.Scanner;
public class Assignment 
{
	public static void main(String[] args)
	{
		double dPrice = 40.0, sPrice = 10.0, iPrice = 30.0, total = 0;
		int bill=0;
		int choice=0;
		int Quantity;
		Scanner sc=new Scanner(System.in);
		while(choice!=3) 
		{
			
			System.out.print("Enter 1.Idli(40),2.samosa(10),3.pizza(30), . to exit");
			System.out.print("Choice: ");
            choice = sc.nextInt();
		switch(choice) 
		{
		
		case 1:
			System.out.println("Quantity: ");
			Quantity=sc.nextInt();
			total +=Quantity*dPrice;
			System.out.println("total : " +total);
		break;
		case 2:
			System.out.println("Quantity: ");
			Quantity=sc.nextInt();
			total +=Quantity*sPrice;
			System.out.println("total : " +total);
			break;
			
		case 3:
			System.out.println("Quantity: ");
			Quantity=sc.nextInt();
			total +=Quantity*iPrice;
			System.out.println("total : " +total);
			break;
			
		default:
			System.out.println("Invalid choice");
			
		   }
		 System.out.println("Total: ₹" + total);
		}
	}

}
