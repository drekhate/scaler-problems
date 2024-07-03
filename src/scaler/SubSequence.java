package scaler;

import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String currAns = "";
        subSequence(s, currAns);
    }

    private static void subSequence(String s, String currAns) {
        if (s.isEmpty()) {
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remainingStr = s.substring(1);
        subSequence(remainingStr, currAns + curr);
        subSequence(remainingStr, currAns);
    }
}
