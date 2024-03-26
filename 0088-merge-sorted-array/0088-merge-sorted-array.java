class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList <Integer> map= new ArrayList<>();

        for(int i=0;i<m;i++){
            map.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            map.add(nums2[i]);
        }

        Collections.sort(map);
        int i=0;
        for(int element : map){
            nums1[i]= element;
            i++;
        }
    }
}