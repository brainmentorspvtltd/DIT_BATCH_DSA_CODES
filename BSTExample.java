class BSTNode<T>{
    T data;
    BSTNode left;
    BSTNode right;
    BSTNode(T data){
        this.data = data;
    }
   
}
class BSTOperations{
    BSTNode<Integer> root; // root is null
    void takeTreeValues(){
        root = insert(root, 10);
        BSTNode<Integer> t = insert(root, 20);
        t = insert(root, 5);
        t = insert(root, 7);
        print(root);
        BSTNode<Integer> node = search(root, 45);
        System.out.println( node==null?"No Data Found":"Data Found "+node.data);
        System.out.println("Min Value "+minValue(root));
        System.out.println("Max Value "+maxValue(root));
    }
    BSTNode<Integer> insert(BSTNode<Integer> currentNode, int data){
        // Check Root is Not Present
        if(currentNode == null){
            currentNode = new BSTNode<Integer>(data);
            return currentNode;
        }
        // Root is Present
        if(data<currentNode.data){
            currentNode.left = insert(currentNode.left, data);
        }
        else if(data>currentNode.data){
            currentNode.right = insert(currentNode.right, data);
        }
        return currentNode;
    }


void print(BSTNode<Integer> currentNode){
    if(currentNode!=null){
        print(currentNode.left);
        System.out.println(currentNode.data);
        print(currentNode.right);
    }
}

BSTNode<Integer> search(BSTNode<Integer> currentNode, int dataToSearch){
    if(currentNode == null || currentNode.data == dataToSearch){
        return currentNode;
    }
    if(currentNode.data>dataToSearch){
        return search(currentNode.left, dataToSearch);
    }
    else{
        return search(currentNode.right, dataToSearch);
    }
}




int minValue(BSTNode<Integer> currentNode){
    if(currentNode==null){
        return Integer.MIN_VALUE;
    }
    int min = currentNode.data;
    while(currentNode.left!=null){
        min = (Integer) currentNode.left.data;
        currentNode = currentNode.left;

    }
    return min;
}

int maxValue(BSTNode<Integer> currentNode){
    if(currentNode==null){
        return Integer.MAX_VALUE;
    }
    int max = currentNode.data;
    while(currentNode.right!=null){
        max = (Integer) currentNode.right.data;
        currentNode = currentNode.right;

    }
    return max;
}

void remove(BSTNode<Integer> currentNode, BSTNode<Integer> parent,boolean isLeft, int data){
    if(data>currentNode.data){
        // lookup in right
        remove(currentNode.right, currentNode, false, data);
    }
    else if(data<currentNode.data){
        remove(currentNode.left, currentNode, true, data);
    }
    else{
        // Data Found
        // Case 1 - Leaf Node (No Left Child , No Right Child)
        if(currentNode.left==null && currentNode.right==null){
            if(isLeft){
                parent.left =null;
            }
            else {
                parent.right = null;
            }
        }
        // case -2 currentNode right is not null , but left is null
        if(currentNode.left==null && currentNode.right!=null){
            if(isLeft){
                parent.left = currentNode.right;
            }
            else{
                parent.right = currentNode.right;
            }
        }

        // case -3 currentNode left is not null , but right is null
        if(currentNode.left!=null && currentNode.right==null){
            if(isLeft){
                parent.left = currentNode.left;
            }
            else{
                parent.right = currentNode.left;
            }
        }
        // case -4 currentNode left is not null and right is not null
        if(currentNode.left!=null && currentNode.right!=null){
            // Left Max
            int max = maxValue(currentNode.left);
            currentNode.data = max;
            remove(currentNode.left, currentNode, true, max);

        }
    }
}

}

public class BSTExample {
    public static void main(String[] args) {
        BSTOperations opr = new BSTOperations();
        opr.takeTreeValues();
    }
}
