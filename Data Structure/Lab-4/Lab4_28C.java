import java.util.*;
public class Lab4_28C{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of arrya");
		int n=sc.nextInt();


		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter arr["+i+"]=");
			arr[i]=sc.nextInt(); 
		}


		int sum=0;
		int min=arr[0];
		int max=arr[0];
		double avg=0 ;


		for(int i=0;i<n;i++){
			sum=sum+arr[i];
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
		}
		avg=sum/(double)n;

		System.out.println("sum ="+sum);
		System.out.println("minmum ="+min);
		System.out.println("maximum ="+max);
		System.out.println("avg ="+avg);

		
	}
}