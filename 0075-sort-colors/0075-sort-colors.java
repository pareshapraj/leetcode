class Solution {
    public void sortColors(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;
        
        while (begin < end){
            if (nums[begin] == 0){
                begin++;
            } 
            if (nums[end] != 0){
                end--;
            }
            if (nums[begin] != 0 && nums[end] == 0 && begin < end){
                int num = nums[begin];
                nums[begin] = nums[end];
                nums[end] = num;
                begin ++;
                end--;
            }
        }
        
        end = nums.length - 1;
        
        if (nums[begin] == 0){
            begin++;
        }
        
        while (begin < end){
            if (nums[begin] == 1){
                begin ++;
            } 
            if (nums[end] > 1){
                end--;
            }
            if (nums[begin] > 1 && nums[end] == 1 && begin < end){
                int num = nums[begin];
                nums[begin] = nums[end];
                nums[end] = num;
                begin ++;
                end--;
            }
        }
    }
}