package complexity;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int j = 0, sum = 0, read_book = 0;

        for(int i = 0; i < n; i++) {
            sum += a[i];
            if (sum <= t) {
                read_book++;
            } else {
                sum -= a[j];
                j++;
            }
        }
        System.out.print(read_book);
    }
}
