class Solution {
    public int[][] merge(int[][] arr) {
        int n= arr.length;

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        List<List<Integer>> ans= new ArrayList<>();

        for(int i=0;i<n;i++){

            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size() -1).get(1)){
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1), arr[i][1]));
            }
        }

        int [][] newarr= new int[ans.size()][2];

        for(int i=0;i<ans.size();i++){
            newarr[i][0]= ans.get(i).get(0);
            newarr[i][1]= ans.get(i).get(1);
        }

        return newarr;
    }
}