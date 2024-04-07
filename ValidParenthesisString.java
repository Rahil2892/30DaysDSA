class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0; // Minimum count of unmatched opening parentheses
        int maxOpen = 0; // Maximum count of unmatched opening parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++; // Increment count of unmatched opening parentheses
                maxOpen++;
            } else if (c == ')') {
                minOpen = Math.max(minOpen - 1, 0); // Decrement count of unmatched opening parentheses
                maxOpen--; // Decrement count of unmatched opening parentheses
                if (maxOpen < 0) {
                    return false; // More closing parentheses than opening parentheses
                }
            } else { // Asterisk '*'
                minOpen = Math.max(minOpen - 1, 0); // Treat '*' as '('
                maxOpen++; // Treat '*' as ')' or '('
            }
        }

        return minOpen == 0; // All opening parentheses are matched
    }
}
