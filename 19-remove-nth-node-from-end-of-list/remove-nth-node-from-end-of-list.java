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
    ListNode dummy = new ListNode(-1);//create dummy and connect with head
    dummy.next = head;

    ListNode firstPtr = dummy;
    ListNode secondPtr = dummy;

    for (int i = 0; i < n; i++) {//ek pointer kon spaces ahed kara
      secondPtr = secondPtr.next;
    }
    while(secondPtr.next != null) {//move both till next of 2 ptr is null
      firstPtr = firstPtr.next;
      secondPtr = secondPtr.next;
    }
    firstPtr.next = firstPtr.next.next;//we remove next of 1 ptr

    return dummy.next;
    }
}