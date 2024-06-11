package scaler;

import java.util.Scanner;

public class PalindromeStringCheckWithoutTemp {
    public static void main(String[] args) {
        System.out.println("Enter String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindromeStringCheckWithoutTemp(str);
    }

    private static void palindromeStringCheckWithoutTemp(String str) {
        int left = 0;
        int right = str.length() - 1;
        boolean flag = false;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not Palindrome");
                flag = true;
                break;
            }
            left ++;
            right --;
        }
        if (flag == false) {
            System.out.println("Palindrome");
        }
    }
}
