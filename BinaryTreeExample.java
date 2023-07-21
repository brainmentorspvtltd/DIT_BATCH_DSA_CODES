import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.TreeMap;
import java.util.ArrayList;

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



    void inOrder(BinaryTreeNode<Integer> root){
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
        System.out.println(root.data); // Parent
        preOrder(root.left); // Left
        preOrder(root.right); // Right
    }

    // Iterative Way of Preorder
    void iterativeWayOfPreOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        // Prepare a Stack
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            BinaryTreeNode<Integer> currentNode = stack.pop();
            System.out.print(currentNode.data+" ");
            // Now Push Right and then Left
            if(currentNode.right!=null){
                stack.push(currentNode.right);
            }
            if(currentNode.left!=null){
                stack.push(currentNode.left);
            }
        }
        System.out.println();
    }
    void iterativeWayOfPreOrder2(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        // Prepare a Stack
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        //stack.push(root);
        BinaryTreeNode<Integer> currentNode = root;
        while(currentNode!=null || !stack.isEmpty()){
           while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            if(currentNode.right!=null){
                stack.push(currentNode.right);
            }
            currentNode = currentNode.left;
           }
           if(!stack.isEmpty()){
            // get the right node
            currentNode = stack.pop();
           }
        }
        System.out.println();
    }

    void iterativeInorder(BinaryTreeNode<Integer> root){
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        BinaryTreeNode<Integer> currentNode = root;
        while(currentNode!=null || !stack.isEmpty()){
            while(currentNode!=null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.right;
        }
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

    void levelOrder(BinaryTreeNode<Integer> root){
        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            // Remove the first element from the queue
            BinaryTreeNode<Integer> node = queue.removeFirst();
            System.out.print(node.data+" ");
            // Put parent Left and Right in a Queue
            if(node.left!=null){
                queue.addLast(node.left);
            }
            if(node.right!=null){
                queue.addLast(node.right);
            }
        }
    }
    int height (BinaryTreeNode<Integer> root){
        if(root == null){
            return 0; // Empty Tree Height is 0
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int value = Math.max(leftHeight, rightHeight);
        return value + 1;
    }
    int maxLevel = 0;
    void printLeftView(BinaryTreeNode<Integer> root, int currentLevel){
        // Termination Case
        if(root == null){
            return ;
        }
        if(maxLevel<currentLevel){
            System.out.println(root.data);
            maxLevel = currentLevel;
        }
        printLeftView(root.left, currentLevel+1);
        printLeftView(root.right, currentLevel+1);
    }

    int maxLevelR = 0;
    void printRightView(BinaryTreeNode<Integer> root, int currentLevel){
        // Termination Case
        if(root == null){
            return ;
        }
        if(maxLevel<currentLevel){
            System.out.println(root.data);
            maxLevel = currentLevel;
        }
        printRightView(root.right, currentLevel+1);
        printRightView(root.left, currentLevel+1);
       
    }

    void printLeftViewIterative(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            for(int i = 0; i<queueSize; i++){
                BinaryTreeNode<Integer> currentNode = queue.poll();
                if(i==0){
                    System.out.println(currentNode.data);
                }
                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
            }

        }
    }

    public void printVerticalOrder(BinaryTreeNode<Integer> root){
        TreeMap<Integer, ArrayList<Integer>> map  = new TreeMap<>();
        verticalOrder(root, 0, map);
        for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public void verticalOrder(BinaryTreeNode<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>> map ){
        // Termination Case
        if(root == null){
            return ;
        }
        if(map.get(distance)==null){ // No Distance Exist
            // Create Fresh ArrayList
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(distance,list);
        }
        else { // Distance Exist
            // get the old list
            // and add new element
            ArrayList<Integer> l = map.get(distance);
            l.add(root.data);
            map.put(distance, l);
        }
        verticalOrder(root.left, distance -1 , map);
        verticalOrder(root.right, distance +1 , map);
    }

    public void printTopView(BinaryTreeNode<Integer> root){
        TreeMap<Integer, ArrayList<Integer>> map  = new TreeMap<>();
        topView(root, 0, map);
        for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet() ){
            System.out.println(m.getValue());
        }

    }

    public void topView(BinaryTreeNode<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>> map ){
        // Termination Case
        if(root == null){
            return ;
        }
        if(map.get(distance)==null){ // No Distance Exist
            // Create Fresh ArrayList
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(distance,list);
        }
        // else { // Distance Exist
        //     // get the old list
        //     // and add new element
        //     ArrayList<Integer> l = map.get(distance);
        //     l.add(root.data);
        //     map.put(distance, l);
        // }
        topView(root.left, distance -1 , map);
        topView(root.right, distance +1 , map);
    }

    public void printBottomView(BinaryTreeNode<Integer> root){
        TreeMap<Integer, ArrayList<Integer>> map  = new TreeMap<>();
        verticalOrder(root, 0, map);
        for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet() ){
            ArrayList<Integer> l = m.getValue();
            System.out.println(l.get(l.size()-1));
        }

    }

    


    void printRightViewIterative(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            for(int i = 0; i<queueSize; i++){
                BinaryTreeNode<Integer> currentNode = queue.poll();
                if(i==0){
                    System.out.println(currentNode.data);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
               
            }

        }
    }

    int sizeOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int counter = 1;
        // Visit to the Node (1)
        counter+=sizeOfBinaryTree(root.left);
        counter+=sizeOfBinaryTree(root.right);
        return counter;
    }

    void levelOrder2(BinaryTreeNode<Integer> root){
        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            // Remove the first element from the queue
           int countQueue = queue.size();
           for(int i = 0; i<countQueue; i++){
            BinaryTreeNode<Integer> currentNode = queue.poll();
            System.out.print(currentNode.data+" ");
            if(currentNode.left!=null){
                queue.addLast(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.addLast(currentNode.right);
            }

           }
           System.out.println();
        }
    }

    boolean isChildrenSum(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum = 0;
        if(root.left!=null){
            sum = sum + root.left.data;
        }
        if(root.right!=null){
            sum = sum + root.right.data;
        }
        return (root.data == sum 
        && isChildrenSum(root.left) 
        && isChildrenSum(root.right));
    }

    boolean search(BinaryTreeNode<Integer> root, int searchElement, ArrayList<BinaryTreeNode<Integer>> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == searchElement){
            return true;
        }
        if(search(root.left, searchElement,path ) || search(root.right, searchElement,path ) ){
            return true;
        }
        return false;
    }
    

BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer> root, int n1 , int n2){
    ArrayList<BinaryTreeNode<Integer>> path1 = new ArrayList<>();
    ArrayList<BinaryTreeNode<Integer>> path2 = new ArrayList<>();
    if(!search(root, n1, path1) || !search(root, n2, path2)){
        return null;
    }
    

   for(int i = path1.size()-1;i>=0; i--){
    for(int j = path2.size()-1; j>=0; j--){
        if(path1.get(i).data == path2.get(j).data){
            System.out.println("LCA "+path1.get(i).data);
            return path1.get(i);
        }
    }
   }
   return null;
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
        //opr.iterativeWayOfPreOrder(root);
       // opr.iterativeInorder(root);
       //opr.levelOrder2(root);
      // opr.printLeftView(root, 1);
      //opr.printLeftViewIterative(root);
      //opr.printRightView(root, 1);
      //opr.printVerticalOrder(root);
      System.out.println(opr.isChildrenSum(root)?"Yes":"No");
      
      //opr.printBottomView(root);
       // opr.printTopView(root);
      //opr.topView(root);
        //opr.print(root);
        break;  
        case 3:
        return ;  
      }
      
    }
    //scanner.close();

    }
}