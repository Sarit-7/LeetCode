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
    public ListNode partition(ListNode head, int x) {
       
            ListNode start=new ListNode(-1);
            ListNode low=start;
            ListNode mid=new ListNode(-1);
            ListNode high=mid;
            
            ListNode temp=head;
           
            while(temp!=null)
            {
                    if(temp.val<x)
                    {
                            low.next=temp;
                            low=low.next;
                            temp=temp.next;
                            low.next=null;
                    
                    }
                    else
                    {
                            high.next=temp;
                            high=high.next;
                            temp=temp.next;
                            high.next=null;
                    }
                    
                    
                    
            }
            low.next=mid.next;
            return start.next;
    }
}
