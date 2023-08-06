package Queue;

class Node<T>{
    T data;
    T next = null;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListOpr<T>{
    Node<T> front = null;
    Node<T> rear = null;

    void enqueue(T data){
        if( front == null && rear == null ){
            // Node newNode = new Node();
        }

    }
}
public class QueueLinkedListImplementation {
    

}
