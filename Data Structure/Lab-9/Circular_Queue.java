import java.util.*;
class C_Queue{
    int f=-1;
    int r=-1;
    int[] Queue;
    int size;

    C_Queue(int size){
        this.size=size;
        this.Queue=new int[size];
    }

    public void CQLEnqueue(int y){
        if(r==size){
            r=0;
        }
        else{
            r=r+1;
        }
        if(f==r){
            System.out.println("overflow");
        }
        Queue[r]=y;
        if(f==-1){
            f=0;
            return;
        }
    }
   
    public int CQLDequeue(){
        if(f==-1){
            System.out.println("underflow");
            return(0);
        }
        int y=Queue[f];
        if(f==r){
            f=0;
            r=0;
            return(y);
        }
        if(f==size){
            f=0;

        }
        else{
            f=f+1;
            return(y);
        }
        return(y);
    }

    public void display(){
        System.out.println(".........final ans........");
            
            for(int i=f;;i++){
                System.out.println(Queue[i]);
                if(i==r){
                    break;
                }
            }
           
        
    }
}

public class Circular_Queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a size of queue");
        int a=sc.nextInt();
        C_Queue CQ=new C_Queue(a);

        while(true){
            System.out.println("Enter 1 then CQLEnqueue in circularQueue");
            System.out.println("Enter 2 then CQLDequeue in circularQueue");
            System.out.println("Enter 3 then display in CircularQeue");
            System.out.println("Enter 4 then break");

            int b=sc.nextInt();

            if(b==1){
                System.out.println("Enter a value of Queue");
                int c=sc.nextInt();
                CQ.CQLEnqueue(c);
            }
            else if(b==2){
                CQ.CQLDequeue();
            }
            else if(b==3){
                CQ.display();
            }
            else if(b==4){
                break;
            }
        }
    }
}
