import java.util.*;
public class Linear_serach{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a size of array");
      int n=sc.nextInt();
      int a[]= new int[n];

      System.out.println("Enter a element of array");
      for(int i=0;i<a.length;i++){
          a[i]=sc.nextInt();
      }
      System.out.println("Enter a key");
      int key=sc.nextInt();

      boolean flag=false;
      for(int i=0;i<a.length;i++){
        if(a[i]==key){
          System.out.println(i);
          flag=true;  
          break;
        }
       
      }
      if(!flag){
        System.out.println("not linear search");
      }
    }
    // boolean flag=false;
    // public int Linear_s(int n,int key){
    //   int a[n];
    //   for(int i=0;i<n;i++){
    //     if(a[i]==key){
    //       System.out.println(i);
    //     }
    //     return -1;
    //   }
    // }
}