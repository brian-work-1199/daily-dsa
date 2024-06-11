package string_and_dynamic_array;

import java.util.Scanner;

public class Arrays {
    static String f(int[] a, int[] b, int k, int m){
        for(int i = 0; i < k; i++){
            for(int j = b.length - m; j < b.length; j++){
                if(a[i] >= b[j]) return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int na = sc.nextInt();
        int nb = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int[] nA = new int[na];
        int[] nB = new int[nb];
        for(int i = 0; i < na; i++){
            nA[i] = sc.nextInt();
        }
        for(int j = 0; j < nb; j++){
            nB[j] = sc.nextInt();
        }

        System.out.println(f(nA,nB,k,m));
    }
}
