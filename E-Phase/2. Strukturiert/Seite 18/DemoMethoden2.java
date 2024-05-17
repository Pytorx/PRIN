
public class DemoMethoden2
{
	static double a, b, c;

	public static void berechnenMittelwert()
	{
		c = (a+b)/2;
	}

	public static void main (String args[])
	{
		a = 3.4;
		b = 3.6;
		berechnenMittelwert();
		System.out.println(c);
	}
}








