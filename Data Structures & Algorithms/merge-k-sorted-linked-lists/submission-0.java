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
    private ListNode[] divide(ListNode[] arr, int left, int right)
    {
        ListNode[] res = new ListNode[right-left];
        for(int i = 0; i< res.length && left < right; i++)
        {
            res[i] = arr[left++];
        }
        return res;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        if (lists.length == 2) return merge(lists[0], lists[1]);
        int mid = lists.length/2;
        ListNode left = mergeKLists(divide(lists,0,mid));
        ListNode right = mergeKLists(divide(lists,mid,lists.length));
        return merge(left, right);
    }
   public ListNode merge(ListNode left, ListNode right)
{
    if(left == null) return right;
    if(right == null) return left;

    ListNode head;
    ListNode itr;

    if(left.val <= right.val)
    {
        head = left;
        left = left.next;
    }
    else
    {
        head = right;
        right = right.next;
    }

    itr = head;

    while(left != null && right != null)
    {
        if(left.val <= right.val)
        {
            itr.next = left;
            left = left.next;
        }
        else
        {
            itr.next = right;
            right = right.next;
        }
        itr = itr.next;
    }

    if(left != null)
        itr.next = left;

    if(right != null)
        itr.next = right;

    return head;
}
}
