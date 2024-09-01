import java.util.Scanner;

public class Radix_Sort {
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
        
        
        Radix_Sort sort=new Radix_Sort();
        sort.radixsort(arr);

        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" , ");
        }
    }

    public void countsort(int []arr,int n,int place){
        int c[] = new int[10];
        int b[]= new int[n];

        for(int i=0;i<10;i++){
            c[i]=0;
        }

        for(int i=0;i<n;i++){
            c[(arr[i]/place)%10]++;
        }

        for(int i=1;i<10;i++){
            c[i]=c[i]+c[i-1];
        }

        for(int i=n-1;i>=0;i--){
            b[c[(arr[i]/place)%10]-1]=arr[i];
            c[(arr[i]/place)%10]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=b[i];
        }
    }

    public void radixsort(int []arr){
        int n=arr.length;
        int m=getMax(arr);

        for(int place=1;m/place>0;place*=10){
            countsort(arr,n,place);
        }
    }
    public int  getMax(int []arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
