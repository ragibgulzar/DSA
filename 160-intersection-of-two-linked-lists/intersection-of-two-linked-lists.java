/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode second = headB;

        while(first!=null && second!=null){
            first = first.next;
            second = second.next;
        }
        ListNode start1 = headA;
        ListNode start2 = headB;

        while(first!=null){
            start1 = start1.next;
            first = first.next;
        }
        while(second!=null){
            start2 = start2.next;
            second = second.next;
        }

        while(start1!=null && start2!=null){
            if(start1==start2){
                return start1;
            }
            start1 = start1.next;
            start2 = start2.next;
        }

        return null;
    }
}