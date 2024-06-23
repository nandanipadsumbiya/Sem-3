import java.util.*;
public class Lab1_7B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number : ");
		int number=sc.nextInt();

		for(int i=1;i<number;i++){
			if(number%i==0){
				System.out.println("factors of number :" +i);
			}
		}

	}
}