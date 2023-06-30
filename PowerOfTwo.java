import java.util.Scanner;

public class PowerOfTwo {

   


    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPowerofTwo(n));
        System.out.println(approach2(n));
    }
}
