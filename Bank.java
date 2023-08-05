package Gpay;
import Gpay.Gpay;

import java.util.Scanner;

public interface Bank 
{
	void balance();
	void transfer();
}
class SBI implements Bank
{
	static int balance = 2000;
	int amount ;
	int result=0;
	@Override
	public void balance()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Upi pin again");
		int pin=scan.nextInt();
		if(pin==GpayGpinUpin.Gupipin)
		{
			balance = balance-amount;
			System.out.println("The Balance in Your Account is"+" "+balance);
		}
	}

	@Override
	public void transfer() 
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the phone number");
			String  phnno=sc.next();
			if(phnno.length()==10) 
			{
			System.out.println("Enter the amount to transfer");
			int amount = sc.nextInt();
			for(int i=0; i<3;i++)
			{
				if(i==0)
				{
					System.out.println("This is First Chance");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You have Two Chances Left");
					}
				}
				else if(i==1)
				{
					System.out.println("This is your Second chance");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You have only one Chance to  Left");
					}
					
				}
				else if(i==2)
				{
					System.out.println("This is the Final Chance For You");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>=amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You are Chances over");
					}
				}
				
			}
			
			}
		else
		{
			System.out.println(" Please Enter the valid 10 digit phone number");
		}	
	}
}
	

class HDFC implements Bank
{
	static int balance = 5000;
	int amount;
	int result=0;
	@Override
	public void balance()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Upi pin again");
		int pin=scan.nextInt();
		if(pin==GpayGpinUpin.Gupipin)
		{
			balance = balance-amount;
			System.out.println("The Balance in Your Account is"+" "+balance);
		}
	}

	@Override
	public void transfer() 
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the phone number");
			String  phnno=sc.next();
			if(phnno.length()==10) 
			{
			System.out.println("Enter the amount to transfer");
			int amount = sc.nextInt();
			for(int i=0; i<3;i++)
			{
				if(i==0)
				{
					System.out.println("This is First Chance");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You have Two Chances Left");
					}
				}
				else if(i==1)
				{
					System.out.println("This is your Second chance");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You have only one Chance to  Left");
					}
					
				}
				else if(i==2)
				{
					System.out.println("This is the Final Chance For You");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>=amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You are Chances over");
					}
				}
				
			}
			
			}
		else
		{
			System.out.println(" Please Enter the valid 10 digit phone number");
		}	
	}
}
	
class ICICI implements Bank
{
	static int balance = 10000;
	int amount ;
	int result=0;
	@Override
	public void balance()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Upi pin again");
		int pin=scan.nextInt();
		if(pin==GpayGpinUpin.Gupipin)
		{
			balance = balance-amount;
			System.out.println("The Balance in Your Account is"+" "+balance);
		}
	}

	@Override
	public void transfer() 
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the phone number");
			String  phnno=sc.next();
			if(phnno.length()==10) 
			{
			System.out.println("Enter the amount to transfer");
			int amount = sc.nextInt();
			for(int i=0; i<3;i++)
			{
				if(i==0)
				{
					System.out.println("This is First Chance");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You have Two Chances Left");
					}
				}
				else if(i==1)
				{
					System.out.println("This is your Second chance");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You have only one Chance to  Left");
					}
					
				}
				else if(i==2)
				{
					System.out.println("This is the Final Chance For You");
					System.out.println("Re Enter the UPi pin");
					int pin = sc.nextInt();
					Gpay p1 = new Gpay();
					GpayGpinUpin p=new GpayGpinUpin();
					if(GpayGpinUpin.Gupipin==pin)
					{
					if(balance>=amount && balance!=0)
					{
						result =balance-amount;
						System.out.println("balance left in SBI back: "+result);
						balance=result;
						break;
					}
					else
					{
						System.out.println("insufficient amount");
					}
					}
					else
					{
						System.out.println("you have entered worng pin"+"\n Enter correct pin ");
						System.out.println("You are Chances over");
					}
				}
				
			}
			
			}
		else
		{
			System.out.println(" Please Enter the valid 10 digit phone number");
		}	
	}
}
