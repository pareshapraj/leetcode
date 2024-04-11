class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char [] arr1= s1.toCharArray();
        char [] arr2= s2.toCharArray();
        int length=0;
        if(s1.equals(s2)){
            return true;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] == arr2[i]){
                length++;
            }
        }
        if(length == (arr1.length - 2)){
             Arrays.sort(arr1);
             Arrays.sort(arr2);

            boolean isEqual= Arrays.equals(arr1,arr2);

            if(isEqual){
                return true;
            }
        }
        return false;
    }
}