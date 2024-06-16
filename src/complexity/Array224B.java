package complexity;

public class Array224B {
    public static void main(String[] args){
        int n = 7;
        int k = 4;
//        int[] a = {1,1,2,2,3,3,4,5};
//        int[] a = {1,2,2,3};

        int[] a = {4, 7, 7, 4, 7, 4, 7};
        int l = 0, r = 0;
        int distinctCount = 1;
        int flag = 0;
        for(int i = 1; i < n; i++){
            int j = 0;
            for(j = 0; j < i;j++){
                if(a[i] == a[j]) break;
            }
            if(i==j) distinctCount++;
            if (distinctCount == 2) l = j;
            if(distinctCount == k) {
                System.out.println(l + " " + (i+1));
                flag=1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("-1 -1");
        }
    }
}
