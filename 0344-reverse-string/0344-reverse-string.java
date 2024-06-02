class Solution {
    public void reverseString(char[] s) {
        int n= s.length;

        reverse(s,0,n-1);
    }

    public void reverse(char [] arr, int start, int end){
        int i=start;
        int j=end;
        while(i<=j){
            char temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}