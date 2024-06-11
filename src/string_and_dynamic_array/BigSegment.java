package string_and_dynamic_array;

public class BigSegment {
    static int f(int N, int[][] a){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] left = new int[N];
        int[] right = new int[N];

        for(int i = 0; i < N; i++){
            int[] input = a[i];
            left[i] = input[0];
            right[i] = input[1];

            if (left[i] < min) {
                min = left[i];
            }
            if (right[i] > max) {
                max = right[i];
            }
        }

        for(int j = 0; j < N; j++){
            if(left[j] == min && right[j] == max) return j+1;
        }
        return -1;
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[][] a = new int[N][2];
//        for(int i = 0; i < N; i++){
//            for(int j = 0; j < 2; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
        int N = 4;
        int[][] a = {{4,8},{5,5},{5,7},{5,8}};
        System.out.println(f(N,a));
    }
}
