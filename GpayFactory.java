package Gpay;
import java.util.*;
public class GpayFactory 
{
	public void gpayfactory(Bank b)
	{
		b.balance();
		b.transfer();
	}
	
}
class Factory
{
	public static Bank getbank()
	{
		System.out.println("Enter the bank name");
		Scanner sc = new Scanner (System.in);
		String bankname=sc.next();
		if(bankname.equals("SBI"))
		{
			return new SBI();
		}
		else if(bankname.equals("HDFC"))
		{
			return new HDFC();
		}
		else if(bankname.equals("ICICI"))
		{
			return new ICICI();
		}
		else
		{
			System.out.println("Invalid bank name please enter a valid bank name");
		}
		return null;
	}
}
class  MainBank
{
	public static void main(String[]args)
	{
		GpayFactory fac = new GpayFactory();
		Bank b = Factory.getbank();
		fac.gpayfactory(b);
	}
}
