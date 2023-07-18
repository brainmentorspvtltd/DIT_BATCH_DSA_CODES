public class NextSmallerElement {
    static int[] findNs(int arr[]){
        int n = arr.length;
        int ns[] = new int[n];
        Stack stack = new Stack();

        for(int i =n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            ns[i] = stack.isEmpty() ? -1 : arr[stack.peek()];

            stack.push(i);
        }
        return ns;
    }
    public static void main(String[] args) {
        int arr[] = {50,60,50,40,95,80};
        int ans[] = findNs(arr);

        for(int i : ans){
        System.out.print(i + " ");
    }
}
}
