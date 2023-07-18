import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public Stack(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x){
        queue2.add(x);
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return queue1.remove();
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }

    public int size(){
        return queue1.size();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
    }
    
}
