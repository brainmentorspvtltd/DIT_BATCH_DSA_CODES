class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
}
public class IsBinaryMinHeap {

    public static boolean isMinHeap(TreeNode root){
        return helper(root, Integer.MIN_VALUE);
    }

    static boolean helper(TreeNode node, int parentValue){
        if(node == null){
            return true;
        }
        if(node.val < parentValue){
            return false;
        }
        return helper(node.left, node.val) && helper(node.right, node.val);
    }
    public static void main(String[] args) {
        TreeNode root  =new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        System.out.println(isMinHeap(root));
    }
}
