import java.util.*;
public class Lab5_31A{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr1[][]=new int[3][2];
		int arr2[][]=new int[2][3];


		for (int i=0;i<3;i++){
			for(int j=0;j<2;j++){
			System .out.println("Enter arr1["+i+"]["+j+"]=" +arr1[i][j] );
			arr1[i][j]=sc.nextInt();
		}
	}


		for (int i=0;i<2;i++){
			for(int j=0;j<3;j++){
			System .out.println("Enter arr2["+i+"]["+j+"]="+arr2[i][j] );
			arr2[i][j]=sc.nextInt();
		 }
		}

		int arr3[][]=new int[3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				int ans=0;
				for(int k=0;k<2;k++){
					ans+=(arr1[i][k]*arr2[k][j]);
				}
				arr3[i][j]=ans;
					System .out.println("Enter arr3["+i+"]["+j+"]="+arr3[i][j] );

			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("arr3["+i+"]["+j+"]=" + arr3[i][j]);
		 }
		}
	}
}