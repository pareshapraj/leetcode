class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int n = nums.length;
        map.put(0,1);
        int preSum= 0, count =0;

        for(int i=0;i<n;i++){

            preSum += nums[i];

            if(map.containsKey(preSum - k)){
                count += map.get(preSum -k);
            }
            map.put(preSum , map.getOrDefault(preSum , 0)+1);
        }
        return count;
    }
}