import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        // int[] arr={1,9,2,8,4};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array");
        int n=sc.nextInt();
        System.out.println("Enter element for arr");
        int[] arr = new int[n];

        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        quick(arr,0,arr.length-1);

        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void quick(int[]arr,int low,int high){
        if(low<high){
            int ans=quicksort(arr,low,high);
            quick(arr,low,ans-1);
            quick(arr,ans+1,high);
        }
    }

    public static int quicksort(int[]arr,int low,int high){
        int ans=arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++){
            if(arr[j]<ans){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}
