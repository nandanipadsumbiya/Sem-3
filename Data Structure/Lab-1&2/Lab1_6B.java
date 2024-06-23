import java.util.*;
public class Lab1_6B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a=sc.nextInt();

		System.out.println("Enter b number : ");
		int b=sc.nextInt();

		float result=1;

		for(int i=0;i<b;i++){
			result*=a;
		}
		System.out.println(" ans :"+result);
	}
}
