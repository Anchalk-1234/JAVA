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
    public ListNode middleNode(ListNode head) { 
    ListNode slowPtr = head;
    ListNode fastPtr = head;

    while (fastPtr != null && fastPtr.next!= null) {//jab tak fast null nhi puch jata yah last node
      slowPtr = slowPtr.next;//1 step
      fastPtr = fastPtr.next.next;///2 step
    }
    return slowPtr;//slow hamesh middle p point karga
    }
}