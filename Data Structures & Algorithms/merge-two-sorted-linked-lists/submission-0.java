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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode itr = null;
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode head;
        if(l1 == null && l2 == null)
        {
            return null;
        }
        else if(l1 != null && l2 == null)
        {
            return l1;
        }
        else if(l2 != null && l1 == null)
        {
            return l2;
        }
        else if(l1.val <= l2.val)
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
        if(l2 != null)
        {
            itr.next = l2;
        }
        else if(l1 != null)
        {
            itr.next = l1;
        }
        return head;
    }
}