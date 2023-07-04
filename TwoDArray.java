public class TwoDArray {
    public static void main(String[] args) {
        //int a[] = new int[10];
        int x[][] = new int[3][3];
        int [][]y = new int[3][3];
        int []z[] = new int[3][3];
        int a[][] = {{1,2,3}, {10,20,30},{1,1,2}};
        int b[][] = new int[3][];
        b[0] = new int[5];
        b[1] = new int[6];
        b[2] = new int[7];
        // Row Major Access
        for(int i = 0; i<b.length; i++){
            for(int j = 0; j<b[i].length; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        // Column Major Access
        int c[][] = new int[3][3];
        for(int i = 0; i<c.length; i++){
            for(int j = 0; j<c[i].length; j++){
                System.out.print(c[j][i]+" ");
            }
            System.out.println();
        }
        // Enhance for Loop (Java 1.5)
        // for(int[] a1 : b){
        //     for(int e : a1){
        //         System.out.print(e+" ");
        //     }
        //     System.out.println();
        // }
    }
}
