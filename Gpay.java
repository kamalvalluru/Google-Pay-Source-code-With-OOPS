package Gpay;

public class Gpay 
{
	public static final String s = null;
	private int gpin;
	private int gupipin;
	private static Gpay i = null;
	Gpay()
	{
		
	}
	public static Gpay getMethod()
	{
		if(i==null)
		{
			i= new Gpay();
		}
		return i;
	}
	public int getGpin() 
	{
		return gpin;
	}
	public void setGpin(int gpin) 
	{
		this.gpin = gpin;
	}
	public int getGupipin() 
	{
		return gupipin;
	}
	public void setGupipin(int gupipin) 
	{
		this.gupipin = gupipin;
	}
	
}
