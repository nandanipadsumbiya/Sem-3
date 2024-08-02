import java.util.*;
public class Binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n=sc.nextInt();
        int a[]= new int[n];
  
        System.out.println("Enter a element of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a key");
        int key=sc.nextInt();
        int left=0;
        int right=n-1;
       

        
        // Binary_search BS=new Binary_search();
        // BS.Binary_s(left,right,key);
        boolean flag=false;
        while(left<=right){
            //int middle=(left+right)/2;
            int middle=((right-left)/2)+left;

            if(a[middle]==key){
                System.out.println(middle);
                flag=true;
                break;
            }
            else if(key<=a[middle]){
                right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        if(!flag){
            System.out.println("not found");
        }
    }

    // public int  Binary_s(int left,int right,int middle,int key){
    //     while(left<=right){
    //         middle=(left+right)/2;

    //         if(a[middle]==key){
    //             return middle;
    //         }
    //         else if(key<=a[middle]){
    //             right=middle-1;
    //         }
    //         else{
    //             left=middle+1;
    //         }
    //     }
    //     return -1;
    // }
}
