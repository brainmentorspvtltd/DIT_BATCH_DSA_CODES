public class KthSmallestInHeap {
    private int []heap;
    private int size;
    private int capacity;

    public KthSmallestInHeap(int capacity){
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

        while(current>0 && heap[current] < heap[parent(current)]){
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
        minHeapify(0);
        return x;
    }

    public void minHeapify(int index){
        int par = index;
        int lci = leftChild(index);
        int rci = rightChild(index);

        if(lci < size && heap[lci] < heap[par]){
            par = lci;
        }

        if(rci < size && heap[rci] < heap[par]){
            par=rci;
        }

        if(par != index){
            swap(index, par);
            minHeapify(par);
        }
    }

    public static void main(String[] args) {
        KthSmallestInHeap minHeap = new KthSmallestInHeap(10);
        minHeap.insert(10);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.insert(20);
        minHeap.insert(30);
        int k=3;
        for(int i=0;i<k-1;i++){
            minHeap.delete();
        }
        System.out.println(minHeap.delete());

    }
}
