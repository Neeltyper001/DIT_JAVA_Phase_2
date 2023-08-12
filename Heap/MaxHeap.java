package Heap;

public class MaxHeap {
    private int []heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    int parent(int index){
        return (index-1)/2;
    }

    public int leftChild(int index){
        return 2*index+1;
    }
    public int rightChild(int index){
        return 2*index+2;
    }

    public void swap(int index1,int index2){
        int temp = heap[index1];
        heap[index1] =  heap[index2];
        heap[index2] = temp;
    }

    public void insert(int value){
        if(size == capacity){
            System.out.println("Heap is full");;
            return;
        }

        int current = size;
        heap[++size] = value;

        while(current > 0 && heap[current] > heap[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
    }

    public int delete(){
        if(size == 0){
            System.out.println("Underflow! heap is empty");
        }
        int x = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return x;
    }

    public void maxHeapify(int index){
        int parent= index;
        int leftChildIdx = leftChild(index);
        int rightChildIdx = rightChild(index);

        if(leftChildIdx < size && heap[leftChildIdx]>heap[parent]){
            parent = leftChildIdx;
        }
        if(rightChildIdx < size && heap[rightChildIdx]>heap[parent]){
            parent = rightChildIdx;
        }

        if(parent != index){
            swap(index,parent);
            maxHeapify(parent);
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(40);
        maxHeap.insert(50);
    }
}
