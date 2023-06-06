package I_easy.Q14_longest_common_prefix;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_Q14 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        String first = strs[0];
        for(int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != c) return first.substring(0, i);
            }
        }

        return first;
    }
}
