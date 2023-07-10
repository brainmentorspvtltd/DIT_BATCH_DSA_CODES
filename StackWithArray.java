public class StackWithArray {

    public static class MyStack{
        private int arr[];
        int capacity;
        int top;

        public MyStack(int c){
            capacity =c;
            arr = new int[capacity];
            top =-1;
        }

        public void push(int x){
            if(top == capacity-1){
                System.out.println("Stack is full");
                return;
            }
            arr[++top] = x;
            System.out.println("Push Element" + arr[top] );
        }

        public int pop(){
            if(top ==-1){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top--];
        }

        public int peek(){
            if(top==-1){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        public int size(){
            return top+1;
        }

        public boolean isEmpty(){
            return (top == -1);
        }
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack.size());
    }
}
