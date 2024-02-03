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
        
        public ListNode kthNode(ListNode temp, int k)
    {
            k=k-1;
            while(temp!=null && k>0)
            {
                    k--;
                    temp=temp.next;
            }
            return temp;
    }    
    public ListNode rotateRight(ListNode head, int k) {
            
            
        ListNode temp = head;
            int count=0;
            while(temp!=null)
            {
                    count++;
                    temp=temp.next;
            }
            if(head==null || head.next==null||k==0||k%count==0)
                    return head;
            
            int rotate = k%count;
            ListNode knode=kthNode(head,count-rotate);
            
            ListNode newNode=knode.next;
            ListNode newHead=newNode;
            knode.next=null;
            while(newNode.next!=null)
            {
                    newNode=newNode.next;
            }
            newNode.next=head;
            return newHead;

    }
}