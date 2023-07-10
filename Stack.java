import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public void push(int x){
        stack.add(x);
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        int lastIndex = stack.size() -1;
        return stack.remove(lastIndex);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        int lastIndex = stack.size() -1;
        return stack.get(lastIndex);
    }

    public int size(){
        return stack.size();
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack.size());
    }
}
