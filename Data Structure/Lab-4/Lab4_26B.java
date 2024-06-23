import java.util.*;
public class Lab4_26B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter length of 1st arrya n1 : ");
		int n1=sc.nextInt();

		System.out.println("Enter length of 2nd arrya n2 : ");
		int n2=sc.nextInt();


		int arr1[]=new int[n1];
		int arr2[]=new int[n2];

		for ( int i=0;i<arr1.length;i++){
			System .out.println("Enter arr1["+i+"]=" );
			arr1[i]=sc.nextInt();
		}
		for ( int i=0;i<arr2.length;i++){
			System .out.println("Enter arr2["+i+"]=" );
			arr2[i]=sc.nextInt();
		}

		int arr3[]=new int[n1+n2];

		for(int i=0;i<arr3.length;i++){
			if(i<arr1.length){
				arr3[i]=arr1[i];

			}
			else{
				arr3[i]=arr2[i-n1];
			}
			System.out.println("Merged Array : ");
			System.out.println(arr3[i]);

		}
	}
}