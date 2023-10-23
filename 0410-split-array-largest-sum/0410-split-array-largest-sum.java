class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;

        for(int i=0; i<nums.length;i++){
            start= Math.max(start, nums[i]); //in the end of the loop this will contain the maximum element in the array
            end+= nums[i];
        }

        //Binary Search
        while(start<end){
            int mid=(start+end)/2;

            //calculate the number of picese divide this into max sum

            int sum=0;
            int pieces=1;
            for(int num: nums){
                if(sum +num>mid){
                    //you cannot add this subarray, make new one
                    //say you add this num in new subarray, then sun=num

                    sum=num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces >k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end; //start==end
    }
}