class Solution {
    public String restoreString(String s, int[] indices) {
        int l=indices.length;
        String [] ans = new String[l];
        StringBuilder builder=new StringBuilder();
        
        for(int i=0;i<indices.length;i++){
            ans[indices[i]]=String.valueOf(s.charAt(i));
        }

        for(String str: ans){
            builder.append(str);
        }
        // for(int i:indices){
        //     char c=s.charAt(indices[i]);
        //     builder.append(c);
        // }
        return builder.toString();
    }
}