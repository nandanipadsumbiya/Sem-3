import java.util.*;

class BST{
    class Tree{
        int data;
        Tree left;
        Tree right;

        public Tree(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    Tree root;
    BST(int [] arr){
        if(arr.length>0){
            root=ComTree(arr,0);
        }
    }

    public Tree ComTree(int []arr,int index){
        if(index>=arr.length){
            return null;
        }
        Tree node=new Tree(arr[index]);
        node.left=ComTree(arr,2*index+1);
        node.right=ComTree(arr,2*index+2);
        return node;
        
    }

    public void inOrder(Tree node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.data + ",");
            inOrder(node.right);
        }
    }

    public void preOrder(Tree node){
        if(node!=null){
            System.out.print(node.data + ",");
            inOrder(node.left);
            inOrder(node.right);
        }
    }

    
    public void postOrder(Tree node){
        if(node!=null){
            inOrder(node.left);
            inOrder(node.right);
            System.out.print(node.data + ",");
        }
    }

    public void printinOrder(){
        System.out.println("InOrder");
        inOrder(root);
        System.out.println();
    }

    public void printpreOrder(){
        System.out.println("preOrder");
        preOrder(root);
        System.out.println();
    }

    public void printpostOrder(){
        System.out.println("postOrder");
        postOrder(root);
        System.out.println();
    }
}

public class BST_Traversal_pre_in_post{
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};

        BST ans=new BST(a);
        ans.printinOrder();
        ans.printpreOrder();
        ans.printpostOrder();

    }
}