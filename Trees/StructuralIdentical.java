package Trees;
import Trees.BinaryTreeNode;
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
 class StructuralIdentical {

    // We are checking through Inorder traversal 
    static String isIdentical(BinaryTreeNode currentNode,String str){

            if(currentNode == null){
                return str;
            }
             
             str = isIdentical(currentNode.left , str)+"0";
             str = isIdentical(currentNode.right , str)+"1";
             return str;
    }

    static boolean isIdentical(BinaryTreeNode root_param_1 , BinaryTreeNode root_param_2){
            return isIdentical(root_param_1,"").equals(isIdentical(root_param_2,""));            
    }

    public static void main(String[] args) {
        //tree1
        BinaryTreeNode root1 = new BinaryTreeNode(10);
        root1.left = new BinaryTreeNode(5);
        root1.right = new BinaryTreeNode(20);
        root1.right.right = new BinaryTreeNode(40);

        //tree2
        BinaryTreeNode root2 = new BinaryTreeNode(100);
        root2.left = new BinaryTreeNode(50);
        root2.right = new BinaryTreeNode(200);
        root2.right.right = new BinaryTreeNode(400);

        //tree3
        BinaryTreeNode root3 = new BinaryTreeNode(1000);
        root3.left = new BinaryTreeNode(50);
        root3.left.left = new BinaryTreeNode(69);
        root3.right = new BinaryTreeNode(200);
        root3.right.right = new BinaryTreeNode(400);

        System.out.println(isIdentical(root1, root2));
        System.out.println(isIdentical(root1, root3));
    }
}
