class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <=1){
            return s;
        }

        String lps="";
        int n= s.length();
        for(int i=1;i<n;i++){
            int low=i;
            int high=i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low== -1 || high == n){
                    break;
                }
            }

            String palidrome= s.substring(low+1,high);

            if(palidrome.length()> lps.length()){
                lps= palidrome;
            }
            

            //For Palidrome Even Length
            low= i-1;
            high=i;
            while(s.charAt(low)== s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == n){
                    break;
                }
            }

            palidrome=s.substring(low+1,high);
            if(palidrome.length() > lps.length()){
                lps= palidrome;
            } 
        }
        return lps;
    }
}