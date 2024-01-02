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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = new ListNode(), fast = new ListNode();
        slow.next=head; fast.next=head;
        while(true){
            if(fast.next==null || fast.next.next==null) return null;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        slow=slow.next;
        while(head!=slow){
            head=head.next; slow=slow.next;
        }
        return slow;
    }
}