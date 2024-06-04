class Solution {
    public int longestPalindrome(String s) {
        int oddCount=0;
        HashMap<Character,Integer> mapp= new HashMap<>();

        for(char ch: s.toCharArray()){
            mapp.put(ch, mapp.getOrDefault(ch,0)+1);
            if(mapp.get(ch) % 2 == 0){
                oddCount--;
            }else{
                oddCount++;
            }
        }

        if(oddCount>1){
            return s.length() - oddCount +1;
        }
        return s.length();
    }
}