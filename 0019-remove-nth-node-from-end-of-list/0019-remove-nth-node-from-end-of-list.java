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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        
        ListNode first=head;
        while(first!=null){
            count++;
            first=first.next;
        }
        int m=count-n;
        if(m==0){
            head=head.next;
            return head;
        }
        first=head;
        for(int i=0;i<m-1;i++){
            first=first.next;
        }
        first.next=first.next.next;


       

        
        return head;
    }
}