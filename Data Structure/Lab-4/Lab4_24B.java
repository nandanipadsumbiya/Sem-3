import java.util.*;
public class Lab4_24B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a length of array : ");
		int n=sc.nextInt();

		int arr[]=new int[n];

		for (int i=0;i<n;i++){
			System .out.println("Enter array element  arr["+i+"]=" );
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a delete num : ");
		int num=sc.nextInt();

		int arr1[]=new int[n-1];

			for(int i=0;i<num;i++){
			    arr1[i]=arr[i];
			}

			for(int i=num;i<n-1;i++){
				arr1[i]=arr[i+1];
			}
			
		

		for ( int i=0;i<n-1;i++){
			System.out.println("Enter arr1["+i+"]=" +arr1[i]);
		}
	}
}