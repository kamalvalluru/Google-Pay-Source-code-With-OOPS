package Gpay;
import Gpay.Bank;
import java.util.*;
public class  GpayGpinUpin
{
	static int Gpin;
	static int Gupipin;
	public static int Gpin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the gpin ");
		Gpin = sc.nextInt();
		int gpinc=Gpin;
		int temp=Gpin;
		int count = 0;
		while(gpinc>0)
		{
			if(Gpin>0)
			{
			count++;
			gpinc/=10;
			}	
		}
		if (count==4)
		{
			while(true)
			{
			System.out.println("Re-enter the gpin to confirm");
			int  confirmgpin=sc.nextInt();
			if(confirmgpin==Gpin)
			{
				System.out.println("gpin Set successfully");
				break;
				
			}
			else
			{
				System.out.println("Please enter the password as you entered before one ");
			}
			}
		}
		else
		{
			System.out.println("Please enter 4 character pin");
		}
	return Gpin;
	}
	
	public static int Gupipin()
	{	boolean flag=true;
		while(flag)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the gupipin ");
			Gupipin = sc.nextInt();
			int gupipinc=Gupipin;
			int temp=Gupipin;
			int count = 0;
			while(gupipinc>0)
			{
				if(gupipinc>0)
				{
				count++;
				gupipinc/=10;
				}	
			}	
			if (count==6)
			{
				while(true)
				{
				System.out.println("Re-enter the gupipin to confirm");
				int  confirmgupipin=sc.nextInt();
				if(confirmgupipin==Gupipin)
				{
					System.out.println("Upipin Set successfully");
					while(true)
					{
					System.out.println("Please select the bank which u need to go ");
					System.out.println("press 1 : SBI"+"\n press 2 :HDFC"+"\n press 3: ICICI");
					int choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("choose the option");
						System.out.println("press 1 : checkbalance"+"\n press 2 : transfer");
						int ch=sc.nextInt();
						SBI s=new SBI();
						switch(ch)
						{
						case 1: s.balance();
						break;
						case 2: s.transfer();
						break;
						
						}
						break;
					case 2:
						System.out.println("choose the option");
						System.out.println("press 1 : checkbalance"+"\n press 2 : transfer");
						int ch2=sc.nextInt();
						HDFC h=new HDFC();
						switch(ch2)
						{
						case 1: h.balance();
						break;
						case 2: h.transfer();
						break;
						
						}
						break;
					case 3:
						System.out.println("choose the option");
						System.out.println("press 1 : checkbalance"+"\n press 2 : transfer");
						int ch3=sc.nextInt();
						 ICICI c=new ICICI();
						switch(ch3)
						{
						case 1: c.balance();
						break;
						case 2: c.transfer();
						break;
						
						}
						break;
					}
					}	
				}
				else
				{
					System.out.println("Please enter the password as you entered before one ");
				}
				}
			}
			else
			{
				System.out.println("Please enter 6 character pin");
			}
			
			
		}	
	int temp=Gupipin;
	return temp;
	}

}