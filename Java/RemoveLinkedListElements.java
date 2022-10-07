//https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) { 
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode ptr = temp;
        while(ptr.next != null)
        {
            if(ptr.next.val == val)
                ptr.next = ptr.next.next;
            else
                ptr = ptr.next;
        }
        return temp.next;       
    }
}
