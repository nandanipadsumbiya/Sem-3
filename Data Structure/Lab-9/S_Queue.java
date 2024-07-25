import java.util.*;

class SQueue{
        int f=-1;
        int r=-1;
        int size;
        int[] Queue;

        SQueue(int size){
            this.size=size;
            this.Queue=new int[size];
        }


        public void Enqueue(int y){
                if(r>=size){
                    System.out.println("Queue overflow");
                    return;
                }
                r++;
                Queue[r]=y;
                if(f==-1){
                    f=0;
                }

        }
        int y;
        public int delete(){
            if(f==-1){
                System.out.println("Queue underflow");
                return(0);
            }
            y=Queue[f];
            if(f==r){
                f=0;
                r=0;
            }
            else{
                f=f+1;
            }
            return(y);

        }
        public void display(){
            System.out.println("..........final ans...........");
            for(int i=f;i<size;i++){
               
                System.out.print(Queue[i]+"->");
                //System.out.println("->");
                
            }
            System.out.println();
        }
}
public class S_Queue{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter size of queue");
            int a=sc.nextInt();

            SQueue SQ=new SQueue(a);
            while(true){
                System.out.println("Enter 1 than Insert a element in queue");
                System.out.println("Enter 2 than delete a element in queue");
                System.out.println("Enter 3 than display queue");
                System.out.println("Enter 4 than break");
                int b=sc.nextInt();

                if(b==1){
                    System.out.println("Enter element to insert");
                    int c=sc.nextInt();
                    SQ.Enqueue(c);
                }
                else if(b==2){
                    SQ.delete();
                }
                else if(b==3){
                    SQ.display();
                }
                else if(b==4){
                    break;
                }
            }
        }
}