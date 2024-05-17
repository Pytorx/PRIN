
public class DemoMethoden3
{
	public static double berechnenMittelwert(double z1, double z2)
	{
		double mw = (z1+z2)/2;
		return mw;
	}

	public static void main (String args[])
	{
		double a = 2.4, b = 2.6, c;
		c = berechnenMittelwert(a, b);
		System.out.println(c);
	}
}








