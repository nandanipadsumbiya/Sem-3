import java.util.*;
public class Lab3_14A{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m number");
		int m=sc.nextInt();

		System.out.println("Enter n number");
		int n=sc.nextInt();

		int sum=0;

		for(int i=m;i<=n;i++){
			sum+=i;

		}
		System.out.println("sum = "+sum);
	}
}
