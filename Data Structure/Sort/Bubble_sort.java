import java.util.*;
public class  Bubble_sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array");
        int n=sc.nextInt();
        System.out.println("Enter element for arr");
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
       
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("................After.........");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}