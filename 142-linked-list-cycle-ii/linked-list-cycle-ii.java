/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> map = new HashSet<>();

        ListNode temp = head;
        while(temp!=null){
            if(!map.add(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }
}