class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start< end){
            int mid= (start+end)/2;

            if(arr[mid] > arr[mid+1]){
                //possibly this is the highest element 
                end=mid;
            }else{
                // if above condition not true then change the start location
                start=mid+1;
            }
        }
        // start == end you can return anything
        return start;
    }
}