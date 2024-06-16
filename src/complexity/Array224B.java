package complexity;

import java.util.Scanner;

public class Array224B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int r = 0;
        int distinctCount = 0;
        int[] fre = new int[100001];

        for(int l = 0; l < n; l++){
            while(r < a.length && distinctCount < k){
                if(fre[a[r]] == 0) distinctCount += 1;
                fre[a[r]] += 1;
                r += 1;
            }
            if(distinctCount == k) {
                fre[a[l]] -= 1;
                if (fre[a[l]] == 0) {
                    System.out.printf("%d %d", l + 1, r);
                    return;
                }
            }
        }
        System.out.println("-1 -1");
    }
}
