class Solution {
    public int maxSubArray(int[] arr) {
        int max_sum = arr[0];
        int current_sum= arr[0];

        for(int i=1;i<arr.length;i++){
            current_sum = Math.max(arr[i],current_sum+arr[i]);
            max_sum=Math.max(max_sum,current_sum);
        }
        return max_sum;
    }
}