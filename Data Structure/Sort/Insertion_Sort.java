import java.util.*;
public class  Insertion_Sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array");
        int n=sc.nextInt();
        System.out.println("Enter element for arr");
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }

        int i=1;
        int key;
        int j;
        while(i<arr.length){
            key=arr[i];
            j=j-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
           arr[j+1]=key;
           i++;
        }
        System.out.println("................After.........");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}