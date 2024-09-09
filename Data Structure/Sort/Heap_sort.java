import java.util.*;

public class Heap_sort {

    public static void Heapsort(int [] arr){
        buildMaxHeap(arr);
        int n=arr.length;

        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }

    public static void buildMaxHeap(int [] arr){
        int n=arr.length;

        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    public static void heapify(int [] arr,int n,int i){
        int max_index=i;
        int leftChild=2*i+1;
        int rightChild=2*i+2;

        if(arr[leftChild]>arr[max_index]){
            max_index=leftChild;
        }
        else  if(arr[rightChild]>arr[max_index]){
            max_index=rightChild;
        }
        else if(i!=max_index){
            int temp=arr[i];
            arr[i]=arr[max_index];
            arr[max_index]=temp;
            heapify(arr,n,max_index);
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a size of array");

        int n=sc.nextInt();
        int[]arr=new int[n];

        
        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        Heapsort(arr);
        System.out.println("sorted array is  : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"  ");
        }
    }
}
