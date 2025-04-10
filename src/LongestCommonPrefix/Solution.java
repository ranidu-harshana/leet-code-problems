package LongestCommonPrefix;

/*
* https://leetcode.com/problems/longest-common-prefix
*/
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) {
            return strs[0];
        }

        StringBuilder finalString = new StringBuilder();

        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(i > strs[j].length() - 1) {
                    return finalString.toString();
                }

                if(strs[j].isEmpty() | strs[j].charAt(i) != strs[0].charAt(i)) {
                    return finalString.toString();
                }
            }

            finalString.append(strs[0].charAt(i));
        }

        return finalString.toString();
    }
}
