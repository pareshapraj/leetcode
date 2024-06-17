class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> mapp= new HashMap<>();

        for(int i=0;i<n;i++){
            int get= mapp.getOrDefault(nums[i], 0);
            mapp.put(nums[i],get+1);
        }

        for(Map.Entry<Integer,Integer> it: mapp.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
}