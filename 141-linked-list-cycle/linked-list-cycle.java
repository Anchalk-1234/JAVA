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
    public boolean hasCycle(ListNode head) {
            ListNode slowPtr = head;//srt slow and fast pointer 
            ListNode fastPtr = head;
            
            while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
                
              // Advance both the pointers
              slowPtr = slowPtr.next;//1 place
              fastPtr = fastPtr.next.next;//2 place
              
            
              if (slowPtr == fastPtr) {//ager meet hua toh loop h
                return true;
              }
            }
            return false;///jab null hua reach 
    }
}