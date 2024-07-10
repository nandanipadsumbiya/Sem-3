import java.util.*;
class Linked_List{
    class Node{
        int info;
        Node link;
        int data;

        public void Node (int data){
            this.info=data;
            this.link=null;
        }
    }

    //insert a node at first position
    Node first=null;
    public void InsertAtStart(int data){
        Node New_Node= new Node(data);

        if(first==null){
            System.out.println("LinkList is empty");
            first=New_Node;
        }
        else{
            New_Node.link=first;
            first=New_Node;
        }

    }

    //insert a node at last position
    public void InsertAtLast(int data){
        Node New_Node= new Node(data);

        if(first==null){
           first=New_Node;
        }
        else{
            Node save=first;
            while(save.link!=null){
                save=save.link;
            }
            save.link=New_Node;
        }
    }

    //insert a node at ordered position
    public void Ordered(int data){
        Node New_Node= new Node(data);

        if(first==null){
            first=New_Node;
        }
        else{
            Node save=first;
            if(New_Node.info<=first.info){
                New_Node.link= first;
                first=New_Node;
            }
            else{
                while (save.link!=null && New_Node.info>=save.link.info ) {
                    save=save.link;
                }
                New_Node.link=save.link;
                save.link=New_Node;
            }
        }
    }


    //delete a Node 
    private void Delete(int data){
        if(first==null){
            System.out.println("Node is Not Found");
        }
        else{
            if(data==first.info){
                first=first.link;
            }
            else{
                Node save=first;
                Node pred;
            
                while(save.link!=null && save.info==data){
                    pred=save;
                    save=save.link;
                  
                }
                if(save.info!=data){
                    System.out.println("Node not found");
                }
                else{
                    pred.link=save.link;
                }
            }
        }
    }
    
    public void displayLL(){
       
        while (first!=null) {
            System.out.print("Your list consists of =>"+first.data+",");
            first=first.link;
        } 
        System.out.println();
    }
}

public class L10_57A {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        Linked_List LL=new Linked_List();
        while(true){
            int c=sc.nextInt();//c=choice
            System.out.println("Enter 1 then insert a node at first position");
            System.out.println("Enter 2 then insert a node at last position");
            System.out.println("Enter 3 then insert a node at ordered");
            System.out.println("Enter 4 then delete a Node");
            System.out.println("Enter 5 then display");
            System.out.println("Enter 6 to Exit");
            int b;
        
            if(c==1){
                System.out.println("Enter a Node at position is first");
                b=sc.nextInt();
                LL.InsertAtStart(b);
            }

            if(c==2){
                System.out.println("Enter a Node at position is last");
                b=sc.nextInt();
                LL.InsertAtLast(b);
            }

            if(c==3){
                System.out.println("Enter a Node add at ordered");
                b=sc.nextInt();
                LL.Ordered(b);
            }

            if(c==4){
                System.out.println("Enter number you want to delete particular element:");
                b=sc.nextInt();
                LL. Delete(b); 
            }

            if(c==5){
                System.out.println("display a Node");
                LL.displayLL();
            }

            if(c==6){
                break;
            }
        }
   }
}
