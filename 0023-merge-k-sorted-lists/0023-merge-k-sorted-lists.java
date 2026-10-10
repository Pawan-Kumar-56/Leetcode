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
    PriorityQueue<Integer> q=new PriorityQueue<>();
    public ListNode mergeKLists(ListNode[] lists) {
        for(ListNode node:lists){
            while(node!=null){
                q.offer(node.val);
                node=node.next;
            }
        }
        ListNode ans=new ListNode(0);
        ListNode curr=ans;
        while(!q.isEmpty()){
            curr.next = new ListNode(q.poll());
            curr = curr.next;
        }
        return ans.next;
    }
}