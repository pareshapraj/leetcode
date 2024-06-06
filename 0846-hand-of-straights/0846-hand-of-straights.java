class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int s= hand.length;
        if(s%groupSize == 0){
            return true;
        }
        return false;
    }
}