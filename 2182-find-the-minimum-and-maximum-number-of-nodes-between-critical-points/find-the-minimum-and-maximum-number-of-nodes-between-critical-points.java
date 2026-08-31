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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;

        int first = -1;
        int previous = -1;
        int index = 1;
        int minDis = Integer.MAX_VALUE;

        while(curr!=null && curr.next!=null){
            if((curr.val > prev.val && curr.val > curr.next.val) || 
            (curr.val < prev.val && curr.val <  curr.next.val)){
                if(first==-1){
                    first = index;
                } else{
                    minDis = Math.min(minDis, index - previous);
                }
                previous = index;

            }
            prev = curr;
            curr =curr.next;
            index++;
        }

        if(first == -1|| first ==previous){
            return new int[] {-1,-1};
        }
        return new int[] {minDis, previous - first};
    }
}