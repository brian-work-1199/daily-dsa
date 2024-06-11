package string_and_dynamic_array;

public class SuffixStructures {

    static boolean isSubsequence(String s, String t){
        int i = 0, j = 0;
        for(i = 0 ; i < s.length() && j < t.length(); i++){
            if(s.charAt(i) == t.charAt(j)) j++;
        }
        return j == t.length();
    }

    static boolean canBeFormedByRemovingCharacters(String s, String t) {
        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char c : s.toCharArray()) {
            countS[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            countT[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (countT[i] > countS[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "need";
        String t = "tree";
        boolean isSubsequence = isSubsequence(s, t);
        boolean canBeArray = canBeFormedByRemovingCharacters(s, t);

        if (isSubsequence) {
            if (s.length() == t.length()) {
                System.out.println("array");
            } else {
                System.out.println("automaton");
            }
        } else if (canBeArray) {
            if (s.length() == t.length()) {
                System.out.println("array");
            } else {
                System.out.println("both");
            }
        } else {
            System.out.println("need tree");
        }
    }
}
