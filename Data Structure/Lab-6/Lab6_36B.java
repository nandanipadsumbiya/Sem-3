import java.util.*;
public class Lab6_36B{

	public static void Celsius(double t){
	double cel=(t-32)*5/9;
	System.out.println("Celsius" +cel);
	}

	public static void Fahrenhit(double t){
	double fah=t*(9/5)+32;
	System.out.println("Fahrenhit" +fah);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter c change the Fahrenhit and Enter f change the celsius");
		String c=sc.nextLine();
		System.out.println("Enter temperature : ");
		double t=sc.nextDouble();
		if(c.equals("c")){
			Celsius(t);
		}
		if(c.equals("f")){
			Fahrenhit(t);
		}
	}
}