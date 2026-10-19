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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
    
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;
      
        while(fast !=  null && fast.next != null){  //middle of linked list
            temp = slow;
            slow = slow.next;          
            fast = fast.next.next;  
        }   
        temp.next = null;            
        ListNode l1 = sortList(head);  //2  (gived head of sorted k baad ll) 
        ListNode l2 = sortList(slow);  //1 

        return mergelist(l1, l2);            
    }
    
    ListNode mergelist(ListNode l1, ListNode l2){
         
    ListNode returnNode = new ListNode(Integer.MIN_VALUE);//create dummy to return ans merge list k last node ko treck karta h
    ListNode headNode = returnNode;//(return node ko ageh move krege but head node srtin pos p h rahega)

    while (l1 != null && l2 != null) {//treverse l1 and l2
      if (l1.val <= l2.val) {
        returnNode.next = l1;//assign kardeya new lsit ko l1++
        l1 = l1.next;
      } else {
        returnNode.next = l2;
        l2 = l2.next;
      }
      returnNode = returnNode.next;
    }
    
    if (l1 == null) {//remaing list kpo add ;l1 ktm to l2 keh elmts add
      returnNode.next = l2;
    } else if (l2 == null) {
      returnNode.next = l1;
    }
    return headNode.next;
    }
}