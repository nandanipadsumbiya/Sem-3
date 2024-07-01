import java.util.*;
public class Lab6_33A{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number");
		int n=sc.nextInt();

		System.out.println("Enter second number");
		int m=sc.nextInt();

		swap(n,m);
	}
	public static void swap(int n,int m ){
		int temp;
		temp=n;
		n=m;
		m=temp;
         System.out.println( "final ans");
		System.out.println(n);
		System.out.println(m);
	}
}