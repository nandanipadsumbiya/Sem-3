import java.util.*;
public class Lab5_30A{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr1[][]=new int[2][2];
		int arr2[][]=new int[2][2];


		for (int i=0;i<2;i++){
			for(int j=0;j<2;j++){
			System .out.println("Enter arr1["+i+"]["+j+"]=" +arr1[i][j] );
			arr1[i][j]=sc.nextInt();
		}
	}


		for (int i=0;i<2;i++){
			for(int j=0;j<2;j++){
			System .out.println("Enter arr2["+i+"]["+j+"]="+arr2[i][j] );
			arr2[i][j]=sc.nextInt();
		 }
		}
		
		int arr3[][]=new int[2][2];

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("c["+i+"]["+j+"]=" +(arr1[i][j]+arr2[i][j]));
			}
		}
	}
}