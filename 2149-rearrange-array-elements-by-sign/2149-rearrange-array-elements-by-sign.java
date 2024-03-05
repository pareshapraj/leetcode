class Solution {
    public int[] rearrangeArray(int[] arr) {
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }

        for(int i=0;i<(n/2);i++){
            arr[i*2]=pos.get(i);
            arr[i*2+1]=neg.get(i);
        }

        return arr;
    }
}