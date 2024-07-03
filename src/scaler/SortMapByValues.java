package scaler;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("b", 2);
        map.put("c", 3);
        map.put("a", 1);
        map.put("w", 1);
        sortMapByValue(map);
        for (Entry<String, Integer> keySet: map.entrySet()) {
            System.out.println(keySet.getKey() + " " + keySet.getValue());
        }
    }

    private static void sortMapByValue(Map<String, Integer> map) {
//        Map<String, Integer> collect = map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (Integer e1, Integer e2) -> {
//                    return e1;
//                }, LinkedHashMap::new));
        List<Entry<String, Integer>> toSort = new ArrayList<>();
        for (Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            toSort.add(stringIntegerEntry);
        }
        toSort.sort(Entry.comparingByValue());
        Map<String, Integer> collect = new LinkedHashMap<>();
        for (Entry<String, Integer> stringIntegerEntry : toSort) {
            collect.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
    }
}
