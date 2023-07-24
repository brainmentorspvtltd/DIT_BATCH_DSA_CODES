public class MaxHeap {
    private int []heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity){
        this.capacity = capacity;
        this.size =0;
        this.heap = new int[capacity];
    }

    public int parent(int index){
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
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public void insert(int value){
        //OUT OF RANGE --> OVERFLOW
        if(size==capacity){
            System.out.println("HEAP IS FULL....");
            return;
        }

        int current = size;
        heap[size++] = value;

        while(current>0 && heap[current] > heap[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
    }
    
    public int delete(){
        //UNDERFLOW
        if(size ==0){
            System.out.println("HEAP IS EMPTY.....");
        }
        int x = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return x;
    }

    public void maxHeapify(int index){
        int par = index;
        int lci = leftChild(index);
        int rci = rightChild(index);

        if(lci < size && heap[lci] > heap[par]){
            par = lci;
        }

        if(rci < size && heap[rci] > heap[par]){
            par=rci;
        }

        if(par != index){
            swap(index, par);
            maxHeapify(par);
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(40);
        maxHeap.insert(50);

        System.out.println(maxHeap.delete());
        System.out.println(maxHeap.delete());
        System.out.println(maxHeap.delete());

    }
}
