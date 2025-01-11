class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length()){
            return false;
        }
        HashMap<Character, Integer> mpp= new HashMap<>();

        for(char c: s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }

        int odd=0;

        for(int c: mpp.values()){
            if(c%2 != 0){
                odd++;
            }
        }
        return odd<=k;
    }
}