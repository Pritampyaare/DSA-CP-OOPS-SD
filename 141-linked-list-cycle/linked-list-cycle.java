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
        ListNode slow = new ListNode(), fast = head;
        slow.next=head;
        while(true){
            if(fast==null || fast.next==null || fast.next.next==null) return false;
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next.next;
        }
    }
}