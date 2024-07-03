package scaler;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);
        fibonacciSequence(n - 2, first, second);
    }

    private static void fibonacciSequence(int n, int first, int second) {
//        base condition
        if (n == 0) {
            return;
        }
//        self work
        int next = first + second;
        first = second;
        second = next;
        System.out.print(" " + next);
//        recursive work
        fibonacciSequence(n - 1, first, second);
    }
}
