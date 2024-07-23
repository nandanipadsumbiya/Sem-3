import java.util.*;
class Linked_List{
    class Node{
        int info;
        Node link;
       
        public  Node(int info){
            this.info=info;
            this.link=null;
        }
    }

    //insert a node at first position
    Node first=null;
    public void InsertAtStart(int data){
        Node New_Node= new Node(data);

        if(first==null){
            // System.out.println("LinkList is empty");
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


    //delete a Node , data is info value
   public void Delete(int data){
      Node save=first.link;
      Node pred=first;
        if(first==null){
            System.out.println("Node is Not Found");
            return;
        }
        if(first.info==data){
            first=first.link;
            save=null;
            }
       while (save.info!=data){
        save=save.link;
        pred=pred.link;
       }
       pred.link=save.link;
       save.link=null;

    }


    //Delete position
    public void Delete_Position(int x){
        Node save=first;
        Node pred=null;
        int temp=0;
          if(first==null){
              System.out.println("empty");
              return;
          }
         else{
            while(temp!=x){
                save=save.link;
                pred=save;
                temp=temp+1;
            }
         }
         if(temp!=x){
            System.out.println("Node is not found");
         }
         if(temp==x&&save==null){
            pred.link=null;
            return;
         }
         else if(temp==x){
            pred.link=save.link;

         }
    }


    // Node count
    public int count(){
       
        Node save=first;
        int count=0;
        
        while(save!=null){
            count++;
            save=save.link;  
        }
        return count;
       
        // System.out.println("count ="+count);
        // public void count(){
       
        //     Node save=first;
        //     int count=0;
        //     if(first==null){
        //         count=0;    
        //     }
        //     count=count+1;
            
        //     while(save.link!=null){
        //         save=save.link;
        //         count++;
        //     }
        //      System.out.println("count ="+count);

    }

    // revers method 
    public void reverse(){
        Node prev=null;
        Node current=first;
        Node next=null;

        while(current!=null){
            next=current.link;
            current.link=prev;
            prev=current;
            current=next;
        }
        first=prev;
    }
    // remove duplicate elements from a singly linked list
            // public void removedu(){
            //     Node save=first;
            //     Node temp=null;

            //     while(save!=null){
            //         temp=save.link;
            //         while(temp!=null){
            //             if(save.info==temp.info){
            //                 save.link=temp.link;
            //             }
            //             temp=temp.link;
            //         }
            //         save=save.link;
            //     }
            // }
    public void removedu(){
        Node save=first;
        Node pred=null;
        
       while( save!=null){
            pred=save.link;
        while(pred!=null){
           if(pred.info==save.info){
            save.link=pred.link;
           }
        pred=pred.link;
       }
       
       save=save.link;
        }
    }


    //copy element for singli linklist
    Node second;
    Node save=first;
    public void copyelement(int data){
        Node New_Node=new Node (data);
        if(first==null){
            System.out.println("linked list is empty");
        }
        if(second==null){
            System.out.println("underflow");
        }
        else{
            New_Node=second;
            second=New_Node.link;
            second=first.info;
            begin=New_Node;
        }
        while(save.link!=null){
            if(second==null){
                System.out.println("underflow");
            }
            else{
                New_Node=second;
                second=second.link;
                
            }
        }
    }

   //sort element in linked list
    public void sort(){
        Node pred=first;
        Node curr=first.link;
        //int count=0;
        for(int i=0;i<count()-1;i++){
            Node save = curr;
            for(int j=0;j<count()-i-1;j++){
                if(pred.info>save.info){
                    int temp1=save.info;
                    save.info=pred.info;
                    pred.info=temp1;
                }
                pred=save;
                save=save.link;
            }
            pred = first;
            curr = first.link;
        }
    }

    //Display a Node
    
    public void displayLL(){
        Node temp=first;
        System.out.println(".......final ans.......");
         while (temp!=null) {
             System.out.println("Your list consists of =>"+temp.info+",");
             temp=temp.link;
        } 
       
    }
}

public class LinkList {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        Linked_List LL=new Linked_List();
        while(true){
            
            System.out.println("Enter 1 then insert a node at first position");
            System.out.println("Enter 2 then insert a node at last position");
            System.out.println("Enter 3 then insert a node at ordered");
            System.out.println("Enter 4 then delete a Node info");
            System.out.println("Enter 5 then display");
            System.out.println("Enter 6 to Exit");
            System.out.println("Enter 7 then Delete index");
            System.out.println("Enter 8 then count a Node");
            System.out.println("Entre 9 then revers a node");
            System.out.println("Enter 10 then remove duplicate element");
            System.out.println("Enter 11 then copy element one linked list to other linked list");
            System.out.println("Entre 12 then sort a node");
            int c=sc.nextInt();//c=choice

            int b;
        
            if(c==1){
                System.out.println("Enter a Node at value is first");
                b=sc.nextInt();
                LL.InsertAtStart(b);
            }

            if(c==2){
                System.out.println("Enter a Node at value is last");
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
                LL.Delete(b); 
            }

            if(c==5){
                System.out.println("display a Node");
                LL.displayLL();
            }

            if(c==6){
                break;
            }

            if(c==7){
                System.out.println("Enter a index of node which you want to delete");
                int x=sc.nextInt();
                LL.Delete_Position(x);
            }

            if(c==8){
                LL.count();
               
            }
            if(c==9){
                LL.reverse();
            }
            if(c==10){
                LL.removedu();
            }
            if(c==11){
                
            }
            if(c==12){
                LL.sort();
            }
        }
   }
}

