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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int size = 0;
        while(node!=null){
            node=node.next;
            size+=1;
        }
        if(n==size){
            return head.next;
        }
        node = head;
        for(int i=0;i<size-n-1;i++){
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
}