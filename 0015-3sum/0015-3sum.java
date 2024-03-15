class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        HashSet<List<Integer>> st= new HashSet<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> hash= new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(arr[i] + arr[j]);

                if(hash.contains(third)){
                    List<Integer> temp= Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    st.add(temp);
                }
                hash.add(arr[j]);
            }
        }

        List<List<Integer>> ans= new ArrayList(st);
        return ans;
    }
}