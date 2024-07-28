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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tempNode = dummy;
        while(tempNode.next != null){
            if(tempNode.next.val == val){
                tempNode.next = tempNode.next.next;
            }else{
                tempNode = tempNode.next;
            }
        }
        return dummy.next;
    }
}
