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
        ListNode ta=headA;
        ListNode tb=headB;
        while(ta!=tb){
            if(ta==null)
            ta=headA;
            else
            ta=ta.next;
            if(tb==null)
            tb=headB;
            else
            tb=tb.next;

        }
    
        
        return ta;
    }
}