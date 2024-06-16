package complexity;

import java.util.Scanner;

public class ApproximatingAConstantRange {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for(int i = 0; i < n ; i++) {
//            a[i] = sc.nextInt();
//        }

//        for(int i = 0; i < a.length; i++){
//            for(int j = i+1; j < a.length; j++){
//                if(Math.abs(a[j] - a[i]) > 1) {
//                    dist = j-i;
//                    if(dist > max) max = dist;
//                    break;
//                } else {
//                    max = j;
//                }
//            }
//        }
        int[] a = new int[]{5, 4, 5, 5, 6, 7, 8, 8, 8, 7, 6};
        int count = 0, right = 0, best = 0;
        int[] fre = new int[100001];

        for(int left = 0; left < a.length; left++){
            while (right < a.length && count <= 2){
                if(count == 2 && fre[a[right]] == 0) break;
                if(fre[a[right]] == 0) count += 1;
                fre[a[right]] += 1;
                right += 1;
            }
            best = Math.max(best, right - left); //(r - 1) - l + 1 = r - l
            if(fre[a[left]] == 1) count -= 1;
            fre[a[left]] -= 1;
        }
        System.out.println(best);
    }
}
