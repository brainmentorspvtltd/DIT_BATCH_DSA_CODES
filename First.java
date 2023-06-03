class First{

    static void print(int n){
        for(int i =1 ; i<=n; i=i*2){
            System.out.println(i);
        }
    }

    static void disp(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n ; j++){
                System.out.println(Math.pow(i,j));
            }
        }
    }
    static void show(int n){
        for(int i = 1; i<=n; i++){
            if(n%2==0){
                System.out.println("Exit...");
                return ;
            }
            System.out.println(Math.pow(i,2));
        }
    }
    public static void main(String[] args) {
        show(Integer.parseInt(args[0]));
        // int x= 100;
        // int y = 200;
        // int sum = x + y;
        // int prod = x * y;
        // int div = x /y;
        // System.out.println(sum + " "+prod + " "+div);

       
    }
}