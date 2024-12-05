package scaler;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int[] arr = {123, 121, 454, 567};
        ArrayList<String> list = new ArrayList<>();
        checkPalindromeOrNot(arr, list);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void checkPalindromeOrNot(int[] arr, ArrayList<String> list) {
        for (int i = 0; i < arr.length; i ++) {
            String str = String.valueOf(arr[i]);
            int l = 0;
            int r = str.length() - 1;
            boolean flag = false;
            while (l < r) {
                if(str.charAt(l) != str.charAt(r)) {
                    flag = true;
                    break;
                }
                l ++;
                r --;
            }
            if (flag == false) {
                list.add(str);
            }
        }
    }

}
