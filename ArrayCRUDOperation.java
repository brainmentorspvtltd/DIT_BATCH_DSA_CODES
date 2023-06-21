import java.util.Arrays;
import java.util.Scanner;

class ArrayOperations{
    int arr[] ;
    int currentSize ;
    ArrayOperations(int capacity){
        arr = new int[capacity];
        currentSize = 0;
        
    }
    void add(int index, int value){
        if(index>currentSize){
            throw new RuntimeException("Position Can't be Greater than Current Size");
        }
        if(currentSize == arr.length){
            throw new RuntimeException("Array is Full....");

        }
        for(int i = currentSize-1; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = value; // Element Inserted...
        currentSize++;
        System.out.println("Element Added....");
        print();

    }
    void print(){
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    void update(int valueToSearch, int valueToUpdate){
        int index = search(valueToSearch);
        if(index == -1){
            return ;
        }
        else{
            arr[index] = valueToUpdate;
            System.out.println("Value Updated...");
            print();
        }
    }
    int search(int element){
        // Linear Search
        for(int i = -0 ; i<arr.length; i++){
            if(arr[i] == element){
                System.out.println("Element Found....");
                return i;
            }
        }
        System.out.println("Element Not Found...");
        return -1;
    }
    void remove(int element){
        if(currentSize ==0){
            throw new RuntimeException("Array is Empty ....");
        }
        int index = search(element);
        if(index ==-1){
            return ;
        }
        else{
            for(int i = index; i<currentSize-1; i++){
                arr[i] = arr[i+1];
            }
            arr[currentSize-1] = 0; // Last Index value makes 0
            currentSize--;
            System.out.println("Element Removed...");
            print();

        }

    }
    void sort(){
        Arrays.sort(arr);
        print();
    }

    void maxElement(){
        int max = arr[0];
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max Element "+max);
    }
    void minElement(){
        int min = arr[0];
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min Element "+min);
    }
}

public class ArrayCRUDOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations opr = new ArrayOperations(10);
        while(true){
            System.out.println("1. Add a New Element");
            System.out.println("2. Update ");
            System.out.println("3. Delete");
            System.out.println("4. Print");
            System.out.println("5. Search");
            System.out.println("6. Sort");
            System.out.println("7. Max Element");
            System.out.println("8. Min Element");
            System.out.println("9. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                opr.add(0, 100);
                opr.add(1, 200);
                opr.add(0,300);
                opr.add(1,20);
                opr.add(2,1);
                opr.add(2,4);
                break;
                case 4:
                opr.print();
                break;
                case 2:
                opr.update(20, 2000);
                break;
                case 3:
                opr.remove(300);
                break;
                case 5:
                opr.search(20);
                break;
                case 6:
                opr.sort();
                break;
                case 7:
                opr.maxElement();
                break;
                case 8:
                opr.minElement();
                break;
                case 9:
                System.out.println("Thanks for Using...");
                return ;
                default:
                System.out.println("Wrong choice....");
            }

        }
    }
}
