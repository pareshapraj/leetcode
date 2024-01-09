class Solution {

    // imp qestion needs to do it properly
    
    public int[] twoSum(int[] A, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for(int i = 0, a;; i++){
        
            if(map.containsKey(A[i]))
        
                return new int[]{i, map.get(A[i])};
            map.put(k - A[i], i);
        }
    }
}