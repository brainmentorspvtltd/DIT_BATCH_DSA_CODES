public class StringHalvesAreAlike {

   static boolean halvesAreAlike(String s) {
        int c1 =0;
        int c2=0;
        int n = s.length();
        String a = s.substring(0, n/2);
        String b = s.substring(n/2);

        if(n%2 !=0){
            return false;
        }

        for(int i=0;i<a.length();i++){
            if(a.charAt(i) =='a' || a.charAt(i) == 'e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i) =='u' ||a.charAt(i) =='A' || a.charAt(i) == 'E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i) =='U'){
                c1 +=1;
            }
        }

        for(int i=0;i<b.length();i++){
            if(b.charAt(i) =='a' || b.charAt(i) == 'e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i) =='u' ||b.charAt(i) =='A' || b.charAt(i) == 'E' || b.charAt(i)=='I' || b.charAt(i)=='O' || b.charAt(i) =='U'){
                c2 +=1;
            }
        }

        if(c1==c2){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("blame"));
    }
}
