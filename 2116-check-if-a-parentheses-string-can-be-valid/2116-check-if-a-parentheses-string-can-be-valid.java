class Solution {
    public boolean canBeValid(String s, String locked) {
        int n= s.length();
        char[] sc=s.toCharArray();
        char[] lockedc=locked.toCharArray();
        if((n&1)==1) return false;

        // cheack ')' OverBalanced

        int open=0,close=0;
        int wild=0;
        for(int i=0;i<n;i++){
            if(lockedc[i] == '0') wild++;
            else if(sc[i]== '(') open++;
            else close++;

            if(wild < (close- open)){
                return false;
            }
        }

        // check '(' overBalanced
        open = close= wild =0;
        for(int i=n-1; i>=0;i--){
            if(lockedc[i] == '0') wild++;
            else if(sc[i]== '(') open++;
            else close++;

            if(wild < (open - close)){
                return false;
            }
        }
        return true;
    }
}