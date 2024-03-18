class Solution {
    public int[][] merge(int[][] arr) {
        int n= arr.length;

        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int []a, int []b){
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans= new ArrayList<>();

        for(int i=0;i<n;i++){
            int start= arr[i][0];
            int end= arr[i][1];

            if(!ans.isEmpty() && end <= ans.get(ans.size() -1).get(1)){
                continue;
            }

            for(int j=i+1; j<n;j++){
                if(arr[j][0] <= end){
                    end = Math.max(end, arr[j][1]);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        int[][] answerArray = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            answerArray[i][0] = ans.get(i).get(0);
            answerArray[i][1] = ans.get(i).get(1);
        }

        return answerArray;
    }
}