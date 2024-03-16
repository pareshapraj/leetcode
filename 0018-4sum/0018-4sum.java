class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n= arr.length;

        Set<List<Integer>> set= new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Long> hash= new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    long remain= target- sum;

                    if(hash.contains(remain)){
                        List<Integer> temp= new ArrayList();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add((int)remain);
                        temp.sort(null);
                        set.add(temp);
                    }
                    hash.add((long)arr[k]);
                }
                
            }
        }

        List<List<Integer>> ans= new ArrayList<>(set);
        return ans;
    }
}