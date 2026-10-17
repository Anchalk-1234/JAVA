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
         ListNode slow = head, fast = head;//srt both fast 2 and slow 1

         while (fast != null && fast.next != null) {//advance both at diff speed until they meet
           fast = fast.next.next;
           slow = slow.next;

           if (slow == fast) {//as soon as they meet srt fast  from head again and move at samee speed
             while (head != slow) {
               head = head.next;
               slow = slow.next;
             }
             return slow;
           }
         }
         return null; 
    }
}