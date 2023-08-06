package Trees;
import java.util.Stack;
import Trees.BinaryTreeNode;

 class PostOrderIteration {
        Stack<BinaryTreeNode> stk;
        
        PostOrderIteration(){
            stk = new Stack<>();
        }
        //  void postOrderTraversal(BinaryTreeNode currentNode){
        //     if(currentNode == null){
        //         return;
        //     }            
        //     System.out.print("Post Order: ");
        //     while(currentNode != null || !stk.isEmpty()){

        //         if(currentNode != null){
        //             stk.push(currentNode);
        //             currentNode = currentNode.left;
        //         }

        //         else{
        //             currentNode = stk.peek();
        //             if(currentNode.right != null){
        //                 currentNode = currentNode.right;
        //             }
        //             else{
        //                 System.out.println(currentNode.data+" ");
        //                 stk.pop();
        //                 if(currentNode == stk.peek().right){
        //                         currentNode = stk.peek().right;
        //                 }
        //                 else{
        //                     currentNode = null;
        //                 }
        //             }
        //         }
        //     }

        // }

    void postOrderTraversal(BinaryTreeNode root) {		
		if(root==null)
			return;
		BinaryTreeNode pre=null;
		Stack<BinaryTreeNode> s = new Stack();      
		while(root!=null || !s.empty()){
			if(root!=null){				
				s.push(root);
				root = root.left;
			}
			else{
				root = s.peek();
				if(root.right==null || root.right==pre){
				    System.out.print(root.data+" ");
				    s.pop();
				    pre=root;
				    root = null;
				}
				else
				    root = root.right;
			}
		}		
	}

        public static void main(String[] args) {
            PostOrderIteration poiObj = new PostOrderIteration();    
            BinaryTreeNode root = new BinaryTreeNode(10);
            root.left = new BinaryTreeNode(20);
            root.left.left = new BinaryTreeNode(40);
            root.left.right = new BinaryTreeNode(50);            
            root.left.right.left = new BinaryTreeNode(60);            
            root.right = new BinaryTreeNode(30);
            root.right.right = new BinaryTreeNode(70);
            root.right.right.right = new BinaryTreeNode(80);
            poiObj.postOrderTraversal(root);
        }


}
