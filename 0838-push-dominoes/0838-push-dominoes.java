class Solution {
    public String pushDominoes(String dominoes) {
        String s = "L" + dominoes + "R";
        StringBuilder result = new StringBuilder();

        int left = 0;

        for (int right = 1; right < s.length(); right++) {
            if (s.charAt(right) == '.') {
                continue;
            }

            int gap = right - left - 1;

            if (left > 0) {
                result.append(s.charAt(left));
            }

            if (s.charAt(left) == s.charAt(right)) {
                for (int i = 0; i < gap; i++) {
                    result.append(s.charAt(left));
                }
            } else if (s.charAt(left) == 'R' && s.charAt(right) == 'L') {
                for (int i = 0; i < gap / 2; i++) {
                    result.append('R');
                }

                if (gap % 2 == 1) {
                    result.append('.');
                }

                for (int i = 0; i < gap / 2; i++) {
                    result.append('L');
                }
            } else {
                for (int i = 0; i < gap; i++) {
                    result.append('.');
                }
            }

            left = right;
        }

        return result.toString();
    }
}