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
        ListNode first=head;
        ListNode sec=head;
        while(first!=null &&first.next!=null ){
            first=first.next.next;
            sec=sec.next;
            if(first==sec){
                return true;
            }
            }
        


     return false;   
    }
    }
