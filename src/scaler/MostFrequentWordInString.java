package scaler;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWordInString {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog the quick";
        String ans = mostFrequentWordInString(str);
        System.out.println(ans);
    }

    private static String mostFrequentWordInString(String str) {
        String[] array = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i ++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        String ans = "";
        int freq = 0;
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > freq) {
                freq = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
