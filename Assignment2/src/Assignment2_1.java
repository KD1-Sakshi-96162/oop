import java.util.Scanner;


class Invoice {
private String part_number;
private String description;
private int quantity;
private double price;
public Invoice() {
}
public Invoice(String part_number, String description, int quantity, double price) {
	super();
	this.part_number = part_number;
	this.description = description;
	this.quantity = quantity;
	this.price = price;
}
public String getPart_number() {
	return part_number;
}
public void setPart_number(String part_number) {
	this.part_number = part_number;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	if(quantity>0)
	{
		this.quantity=quantity;
	}
	else
	{
		this.quantity=0;
	}
//	public double calinvoice() {
//		return quantity*price;
//	}
}

public double calculateinvoice()
{
	return quantity*price;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	if(price>0)
	{
		this.price=price;
	}
	else
	{
		this.price=0;
	}
}
}

class InvoiceTest{
	Invoice invoice=new Invoice();
	public void acceptRecord(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("part_number :");
		String part_number=sc.nextLine();
		invoice.setPart_number(part_number);
		
		System.out.println("description : ");
		String description=sc.nextLine();
		invoice.setDescription(description);
		
		System.out.println("quantity : ");
		int quantity=sc.nextInt();
		invoice.setQuantity(quantity);
		
		System.out.println("price : ");
		double price=sc.nextDouble();
		invoice.setPrice(price);
	}
	public void printRecord() {
		System.out.println("part_number : " + invoice.getPart_number());
		System.out.println("description : " +  invoice.getDescription());
		System.out.println("quantity : " + invoice.getQuantity());
		System.out.println("price : " +invoice.getPrice());
	}
	public void calculate()
	{
		System.out.println("total invoice calculate"+invoice.calculateinvoice());
	}
	
}

public class Assignment2_1{
	public static void main(String[] args) {
		InvoiceTest invoiceTest=new InvoiceTest();
		invoiceTest.acceptRecord();
		invoiceTest.printRecord();
		invoiceTest.calculate();
		invoiceTest.printRecord();
	}
}
