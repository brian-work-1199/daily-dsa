package string_and_dynamic_array;

import java.util.Scanner;

public class BearAndGame {
    static int f(int[] a){
        if(a[0] > 15) return 15;
        for(int i = 1; i < a.length; i++){
            if(a[i] - a[i-1] > 15) return a[i-1] + 15;
        }
        return a[a.length -1];
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int value;
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            value = in.nextInt();
            a[i] = value;
        }
        System.out.println(f(a));
    }

}
