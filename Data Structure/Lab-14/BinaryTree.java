public class BinaryTree {
    

   class Tree{
        private Tree left;
        private Tree Right;
        private int data;

        public Tree(int data){
            this.data=data;
        }
    }
  
    root;
    Tree right;
    public void createBinaryTree(){
        Tree first=new Tree(1);
        Tree second=new Tree(2);
        Tree third=new Tree(3);
        Tree fourth=new Tree(4);
        Tree fifth=new Tree(5);

      
    
        root=first;
        first.left=second;
        first.right=third;
    }

    public static void main(String[] args) {
        
    }
}
