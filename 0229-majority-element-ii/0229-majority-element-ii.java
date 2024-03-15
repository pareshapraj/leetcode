class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(list.size() == 0 || list.get(0) != arr[i]){
                int count=0;
                for(int j=0;j<n;j++){
                    if(arr[j] == arr[i]){
                        count++;
                    }
                }
                if(count > (n/3)){
                    list.add(arr[i]);
                }
            } 
            if(list.size()== 2){
                break;
            }
        }

        return list;
    }
}