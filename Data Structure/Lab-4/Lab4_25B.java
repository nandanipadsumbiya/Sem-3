import java.util.*;
public class Lab4_25B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n number : ");
		int n=sc.nextInt();

		int arr[]=new int[n];

		for (int i=0;i<n;i++){
			System .out.println("Enter arr["+i+"]=" );
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++){
			for(int j=i+1;j<=n-1;j++){
				if(arr[i]==arr[j]){
					for(int j2=j;j2<n-1;j2++){
						arr[j2]=arr[j2+1];
					}
					j--;
					n--;
				}
			}
		}
		System.out.println("Array AFTER deleting duplicate : ");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);//n=length thai ?
		}
	}
}