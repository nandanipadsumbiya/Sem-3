import java.util.*;
public class Selection_Sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array");
        int n=sc.nextInt();

        System.out.println("Enter element for arr");
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int mainIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mainIndex]){
                    mainIndex=j;
                }
            }
            int temp=arr[mainIndex];
            arr[mainIndex]=arr[i];
            arr[i]=temp;
        }
        
        System.out.println("................After.........");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
    
}