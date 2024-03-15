class Solution {
    public List<Integer> majorityElement(int[] arr) {
        //Optimal Solution
        //Boyers Moores voting algorithm

        int n=arr.length;

        int count1=0,count2=0;
        int element1= Integer.MIN_VALUE;
        int element2= Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(count1==0 && element2 != arr[i]){
                count1=1;
                element1 = arr[i];
            }else if(count2 == 0 && element1 != arr[i]){
                count2= 1;
                element2 = arr[i];
            }else if(arr[i]== element1){
                count1++;
            }else if(arr[i] == element2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        ArrayList<Integer> list= new ArrayList<>();
        count1=0; count2=0;

        for(int i=0;i<n;i++){
            if(arr[i]== element1) count1++;
            if(arr[i] == element2) count2++;
        }

        int mini =(int)(n/3)+1;
        if(count1 >= mini) list.add(element1);
        if(count2 >= mini) list.add(element2);

        return list;
    }
}