import java.util.Stack;
public class SortStack {

    static Stack<Integer> sortStack(Stack<Integer> original){
        Stack<Integer> temp = new Stack<Integer>();

        while(!original.isEmpty()){
            int current = original.pop();

            while(!temp.isEmpty() && current > temp.peek()){
                original.push(temp.pop());
            }
            temp.push(current);
        }
        return temp;
    }
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<Integer>();
        original.push(95);
        original.push(46);
        original.push(50);
        original.push(74);
        original.push(39);
        Stack<Integer> ans = sortStack(original);

        while(!ans.isEmpty()){
            System.out.print(ans.pop() + " ");        
        }

    }
}
