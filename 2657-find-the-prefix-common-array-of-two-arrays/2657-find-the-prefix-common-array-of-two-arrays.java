class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] ans = new int[A.length];

        for(int i=0;i<A.length;i++){
            boolean Found=false;
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    Found= true;
                }
                if(Found && j>=i){
                    ans[j]++;
                }
            }
        }
        return ans;
    }
}