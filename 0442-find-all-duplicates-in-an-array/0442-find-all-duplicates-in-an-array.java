class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans= new ArrayList<>();

        HashSet <Integer> seen = new HashSet<>();
    
        for(int a: nums){
            if(!seen.add(a)){
                ans.add(a);
            }
        }
        return ans;
    }
}