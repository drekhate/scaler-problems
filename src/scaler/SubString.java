package scaler;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        subString(str);
    }

    private static void subString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i ++) {
            for (int j = i; j < n; j ++) {
//                for (int k = i; k <= j; k ++) {
//                    System.out.print(str.charAt(k));
//                }
//                System.out.println();
                System.out.println(str.substring(j));
            }
        }
    }
}
