package Trees;
import Trees.BinaryTreeNode;
import java.util.Queue;
import java.util.LinkedList;

 class LevelOrderTraversal {
    
    static void traversal(BinaryTreeNode currentNode){
        if(currentNode == null){
            System.out.println("Empty!");
            return;
        }
        else{
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.add(currentNode);
            BinaryTreeNode temp = null;
            while(!q.isEmpty()){
                temp = q.remove();
                System.out.print(temp.data+" ");
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
    }

    static void traversal2(BinaryTreeNode currentNode){
        if(currentNode == null){
            System.out.println("Empty");
            return;
        }

        else{
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.add(currentNode);
            BinaryTreeNode temp = null;
            while(!q.isEmpty()){
                int size = q.size();

                for(int i=0; i<size ; i++){
                    temp = q.remove();
                    System.out.print(temp.data+" ");
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(20);
        root.right = new BinaryTreeNode(30);
        root.left.left = new BinaryTreeNode(40);
        root.left.right = new BinaryTreeNode(50);
        root.right.left = new BinaryTreeNode(60);
        root.right.right = new BinaryTreeNode(70);
        traversal(root);
        System.out.println();
        System.out.println("================Approach-2=====================");
        traversal2(root);
    }

    
}
