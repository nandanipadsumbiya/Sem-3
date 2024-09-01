import java.util.Scanner;

public class Count_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       

        System.out.println("Enter length of array");
        int n=sc.nextInt();
        System.out.println("Enter element for arr");
        int[] arr = new int[n];

        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }

        Count_sort sort=new Count_sort();
        sort.countsort(arr);

        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" , ");
        }
    }

    public void countsort(int []arr){
       int n=arr.length;

       int max=arr[0];
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
       }

       int []c=new int[max+1];
       int []b=new int[n];

       for(int i=0;i<=max;i++){
            c[i]=0;
       }
       for(int i=0;i<n;i++){
           c[arr[i]]++;
       }

       for(int i=1;i<=max;i++){
            c[i]=c[i]+c[i-1];
       }

       for(int i=n-1;i>=0;i--){
            b[c[arr[i]]-1]=arr[i];
            c[arr[i]]--;
       }

       for(int i=0;i<n;i++){
            arr[i]=b[i];
       }
    }
}
