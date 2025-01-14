class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        
        // If the string length is odd, it's impossible to balance
        if ((n & 1) == 1) return false;

        char[] sc = s.toCharArray();
        char[] lockedc = locked.toCharArray();

        // Check ')' OverBalanced
        int open = 0, close = 0, wild = 0;
        for (int i = 0; i < n; i++) {
            if (lockedc[i] == '0') wild++;
            else if (sc[i] == '(') open++;
            else close++;

            // If at any point close exceeds open + wild, it's invalid
            if (close > open + wild) {
                return false;
            }
        }

        // Check '(' OverBalanced
        open = close = wild = 0;
        for (int i = n - 1; i >= 0; i--) { // Traverse from right to left
            if (lockedc[i] == '0') wild++;
            else if (sc[i] == '(') open++;
            else close++;

            // If at any point open exceeds close + wild, it's invalid
            if (open > close + wild) {
                return false;
            }
        }

        return true;
    }
}
