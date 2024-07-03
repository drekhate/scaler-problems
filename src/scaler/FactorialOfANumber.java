package scaler;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int product = 1;
        System.out.println(factorialOfANumber(n, product));
    }

    private static int factorialOfANumber(int n, int product) {
        if (n == 1) {
            return product;
        }
        product = product * n;
        return factorialOfANumber(n - 1, product);
    }
}
