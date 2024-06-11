package string_and_dynamic_array;

public class NightAtTheMuseum {

    static int f(char[] c){
        char startChar = 'a';
        int sum = 0;
        for(int i = 0; i < c.length; i++){
            if(Math.abs(startChar - c[i]) > 13){
                sum += (26 % Math.abs(c[i] - startChar));
            } else {
                sum += Math.abs(startChar - c[i]);
            }
            startChar = c[i];
        }
        return sum;
    }

    public static void main (String[] args){
        System.out.println(f(new char[]{'a','r','e','s'}));
    }
}
