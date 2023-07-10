import java.util.EmptyStackException;

public class StackWithLL {

    private Node top;
    private int size;

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
        public StackWithLL(){
            top =null;
            size = 0;
        }

        public void push(int value){
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
            size++;
        }

        public int pop(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            int poppedValue = top.data;
            top = top.next;
            size--;
            return poppedValue;
        }

        public boolean isEmpty(){
            return size ==0;
        }

        public int size(){
            return size;
        }

        public int peek(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            return top.data;
        }
    public static void main(String[] args) {
        StackWithLL stack = new StackWithLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack.size());
    }
}
