import java.util.*;
public class Lab4_23A{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a length of array : ");
		int n=sc.nextInt();

		int arr[]=new int[n];

		for (int i=0;i<n;i++){
			System .out.println("Enter array element  arr["+i+"]=" );
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a inserted num : ");
		int num=sc.nextInt();

		int arr1[]=new int[n+1];
		boolean flag=true;

		for(int i=0;i<arr1.length-1;i++){
			if(arr[i]<num){
				arr1[i]=arr[i];
			}
			else if(flag){
				arr1[i]=num;
				flag=false;
				i--;
			}
			else if(arr[i]>num){
				arr1[i+1]=arr[i];
			}
		}
		for(int i=0;i<n+1;i++){
			System.out.println("arr["+i+"]="+ arr1[i]);
		}

	}
}