public class RichestCustomerWealth {
    static void maxWealth(int [][]cust_acc){
        int max = 0;
        for(int[] acc : cust_acc){
            int sum = 0;
            for(int amt : acc){
                sum += amt;
            }

            max = Math.max(max, sum);
        }
        System.out.println("The maximum wealth is : " + max);
    }

    public static void main(String[] args) {
        int [][]cust_acc = {{4,5,6},{5,8,9},{2,4,9}};
        maxWealth(cust_acc);
    }
}
