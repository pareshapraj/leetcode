class Solution {
    public int longestConsecutive(int[] arr) {
        int n= arr.length;

        if(n==0){
            return 0;
        }

        // sort array
        Arrays.sort(arr);
        int lastSmaller= Integer.MIN_VALUE;
        int count=0;
        int longest=0;

        for(int i=0;i<n;i++){
            if(arr[i] - 1 == lastSmaller){
                count+=1;
                lastSmaller= arr[i];
            }else if(arr[i] != lastSmaller){
                count=1;
                lastSmaller = arr[i];
            }
            longest= Math.max(longest, count);
        }

        return longest;
    }
}