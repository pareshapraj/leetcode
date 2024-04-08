/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev =null;
        ListNode current =head;
        ListNode next = current.next;

        while(true){
            if(k < 2 || head == null){
                return head;
            }

            ListNode newEnd = current;
            ListNode last = prev;
            ListNode node = current;

            for(int i=0;i< k-1 && node != null ; i++){
                node = node.next;
            }

            if(node == null) break;

            for(int i=0; (current != null) && i<k; i++){
                current.next = prev;
                prev= current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;

            if(current == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }
}