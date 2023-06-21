public class ArrayWithFunction {

    static int[] disp(){
        int x[] = {10,20,30};
        return x;
    }

    static void show(int arr[]){
        arr[0] = 1000;
    }
    public static void main(String[] args) {
        int e [] = {10,20,30,40,50};
        show(e);
        for(int a : e){
            System.out.println(a);
        }
        // int y [] = disp();
        // for(int e1 : y){
        //     System.out.println(e1);
        // }

    }
}
