package scaler;

import java.util.Scanner;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        lengthOfLongestSubstring(str);
    }

    private static void lengthOfLongestSubstring(String str) {
        int n = str.length();
        int start = 0;
        int end = 0;
//        int ans = 0;
        String ans = "";
        int[] freq = new int[128];
        while (end < n) {
            freq[str.charAt(end)] ++;
            while (freq[str.charAt(end)] > 1) {
                freq[str.charAt(end)] --;
                start ++;
            }
//            ans = Math.max(ans, end - start + 1);
            if (ans.length() < (end - start + 1)) {
                ans = str.substring(start, end + 1);
            }
            end ++;
        }
        System.out.println(ans);
    }
}
