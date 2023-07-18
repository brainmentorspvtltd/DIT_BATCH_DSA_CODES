import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
    }

    //Without using extra space
    static void reverseQueue2(Queue<Integer> queue ){
        if(queue.isEmpty()){
            return;
        }
        int front = queue.poll();
        reverseQueue2(queue);
        queue.offer(front);
    }
    public static void main(String[] args) {
       Queue<Integer> queue = new LinkedList<>();
       queue.add(10);
       queue.add(20);
       queue.add(30);
       queue.add(40);
        System.out.println("Original Queue  : " + queue);
        reverseQueue2(queue);
        System.out.println("Reversed Queue : " + queue);
    }
}
