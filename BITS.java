public class XOR{
    public static void main(String[] args) {
        int a = 5;
        int b = -6;
        int c = a^b;
        if(c<0){
            System.out.println("DIFFERENT");
        }
        else{
            System.out.println("SAME");
        }
       
        // PROBLEM 2 : CLEAR LSB
        System.out.print("CLEAR LSB NUM FORMED : ");
        System.out.println(a & (~1));



        // PROBLEM 3 : DISTINCT ELEMENT IN AN ARRAY

        int x =0;
        int arr[] = {10,20,20,30,30};

        for(int i=0;i<arr.length;i++){
            x = x ^ arr[i];
        }
        System.out.println("DISTINCT ELEMENT : " + x);

        // PROBLEM 4 : INCREEMENT WO ADDING +1
        System.out.print("INCREMENTED NUM : ");
        System.out.println(-(~a));

        // PROBLEM 5 : MULTIPLY BY 2.5 WITHOUT USING * OPERATOR

        int n = 10;

        System.out.print("MULTIPLIED RESULTS IS : ");
        System.out.println((n<<1) + (n>>1));


        // PROBLEM 6 : POWER OF 2

        int s = 16;
        int copy =s;
        int count = 0;
        while(s>0){
            count += s&1;
            s =s>>1;
        }

        if(count==1){
            System.out.println(copy + " : IS POWER OF 2");
        }

        // Approach 2:

        System.out.println((n&n-1) > 0 ? "Yes" : "No");


        // PROBLEM 7 : XOR WITHOUT XOR

        int b1 = 10;
        int b2 = 20;
        int b3 = b1 ^ b2;

        int b4 = (b1 & (~b2)) | (b2 & (~b1));

        System.out.println("WITH XOR : " + b3 + "     WITHOUT XOR IS : "+ b4);

    }
}