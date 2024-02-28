class Solution {
    // kunal video of bitwise operatiors 
    public int singleNumber(int[] arr) {
        int n= arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int value=map.getOrDefault(arr[i],0);
            map.put(arr[i],value +1);
        }

        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
    
}