package Trees;
import Trees.BinaryTreeNode;
import java.util.ArrayList;
// public class BinaryTreeNode {
//     int data;
//     BinaryTreeNode left;
//     BinaryTreeNode right;
//     BinaryTreeNode(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }
public class PrintLikeABST {
    static void printLike_A_BST(BinaryTreeNode currentNode){

        if(currentNode == null){
            return;
        }

        printLike_A_BST(currentNode.left);
        System.out.print(currentNode.data+" ");
        printLike_A_BST(currentNode.right);        
    }

    public static void main(String[] args) {
        BinaryTreeNode root1 = new BinaryTreeNode(10);
        root1.left = new BinaryTreeNode(5);
        root1.right = new BinaryTreeNode(20);
        root1.right.right = new BinaryTreeNode(40);
        System.out.print("Printing: ");
        printLike_A_BST(root1);

        ArrayList<Integer>arr = new ArrayList<>();
        
    }
}
