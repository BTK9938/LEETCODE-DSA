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
    public ListNode middleNode(ListNode head) {
        int length=1;
        ListNode temp=head;
        int mid=1;

        while(temp.next!=null)
        {
             temp=temp.next;
            length++;

        }
       // System.out.println(length/2);
        if(length%2==0)
         mid=1+length/2;
        else
         mid=1+length/2;
        temp=head;
        while(mid-->1){
            head=head.next;
        }
        return head;
        
    }
}