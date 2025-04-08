package ValidParanthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackOfParanthesis = new Stack<>();
        stackOfParanthesis.push(s.charAt(0));

        Map<Character, Character> closedParanMap = new HashMap<>();
        closedParanMap.put(')', '(');
        closedParanMap.put('}', '{');
        closedParanMap.put(']', '[');

        for(int i = 1; i < s.length(); i++) {
            if(closedParanMap.get(s.charAt(i)) == null) {
                stackOfParanthesis.push(s.charAt(i));
            } else {
                if(stackOfParanthesis.empty() || stackOfParanthesis.pop() != closedParanMap.get(s.charAt(i))) {
                    return false;
                }
            }
        }

        return stackOfParanthesis.empty();
    }
}
