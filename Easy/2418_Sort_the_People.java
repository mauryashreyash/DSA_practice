class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        // Map height to name since heights are distinct
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        // Sort the heights array
        Arrays.sort(heights);

        String[] result = new String[n];
        int index = 0;
        // Fill the result array from tallest to shortest
        for (int i = n - 1; i >= 0; i--) {
            result[index++] = map.get(heights[i]);
        }

        return result;
    }
}
