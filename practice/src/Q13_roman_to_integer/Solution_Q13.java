package Q13_roman_to_integer;

import java.util.Map;

public class Solution_Q13 {
    private static Map<Character, Integer> romans = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int total = 0;
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            num = romans.get(s.charAt(i));
            if(i + 1 == s.length()) {
                total += num;
                continue;
            }
            char next = s.charAt(i + 1);
            if (num < romans.get(next)) total -= num;
            else total += num;
        }

        return total;
    }
}
