import java.util.*;
public class Lab1_5A{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);

		System.out.println("Enter n number : ");
		int n=sc.nextInt();

		int ans=fact(n);
		System.out.println("answer="+ans);
	}
	static int fact(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}