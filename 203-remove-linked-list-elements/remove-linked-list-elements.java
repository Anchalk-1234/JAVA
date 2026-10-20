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
    ListNode dummy = new ListNode(-1);//craete dummy node assighn head as dummy
    dummy.next = head;

    ListNode curr = dummy;
    while (curr.next != null) {
      if (curr.next.val == val)//check value matches
        curr.next = curr.next.next;//skip
      else
        curr = curr.next;           
    }
    return dummy.next; //return head
    }
}