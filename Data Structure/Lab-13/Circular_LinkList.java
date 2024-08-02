import java.util.*;
class C_LinkList{
    class Node{
        int info;
        Node link;

        public Node(int info){
            this.info=info;
            this.link=null;
        }
    }
    //insert at first position
    Node first=null;
    Node last;
    public void InsertAtstart(int data){
        Node new_node = new Node(data);

        if(first==null){
            new_node.link=new_node;
            first=last;
            last=new_node;
        }
        new_node.link=first;
        last.link=new_node;
        first=new_node;
    }
    //insert at last position
    public void InserAtLast(int data){
        Node new_node=new Node(data);

        if(first==null){
            new_node.link=new_node;
            first=last;
            last=new_node;
        }
        else{
            new_node.link=first;
            last.link=new_node;
            last=new_node;
        }
    }

    //delete a node at specified position
    public void Delete_CLL(int x){
        Node save=first;
        Node last=null;
        
        Node pred=save;

        if(first==null){
            System.out.println("Linked List is empty");
        }
        while(save!=x && save!=last){
            pred=save;
            save=save.link;

        }
        if(save!=x){
            System.out.println("Node is not found");
        }
        if(first==last){
            first=last;
            last=null;
        }
        else if(x==first){
            first=first.link;
            last.link=first;
        }
        else{
            pred.link=temp.link;
            if(temp==last){
                last=pred;
            }
        }
    }
    public void displayCLL(){
        Node temp=first;
        System.out.println(".........final Ans...........");
        if(first!=null){
            do{
                System.out.println(temp.info+"");
                temp=temp.link;
            }while(temp!=first);
        }
    }
}
public class Circular_LinkList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        C_LinkList CLL= new C_LinkList();

        while(true){
            System.out.println("Enter a 1 then insert at first");
            System.out.println("Enter a 2 then insert at Last");
            System.out.println("Enter a 3 then delete a node");
            System.out.println("Enter a 5 then display node");
            System.out.println("Enter a 6 exit");
            int c=sc.nextInt();
            int b;

            if(c==1){
                System.out.println("Enter a value of node at first node");
                b=sc.nextInt();
                CLL.InsertAtstart(b);
            }
            if(c==2){
                System.out.println("Enter a value of node at last node");
                b=sc.nextInt();
                CLL.InserAtLast(b);
            }
            if(c==3){
                System.out.println("Enter a delete index for node");
                int temp=sc.nextInt();
                CLL.Delete_CLL(temp);
            }
            if(c==5){
                CLL.displayCLL();
            }
            if(c==6){
                break;
            }
        }

    }
}
