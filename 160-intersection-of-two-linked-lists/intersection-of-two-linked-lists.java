/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lenA = getListLength(headA);//length return karega 
    int lenB = getListLength(headB);

    while (lenA > lenB) {
      lenA--;//ager a bhadha hoga toh diff k jithne ++ krdo
      headA = headA.next;
    }
    while (lenB > lenA) {
      lenB--;
      headB = headB.next;
    }
    while(headA != headB) {//dono ko same distance s move kro jab tak meet mah kare 
     headA = headA.next;
      headB = headB.next;
    }
    return headA;
  }
  private int getListLength(ListNode head) {//length find karne ka fun
    int len = 0;

    while (head != null) {
      len++;
      head = head.next;
    }

    return len;  
    }
}