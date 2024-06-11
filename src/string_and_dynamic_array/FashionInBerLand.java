package string_and_dynamic_array;

class FashionInBerLand {

    static String f(int N, int[] a){
        if(N == 1 && a[0] == 0) return "No";
        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(a[i] == 0) cnt++;
        }
        return cnt == 1 || N == 1 ? "Yes":"No";
    }

    public static void main(String[] args){
        System.out.println(f(3,new int[]{1, 0, 0}));
        System.out.println(f(3,new int[]{1, 0, 1}));
        System.out.println(f(3,new int[]{1, 1, 1}));
        System.out.println(f(1,new int[]{0}));
        System.out.println(f(1,new int[]{1}));
    }
}
