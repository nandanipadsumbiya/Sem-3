import java.util.*;
public class Lab1_11C{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number");
		int n=sc.nextInt();

		int sum=0;
		int a=0;

		for(int i=1;i<=n;i++){
			a+=i;
			sum+=a;
		}
		System.out.println(" sum ="+sum);

	}
}