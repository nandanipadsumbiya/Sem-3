import java.util.Scanner;

public class quick {
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
        
        int low=0;
        int high=n-1;
        quicksort(arr,low, high);

        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }


    public static void quicksort(int[]arr,int low,int high){
        boolean flag=true;
       int key;
       int i;
       int j;
       
        if(low<high){
        key=arr[low];
        i=low;
        j=high+1;
       
       
        while(flag){
            i++;
            while( i<=high&&arr[i]<key ){
                i++;
            }
            j--;
            while (j>=low && arr[j]>key ){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else{
                flag=false;
            }

        }
           int temp=arr[low];
           arr[low]=arr[j];
           arr[j]=temp;
       
       quicksort(arr,low, j-1);
       quicksort(arr,j+1,high);
        

       
    }
   

   }
}
