import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

        public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BSTTree{
     public TreeNode insertBST(int element,TreeNode root){
        TreeNode n=new TreeNode(element);
        if(root==null){
            root=n;
            return root;
        }
        TreeNode temp=root;
        while(temp!=null){
            if(temp.data==element){
                break;
            }
            if(temp.data>element){
                if(temp.left==null){
                    temp.left=n;
                    break;
                }
                else{
                        temp=temp.left;
                }
            }
            else if(temp.data<element){
                if(temp.right==null){
                    temp.right=n;
                    break;
                }
                else{
                        temp=temp.right;
                }
            }
        }
        return root;
    }

    public TreeNode delete(TreeNode root,int n){
        if(root==null){
            return null;
        }
        if(root.data==n){
            return replace(root);
        }
        if(root.data<n){
            root.right=delete(root.right,n);
        }
        if(root.data>n){
            root.left=delete(root.left,n);
        }
        return root;    
    }

    public TreeNode replace(TreeNode root){
        if(root.left==null && root.right==null){
            return null;
        }
        if(root.right==null){
            return root.left;
        }
        if(root.left==null){
            return root.right;
        }
    }




}

public class New_BST_Tree_withoutRaction {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        BSTTree Tree=new BSTTree();
        TreeNode root=null;
        boolean flag=true;
        int element;

        while(true){
            System.out.println("Enter 1 for insert");
            int x=sc.nextInt();

            switch (x) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
