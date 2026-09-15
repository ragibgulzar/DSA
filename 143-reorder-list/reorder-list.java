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
    private ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode curr = node;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newHead = reverse(slow);

        ListNode first = head;
        ListNode second = newHead;

        while(second.next!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        
    }
}