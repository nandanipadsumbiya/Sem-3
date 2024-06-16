import java.util.*;
public class Lab3_3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n number");
		int n=sc.nextInt();

        
		
		int sum=0;
		double average=0;

		for(int i=1;i<=n;i++){
			sum+=i;
		}
	      average=(double)sum/ (double) n;

		System.out.println("Average ="+ average);
    }

}
