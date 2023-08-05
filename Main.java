package Gpay;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name please");
		String name=scan.nextLine();
		System.out.println("WELCOME TO GOOGLE PAY SERVICES"+" "+name);
		System.out.println("We hope you will like our services");
		System.out.println("Set the Gpin and Upi pin "+"\n For security purpose dont share your Upi pin and Gpi pin to any one"+" "+name);
		int gpin=GpayGpinUpin.Gpin();
		System.out.println(gpin);
		Gpay g =Gpay.getMethod();
		g.setGpin(gpin);
		int gupipin=GpayGpinUpin.Gupipin();
		System.out.println(gupipin);
		Gpay G = Gpay.getMethod();
		G.setGupipin(gupipin);
		

	}

}
