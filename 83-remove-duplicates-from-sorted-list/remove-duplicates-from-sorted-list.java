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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;//last unique node ko point karta h
        ListNode temp = prev.next;//hageh node ko check krta h

        while (temp != null) {
            if (temp.val == prev.val) {
                temp = temp.next;
                continue;//duplicate hai to continye kiya
            }
            prev.next = temp;//ager value diff hai to preq ko unique s connect kro
            prev = temp;//last uniqye  node bnagya y
            temp = temp.next;//next nodemoo checlk
        }

        prev.next = null;
        return head;
    }
}