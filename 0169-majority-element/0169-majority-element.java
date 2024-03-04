class Solution {
    public int majorityElement(int[] arr) {
        //Moores Voting Algorithm

        int n=arr.length;
        int element=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(count==0){
                element=arr[i];
                count=1;
            }else if(element== arr[i]){
                count++;
            }else{
                count--;
            }
        }

        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i] == element){
                count1++;
            }
        }

        if(count1 > (n/2)){
            return element;
        }
        return -1;
    }
}