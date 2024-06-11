package string_and_dynamic_array;

import java.util.Scanner;

public class VitalyAndString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] chars = t.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--){
            if(chars[i] == 'a'){
                chars[i] = 'z';
            }else{
                chars[i]--;
                break;
            }
        }
        String middle = new String(chars);
        System.out.println(middle.equals(s) ? "No such string":middle);
    }
}
