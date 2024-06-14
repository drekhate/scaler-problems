package scaler;

import java.util.Scanner;
import java.util.Stack;

public class ValidateBracketString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(validateBracketString(str));
    }

    private static boolean validateBracketString(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i ++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.empty() || st.peek() != '(') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == '}') {
                if (st.empty() || st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == ']') {
                if (st.empty() || st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.empty();
    }
}
