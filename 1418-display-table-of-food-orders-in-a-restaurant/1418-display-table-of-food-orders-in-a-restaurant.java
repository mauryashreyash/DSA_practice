import java.util.*;

class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Set<String> foods = new TreeSet<>();
        Map<Integer, Map<String, Integer>> tables = new TreeMap<>();

        for (List<String> order : orders) {
            int table = Integer.parseInt(order.get(1));
            String food = order.get(2);

            foods.add(food);

            tables.putIfAbsent(table, new HashMap<>());
            Map<String, Integer> count = tables.get(table);

            count.put(food, count.getOrDefault(food, 0) + 1);
        }

        List<List<String>> result = new ArrayList<>();

        List<String> header = new ArrayList<>();
        header.add("Table");
        header.addAll(foods);
        result.add(header);

        for (int table : tables.keySet()) {
            List<String> row = new ArrayList<>();
            row.add(String.valueOf(table));

            Map<String, Integer> count = tables.get(table);

            for (String food : foods) {
                row.add(String.valueOf(count.getOrDefault(food, 0)));
            }

            result.add(row);
        }

        return result;
    }
}