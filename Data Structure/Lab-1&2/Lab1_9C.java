import java.util.*;
public class Lab1_9C{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter time in seconds");
		int ts=sc.nextInt();

		
		int h=ts/3600; 
		int m=(ts-(h*3600))/60; 
		int s=ts-((h*3600)+(m*60));




		System.out.println("hours:minutes:seconds="+h+":"+m+":"+s);
	}
}