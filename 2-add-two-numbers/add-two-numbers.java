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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);//result store actual ans as 0 hai phle
    ListNode ptr = result;

    int carry = 0;//srt m 0 hai carry

    while (l1 != null || l2 != null) {
      int sum = 0 + carry;//sum

      if (l1 != null) {   // Use number from first list
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {   // Use number from 2nd list
        sum += l2.val;
        l2 = l2.next;
      }
      carry = sum / 10; //syum carry
      sum = sum % 10;

      ptr.next = new ListNode(sum);//next node bnya or assign kiya next value
      ptr = ptr.next;
    }
    if (carry == 1) ptr.next = new ListNode(1);//ager carry 1 bache last m toh ek or node baya
    return result.next;
    }
}