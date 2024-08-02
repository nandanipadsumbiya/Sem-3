import java.util.*;
class D_LinkList{
	class Node{
		int info;
		Node lpter;
		Node rpter;


		public Node(int info){
			this.info=info;
			this.lpter=null;
			this.rpter=null;
		}
	}

	public void InsertAtstart(int data){
		Node R;
		Node L;
		Node M;
		  Node new_node = new Node(data);
		if(R=null){
			new_node.lpter=null;
			new_node.rpter=null;
			L=new_node;
			R=new_node;

		}

		else if(M==L){
			new_node.lpter=null;
			new_node.rpter=M;
			M.lpter=new_node;
			L=new_node;
		}

		else{
		new_node.lpter=m.lpter;
		new_node.rpter=m;
		m.lpter=new_node;
		new_node.lpter.rpter=new_node;
	    }

	}

	public void displayDL(){
		Node save=L;
		for(int i=L.info;i<R.info;i++){
			System.out.println(save.info);
			save=save.lpter;
		}
	}
}
public class Doubly_LinkList{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        D_LinkList DL=new D_LinkList();

        while(true){
        	System.out.println 
        }
	}
}
