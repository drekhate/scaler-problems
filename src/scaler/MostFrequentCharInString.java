package scaler;

import java.util.Scanner;

public class MostFrequentCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ans = mostFrequentCharInString(str);
        System.out.println(ans);
    }
    public static char mostFrequentCharInString(String str) {
//        freq array
        int[] freq = new int[128];
        int count = 0;
        char ans = '\u0000';
        for (int i = 0; i < str.length(); i ++) {
            char ch = str.charAt(i);
            freq[ch] ++;
        }
        for (int i = 0; i < freq.length; i ++) {
            if(freq[i] > count) {
                count = freq[i];
                ans = (char) i;
            }
        }
        return ans;
    }
}
