class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        //to avoid unannassary rotations
         k=k%n;

        //step 1 reverse the entire array
        reverse(nums,0 , n-1);

        //step 2 reverse the first k elements
        reverse(nums,0, k-1);

        //step 3 reverse the next whole array
        reverse(nums,k,n-1);
    }

    private static void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
        
    }
}