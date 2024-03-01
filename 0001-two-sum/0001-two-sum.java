class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int i=-1,j=-1;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{i,j};
    }
}