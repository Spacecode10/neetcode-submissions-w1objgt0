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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
        {
            return null;
        }
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        ListNode head;
        ListNode itr;
        if(l1.val <= l2.val)
        {
            head = l1;
            itr = l1;
            l1 = l1.next;
        }
        else
        {
            head = l2;
            itr = l2;
            l2 = l2.next;
        }
        while(l1 != null && l2 != null)
        {
           if(l1.val <= l2.val)
           {
                
                itr.next = l1;
                l1 = l1.next;
                itr = itr.next;
           }
           else
           {
                itr.next = l2;
                l2 = l2.next;
                itr = itr.next;
           } 
        }
        if(l1 != null)
        {
            itr.next = l1;
        }
        if(l2 != null)
        {
            itr.next = l2;
        }
        return head;
    }
}