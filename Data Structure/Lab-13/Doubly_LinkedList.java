import java.util.*;
class Doubly_LL{
    class Node{
        int info;
        Node Lpter;
        Node Rpter;

        public Node(int info){
            this.info=info;
            this.Lpter=null;
            this.Rpter=null;
        }
    }
    Node first;
    Node Lpter;
    Node Rpter;
    Node R;
    Node L;
    Node M;
    public void InsertAtStart(int data){
        Node new_Node=new Node(data);

        if(R==null){
            new_Node.Lpter=null;
            new_Node.Rpter=null;
            L=new_Node;
            R=new_Node;
            return;
        }
        if(M==L){
            new_Node.Lpter=null;
            new_Node.Rpter=M;
            M.Lpter=new_Node;
            L=new_Node;
            return;
        }
        new_Node.Lpter=M.Lpter;
        new_Node.Rpter=M;
        M.Lpter=new_Node;
        new_Node.Lpter.Rpter=new_Node;
        return;
    }

    public void displayDLL(){
        Node temp=first;
        System.out.println(".......final ans.......");
         while (temp!=null && Lpter!=Rpter) {
            System.out.println("Your list consists of =>"+temp.info+",");
            temp=temp.Lpter;
        } 
    }
}
public class Doubly_LinkedList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Doubly_LL DLL=new Doubly_LL();
        

        while(true){
            System.out.println("Enter a 1 then insert a node at first position");
            int c=sc.nextInt();
            int b;

            if(c==1){
               System.out.println("Enter a value node");
               b=sc.nextInt();
               DLL.InsertAtStart(b);
            }
        }

       
        
    }
}
