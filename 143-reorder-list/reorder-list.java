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
    public void reorderList(ListNode head) {
    if (head == null || head.next == null) //head null or single elemnt
      return;
    //find middle hair tortuoise alfo
    ListNode p1 = head;
    ListNode p2 = head;
    while (p2.next != null && p2.next.next != null) {//after p2 reaches end p1 is at middle
      p1 = p1.next;
      p2 = p2.next.next;
    }
    // Reverse the half after middle
    ListNode preMiddle = p1;
    ListNode preCurrent = p1.next;
    while (preCurrent.next != null) {
      ListNode current = preCurrent.next;//curr ko pre cur k ahgle node p set kiya
      preCurrent.next = current.next;//npode ko purni pos s hatya
      current.next = preMiddle.next;//node ko midle k bad jodho
      preMiddle.next = current;
    }
    // Start reordering 2 pointer 
    p1 = head;
    p2 = preMiddle.next;
    while (p1 != preMiddle) {
      preMiddle.next = p2.next;//temo alg kiya p2 ko middle s
      p2.next = p1.next;//p2 ko p1 seh connect
      p1.next = p2;//p1 k badd p2 ko insert kiya
      p1 = p2.next;//dono pointer ko ageh badhya
      p2 = preMiddle.next;
    }
    }
}