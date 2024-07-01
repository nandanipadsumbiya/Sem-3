import java.util.*;
public class Lab3_19C{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number for pascal triangle");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print("   ");
			}
			int ans=1;
			for(int j=1;j<=i;j++){
				System.out.print(ans+ "  ");
				ans=ans*(i-j)/j;

			}
			System.out.println("  ");


		}

	}
}