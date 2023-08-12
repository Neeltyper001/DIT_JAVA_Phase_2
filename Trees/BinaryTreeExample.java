package Trees;
import java.util.Scanner;
import java.util.Stack;
class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTreeOperations{
    boolean hasBeenFilled;
    TreeNode root;    
    Scanner input;
    int level; 
    BinaryTreeOperations(){
        this.root = null;
        this.level = 1;
        this.input = new Scanner(System.in);
        this.hasBeenFilled = false;
    }

    void insert(){
        if(root == null){
            System.out.print("Enter the value of the root node-> ");
            int data = input.nextInt();
            root  = new TreeNode(data);            
        }

        else{        
            if(this.hasBeenFilled)    
                {
                    System.out.println("** WARNING before proceeding further any child node can be overwritten, do you want to proceed further?enter y/n**");
                    String response = input.next();

                    switch(response){
                        case "y": insert(root , input, level);
                                    break;
                        case "n":   return;                                      

                        default : return;
                    }
                }

            else{
                insert(root , input, level);
                this.hasBeenFilled = true;
            }
        }
    }

    void insert(TreeNode currentNode , Scanner input, int level){
        
        if(currentNode.data == -1){
            return;
        }

            System.out.println("============ Insertion for the level "+level+" left ===============");
            System.out.print("Level "+level+" value of left node-> ");
            int leftNodeData = input.nextInt();
            currentNode.left = new TreeNode(leftNodeData);
            insert(currentNode.left , input, level+1 );
            System.out.println("============ Insertion for the level "+level+" right ===============");
            System.out.print("Level "+level+" value of right node-> ");
            int rightNodeData = input.nextInt();
            currentNode.right = new TreeNode(rightNodeData);
            insert(currentNode.right,input,level+1);

    }

    void inOrderPrint(TreeNode currentNode){

            if(root == null){
                System.out.println("=========================");
                System.out.println("Empty nothing to visit!");
                System.out.println("=========================");
                return;
            }

            if(currentNode.data == -1){
                return;
            }

            inOrderPrint(currentNode.left);
            System.out.print(currentNode.data+" ");
            inOrderPrint(currentNode.right);            
    }

    void preOrderPrint(TreeNode currentNode){

            if(root == null){
                System.out.println("=========================");
                System.out.println("Empty nothing to visit!");
                System.out.println("=========================");
                return;
            }

            if(currentNode.data == -1){
                return;
            }

            System.out.print(currentNode.data+" ");
            preOrderPrint(currentNode.left);
            preOrderPrint(currentNode.right);            
    }

    void postOrderPrint(TreeNode currentNode){

            if(root == null){
                System.out.println("=========================");
                System.out.println("Empty nothing to visit!");
                System.out.println("=========================");
                return;
            }

            if(currentNode.data == -1){
                return;
            }

            postOrderPrint(currentNode.left);
            postOrderPrint(currentNode.right);            
            System.out.print(currentNode.data+" ");
    }

    void iterativePreOrder(TreeNode currentNode){
            if(root == null){
                System.out.println("=========================");
                System.out.println("Empty nothing to visit!");
                System.out.println("=========================");
                return;
            }

            else{
                Stack<TreeNode> stk = new Stack<>();
                stk.push(currentNode);
                while(!(stk.isEmpty())){
                    currentNode = stk.pop();
                    if(currentNode.data >= 0)
                         System.out.print(currentNode.data+" ");

                    if(currentNode.right != null){
                        stk.push(currentNode.right);
                    }
                    if(currentNode.left != null){
                        stk.push(currentNode.left);
                    }                    
                }
            }
    }
    void iterativePreOrder2(TreeNode currentNode){
            if(root == null){
                System.out.println("=========================");
                System.out.println("Empty nothing to visit!");
                System.out.println("=========================");
                return;
            }

            else{
                Stack<TreeNode> stk = new Stack<>();                
                while(currentNode.data >= 0 || !(stk.isEmpty())){
                        while(currentNode != null){                        
                        System.out.println(currentNode.data);
                        if(currentNode.right != null){
                            stk.push(currentNode.right);
                        }
                        currentNode = currentNode.left;
                    }
                    if(!stk.isEmpty()){
                        currentNode = stk.pop();
                    }
                   
                }
            }
    }
    void iterativeInOrder(TreeNode currentNode){
            if(root == null){
                System.out.println("=========================");
                System.out.println("Empty nothing to visit!");
                System.out.println("=========================");
                return;
            }

            else{
                Stack<TreeNode> stk = new Stack<>();                
                while(currentNode.data >= 0 || !(stk.isEmpty())){
                        while(currentNode.data >=0){                        
                            stk.push(currentNode);
                            currentNode = currentNode.left;                            
                        }                        
                        currentNode = stk.pop();
                        System.out.print(currentNode.data+" ");
                        currentNode = currentNode.right;
                }
            }
    }
    void iterativePostOrder(TreeNode currentNode){
            if(root == null){
                System.out.println("=========================");
                System.out.println("Empty nothing to visit!");
                System.out.println("=========================");
                return;
            }

            else{
                Stack<TreeNode> stk = new Stack<>();                
                while(currentNode.data >= 0 || !(stk.isEmpty())){
                        while(currentNode.data >=0){                        
                            stk.push(currentNode);                                                                                     
                            currentNode = currentNode.left;
                        }      
                        
                        currentNode = stk.pop();
                        System.out.println(currentNode.data);
                        currentNode = stk.pop();
                        if(currentNode.right.data >=0 )                        
                            currentNode = currentNode.right;                        
                }
            }
    }


}

public class BinaryTreeExample {


    public static void main(String[] args) {
        
        BinaryTreeOperations bto = new BinaryTreeOperations();
        while(true){
            Scanner input = new Scanner(System.in);
            int choice = 0;
            System.out.println();
            System.out.println("1. Insert");
            System.out.println("2. In-order print");
            System.out.println("3. Pre-order print");
            System.out.println("4. Post-order print");
            System.out.println("5. All traversals");
            System.out.println("6. Iterative PreOrderTraversals");
            System.out.println("7. Iterative InOrderTraversals");
            System.out.println("8. Exit");
            System.out.print("Enter your choice -> ");
            choice = input.nextInt();

            switch(choice){
                case 1: bto.insert();
                break;
                case 2: System.out.print("InOrder: ");
                        bto.inOrderPrint(bto.root);
                break;
                case 3: System.out.print("PreOrder: ");
                        bto.preOrderPrint(bto.root);
                break;
                case 4: System.out.print("PostOrder: ");
                        bto.postOrderPrint(bto.root);
                break;
                case 5: System.out.print("All Traversals: ");
                        System.out.print("\nInOrder: ");                        
                        bto.inOrderPrint(bto.root);                        
                        System.out.print("\nPreOrder: ");
                        bto.preOrderPrint(bto.root);
                        System.out.print("\nPostOrder: ");
                        bto.postOrderPrint(bto.root);
                break;
                
                case 6: bto.iterativePreOrder(bto.root);
                        break;
                case 7: bto.iterativeInOrder(bto.root);
                        break;
                case 8: System.exit(0);
                break;

                default: System.out.println("Enter valid choice");
            }
        }        
    }
}
