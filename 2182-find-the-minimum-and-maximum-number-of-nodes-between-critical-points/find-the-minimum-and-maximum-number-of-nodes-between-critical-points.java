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
        ArrayList<Integer> list = new ArrayList<>();

        ListNode node = head;
        int count = 1;
        while(node.next.next!=null){
            if(node.next.val<node.val &&  node.next.val < node.next.next.val ){
                list.add(count);
            } 
            if(node.next.val>node.val &&  node.next.val > node.next.next.val ){
                list.add(count);
            } 
            node = node.next;
            count++;
        }
        //System.out.println(list);
        if(list.size()==0 || list.size()==1){
            return new int[] {-1,-1};
        }

        int min = Integer.MAX_VALUE;
        int max =  list.get(list.size()-1)- list.get(0);

        for(int i = 1; i < list.size(); i++){
            min = Math.min(list.get(i)-list.get(i-1), min);
        }

        return new int[] {min,max};

    }
}