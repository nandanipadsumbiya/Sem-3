import java.util.*;
public class Lab3_1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n number");
		int n=sc.nextInt();

		int[]number=new int[n];
		System.out.println("Enter"+n+"number");

		// for(int i=0;i<n;i++){
		// 	number[i]=sc.nextInt();
		// }
		for(int i=0;i<number.length;i++){
			number[i]=sc.nextInt();
			System.out.println("number[i]"+i);
		}

		
	}
}
