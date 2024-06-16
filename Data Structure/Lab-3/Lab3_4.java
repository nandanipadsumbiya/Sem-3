import java.util.*;
public class Lab3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

		System.out.println("Enter n number");
		int n=sc.nextInt();

        int [] number=new int[n];

        int max=0;
        int min=0;

        for( int i=1;i<n;i++){
            if(number[i]<=number[min]){
                min=i;
                
            }

            if(number[i]>number[max]){
                max=i;
               
            }
        }
        System.out.println(min);
        System.out.println(max);


    }
}
