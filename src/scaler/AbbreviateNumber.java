package scaler;

import java.util.Scanner;

public class AbbreviateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(abbreviateNumber(n));
    }

    private static String abbreviateNumber(long n) {
        String[] suffixes = {"", "K", "M", "B", "T", "P" , "E"};
        int magnitude = 0;
        magnitude = (int) (Math.log10(n)/3);
        return n / Math.pow(1000, magnitude) + suffixes[magnitude];
    }
}
