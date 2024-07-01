import java.util.*;
public class Lab1_10C{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter days");
		int ds=sc.nextInt();

		int y= ds/365;
		int w= (ds-(y*365))/7;
		int d=ds-((y*365)+(w*7));

		System.out.println("ans = "+y+"year , " +w+"week ,"+d+"day");
	}
}