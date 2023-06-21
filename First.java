class First{
    public static void main(String[] args) {
        int mul[][] = {{10,20},{30,40,50}, {60,70,80,90}};
        // Traditional Loop
        // for(int i = 0; i<mul.length; i++){
        //     for(int j = 0; j<mul[i].length; j++){
        //         System.out.print(mul[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // Enhance for Loop
        for(int e[] : mul){
            for(int element : e){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        double a [] = new double[10];
       // System.out.println(a); // a.toString()
        int arr[] = {10,20,30,40,50};
        // for(int i = 0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        // Enhance for Loop (Java 1.5 onwards)
        // for(int element : arr){
        //     System.out.println(element);
        // }
        // for(double ele : a ){
        //     System.out.println(ele);
        // }
        //System.out.println(arr.length);
        //System.out.println(arr); // arr.toString() (Object class)
        // toString - className@HashCode
    }
}