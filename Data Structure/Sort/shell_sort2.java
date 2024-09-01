import java.util.Scanner;

public class shell_sort2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array");
        int n=sc.nextInt();
        System.out.println("Enter element for arr");
        int arr[]=new int[n];

        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }

        for(int gap=n/2;gap>=1;gap=gap/2){
            for(int j=gap ; j<n ; j++){
                int temp=arr[j];
                int i;
                for(i=j-gap;i>=0 && arr[i+gap]>arr[i];i=i-gap){
                    arr[i+gap]=arr[i];
                }
                arr[i+gap]=temp;
            }
        }
        System.out.println("after");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
