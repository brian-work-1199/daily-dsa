package string_and_dynamic_array;

import java.util.Scanner;

public class Passwords {
    static int calculateTimeWithPenalties(int attempts, int k) {
        int time = attempts;
        int penalties = (attempts - 1) / k;
        return time + penalties * 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] passwords = new String[n];
        for (int i = 0; i < n; i++) {
            passwords[i] = sc.next();
        }
        String correctPassword = sc.next();

        int correctLength = correctPassword.length();
        int shorterCount = 0;
        int equalCount = 0;

        for (String password : passwords) {
            int length = password.length();
            if (length < correctLength) {
                shorterCount++;
            } else if (length == correctLength) {
                equalCount++;
            }
        }

        int bestAttempts = shorterCount + 1;
        int bestTime = calculateTimeWithPenalties(bestAttempts,k);
        int worstAttempts = shorterCount + equalCount;
        int worstTime = calculateTimeWithPenalties(worstAttempts,k);
        System.out.println(bestTime + " " + worstTime);
    }
}
