import java.util.*;
public class Lab4_22A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n number : ");
		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++){

			arr[i]=sc.nextInt();
		}
		

		for ( int i=0;i<n;i++){
			System .out.println("Enter arr["+i+"]=" +arr[i]);
		}

		System.out.println("Enter a index : ");
		int index=sc.nextInt();
		
		int arr1[]=new int[n-1];

			for(int i=0;i<index;i++){
			    arr1[i]=arr[i];
			}

			for(int i=index;i<n-1;i++){
				arr1[i]=arr[i+1];
			}
			
		

		for ( int i=0;i<n-1;i++){
			System.out.println("Enter arr1["+i+"]=" +arr1[i]);
		}

	}
}