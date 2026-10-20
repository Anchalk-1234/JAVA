/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;//prev node to store karwaya
        while (node != null && node.next != null) {
            node.val = node.next.val;//next node ki value curr m copy
            prev = node;//curr ko prevb ,m save kiya
            node = node.next;//kjagha orihgnal h waha move hua
        }
        
        if (node != null) {
            if (prev != null)//check prev node avil h ki nhi
                prev.next = null;
            else
                node = null;
    }
    }
}