public class AtoI {

    static int ConvertAtoI(String s){
        int n = s.length();
        int sign = 1;
        int index = 0;
        int r =0;

        //Spaces
        while(index<n && s.charAt(index) == ' '){
            index++;
        }

        //Sign
        if(index<n && s.charAt(index) == '+'){
            sign =1;
            index++;
        }
        else{
            if(index<n && s.charAt(index)=='-'){
                sign = -1;
                index++;
            }
        }

        while(index<n && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';
            if(r>=Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            else
                if (r <= (Integer.MIN_VALUE/10)){
                return Integer.MIN_VALUE;
            }
            r = 10 * r +digit;
            index++;
        }
        return r * sign;
    }
    public static void main(String[] args) {
        String s ="-249";
        System.out.println(ConvertAtoI(s));
    }
}
