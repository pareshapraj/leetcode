class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int mini=Integer.MAX_VALUE,maxi=0;

        for(int i=0;i<n;i++){
            mini= Math.min(mini, arr[i]);
            maxi=Math.max(maxi,arr[i]-mini);
        }
        return maxi;
    }
}