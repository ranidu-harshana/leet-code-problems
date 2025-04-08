package LongestSubStringWithoutRepeatingChars;

import java.util.HashMap;
import java.util.Map;

/**
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) {
            return 1;
        }
        int finalCount = 0;
        int left = 0;

        Map<Character, Integer> hashMp = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            if(hashMp.get(s.charAt(i)) == null) {
                hashMp.put(s.charAt(i), i);
            } else {
                if(left <= hashMp.get(s.charAt(i)))
                    left = hashMp.get(s.charAt(i)) + 1;
                hashMp.put(s.charAt(i), i);
            }

            if(i + 1 - left > finalCount) {
                finalCount = i + 1 - left;
            }
        }

        return finalCount;
    }
}
