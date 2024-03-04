class Solution {
    public void sortColors(int[] arr) {
        int n= arr.length;
        int count0=0,count1=0,count2=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count0++;
            }else if(arr[i]==1){
                count1++;
            }else{
                count2++;
            }
        }

        for(int j=0;j<n;j++){
            if(j<count0){
                arr[j]=0;
            }else if(j<(count0+count1)){
                arr[j]=1;
            }else {
                arr[j]=2;
            }
        }
    }
}