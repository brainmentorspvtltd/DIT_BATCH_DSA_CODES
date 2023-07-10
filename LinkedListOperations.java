import java.util.Scanner;

class Node<T>{
     T data;
     Node<T> next; // Reference Variable
     Node(T data){
        this.data = data;
        this.next = null;
     }
}
class LinkedListOperations<T>{
    Scanner scanner = new Scanner(System.in);
    Node<T> head;
    Node<T> tail;
    void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }
    void addPositionWise(int position, T data){
        Node<T> newNode = new Node<>(data);
        // Put the New Node on Head
        if(position ==0){
            newNode.next = head;
            head = newNode;
            return ;
        }
        int i = 1;
        Node<T> temp = head;
        while(i<position){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void print(Node<T> start){
        Node<T> temp = start;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void midElement(){
        Node<T> slow = head;
        Node<T> fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data); // Mid Element
    }

    void findKthElementFromLast(int kth){
        Node<T> p = head;
        Node<T> q = head;
        // move q till kth
        for(int i = 1; i<=kth; i++){
            q = q.next;
        }
        // now q move till end
        while(q!=null){
            p = p.next;
            q = q.next;
        }
        System.out.println("Kth Element "+p.data);
    }

    void detectCycleAndRemoveCycle(){
        Node<T> slow = head;
        Node<T> fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // Detect the Cycle
                System.out.println("Yes Cycle...");
                break;
            }
        }
        if(slow!=fast){
            System.out.println("No Cycle...");
            return ;
        }
        slow = head;
        while(slow.next!=fast.next){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast.next = null; // Break the Cycle

    }
    void deletePositionWise(int position){
        if(head == null){
            System.out.println("Linked List is Empty !");
            return ;
        }
        Node<T> temp = head;
        Node<T> temp2  = null;
        // Delete Head
        if(position ==0){
            Node<T> temp3 = head;
            temp = head.next;
            head = temp;
            temp3.next = null;
            temp3 = null;
            
            return ;
        }
        int i =1;
        temp = head;
        while(i<position){
            temp2 = temp;
            temp = temp.next;
            i++;
        }
        temp2.next = temp.next;
        temp.next = null;
        temp = null;

    }
    public static void main(String[] args) {
        LinkedListOperations<Integer> opr = new LinkedListOperations<>();
        int choice  =0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Add");
            System.out.println("2. Print");
            System.out.println("3. Add Position Wise...");
            System.out.println("4. Delete Position Wise...");
            System.out.println("Enter the Choice...");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                opr.add(10);
                opr.add(20);
                opr.add(30);
                opr.add(40);
                break;
                case 2:
                opr.print(opr.head);
                break;
                case 3:
                opr.addPositionWise(2, 1000);
                break;
                case 4:
                opr.deletePositionWise(2);
                break;
                default:
                System.out.println("Wrong Choice....");
                return ;
            }
        }
        // opr.add(100);
        // opr.add(200);
        // opr.add(300);
        // opr.print(opr.head);
        // // Create a node
        // Node<Integer> node = new Node<>(100);
        // // Connect the Nodes
        // Node<Integer> node2 = new Node<>(200);
        // node.next = node2;
        // LinkedListOperations<Integer> l = new LinkedListOperations<>();
        // l.print(node);
    }
}