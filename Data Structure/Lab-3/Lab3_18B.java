import java.util.*;
public class Lab3_18B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n number : ");
		int n=sc.nextInt();

		int arr[]=new int[n];

		for ( int i=0;i<n;i++){
			System .out.println("Enter arr["+i+"]=" );
			arr[i]=sc.nextInt();
		}
		int temp;
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n-1;j++){
				if(arr[i]!=arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		int j=0;
		System.out.println("Index of first number: "+i);
		System.out.println("Index of first number: "+j);
		System.out.println("Final array : ");

			for(int i=0;i<n;i++){
				System.out.println(arr[i]);
			}


	}
}