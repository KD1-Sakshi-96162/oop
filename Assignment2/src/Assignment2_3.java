import java.util.Scanner;
class Date{
	public int day;
	public int month;
	public int year;
	
public Date()
{
	
}

public Date(int day,int month,int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
}

public void setday(int day)
{
	this.day=day;
}

public int getday()
{
	return this.day;
}

public void setmonth(int month)
{
	this.month=month;
}

public int getmonth()
{
	return this.month;
}

public void setyear(int year)
{
	this.year=year;
}

public int getyear()
{
	return year;
}
	
public void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("day : ");
	day=sc.nextInt();
	
	
	System.out.println("month : ");
	month=sc.nextInt();
	
	System.out.println("year : ");
	year=sc.nextInt();
}//end of accept

public void display()
{
	System.out.println(  day +"/ " +month +"/" +year );
	
}

}//end of Date class
public class Assignment2_3 {
	public static void main(String[] args)
	{
		Date d=new Date();
		d.accept();
		d.display();
	}

}
