class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasing=1,decreasing=1;
        int maxIncreasing=1,maxDecreasing=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                increasing++;
                maxIncreasing=Math.max(maxIncreasing, increasing);
                decreasing=1;
            }else if(nums[i]<nums[i-1]){
                decreasing++;
                maxDecreasing=Math.max(maxDecreasing, decreasing);
                increasing=1;
            }else{
                increasing=1;
                decreasing=1;
            }
        }
        return Math.max(maxIncreasing,maxDecreasing);

    }
}