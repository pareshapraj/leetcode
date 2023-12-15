class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;

        while(i<arr.length){
            int correct= arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        List<Integer> ans=new ArrayList<> ();
         
        for(int a=0; a < arr.length;a++){
            if(arr[a] != a+1){
                ans.add(arr[a]);
            }
        }
        return ans;
    }

    private void swap(int [] arr, int first, int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}