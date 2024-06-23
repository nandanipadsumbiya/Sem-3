import java.util.*;
public class Lab3_17B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n number : ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		int count=0;

		for ( int i=0;i<n;i++){
			System .out.println("Enter arr["+i+"]=" );
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++){
			for(int j=i+1;j<n-1;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
		}
		if(count!=0){
			System.out.println("Array is contaius Duplicate number");
		}
		else{
			System.out.println("Array is not contaius Duplicate number");
		}

	}
}