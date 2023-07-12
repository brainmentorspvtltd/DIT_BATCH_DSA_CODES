import java.util.Scanner;

class BinaryTreeNode<T>{
    T data;
    // Left Child Reference
    BinaryTreeNode<T> left;
    // Right Child Reference
    BinaryTreeNode<T> right;
    BinaryTreeNode(T data){
        this.data = data;
        // left and right default value is null
    }
}
class BinaryTreeOperations{
    String nodeName = "root";
    Scanner scanner = new Scanner(System.in);
    BinaryTreeNode<Integer> insert(){
        System.out.println("Enter the "+nodeName+" Data or enter -1 to exit");
        int data = scanner.nextInt();
        if(data == -1){
            return null;
        }
        // if data coming correct
        // Prepare a Node
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(data);
        // Prepare a Left Node (DFT)
        nodeName = "left"; 
        node.left = insert();
        // BackTrack
        nodeName = "right";
        node.right = insert();
        // BackTrack
        nodeName = "root";
        return node;


    }

    void print(BinaryTreeNode<Integer> root){
        //System.out.println("Print Call...");
        if(root == null){
            return ;
        }
        // Branch Recursion
        // DFT
        String result = "";
        result += root.data+" -> ";
        // checking current node left exist
        if(root.left!=null){
            result += " Left "+root.left.data;
        }
        if(root.right!=null){
            result +=" Right "+root.right.data;
        }
        System.out.println(result);
        print(root.left);
        print(root.right);

    }

    void inOrder(BinaryTreeNode<T> root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }




    // DFT
    // Pre Order (PLR)
    void preOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    // PostOrder (LRP)
    void postOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    
}

class BinaryTreeExample{
    public static void main(String[] args) {
       // BinaryTreeNode<String> b = new BinaryTreeNode<>();
      // BinaryTreeNode<Integer> e = new BinaryTreeNode<>();
      BinaryTreeOperations opr = new BinaryTreeOperations();
      Scanner scanner = new Scanner(System.in);
      BinaryTreeNode<Integer> root = null;
      while(true){
      System.out.println("Binary Tree Operations ");
      System.out.println("1. Insert");
      System.out.println("2. Print");
      System.out.println("3. Exit");
      System.out.println("Enter the Choice");
      int choice = scanner.nextInt();
      
      switch(choice){
        case 1:
        root =opr.insert();
        break;
        case 2: 
        opr.print(root);
        break;  
        case 3:
        return ;  
      }
      
    }
    //scanner.close();

    }
}