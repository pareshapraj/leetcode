class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if(n==0){
            return 0;
        }

        HashSet<Integer> set= new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int longest=0;
        for(int it: set){
            if(!set.contains(it-1)){
                int count=1;
                int x=it;

                while(set.contains(x+1)){
                    count+=1;
                    x+=1;
                }
                longest= Math.max(longest,count);
            }
        }
        return longest;
    }
}