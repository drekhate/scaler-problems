package scaler;

import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        convertStringToInteger(str);
    }

    private static void convertStringToInteger(String str) {
        int n = str.length();
        int ans = 0;
        for (int i = 0; i < n; i ++) {
            char ch = str.charAt(i);
            int ch_int = ch - '0';
            ans = ans * 10 + ch_int;

        }
        System.out.println(ans);
    }
}
