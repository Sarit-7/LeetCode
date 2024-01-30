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
        int nodeVal=1;
        ListNode curr = head;
        ListNode temp = head;    
            while(curr.next!=null)
            {
                    curr=curr.next;
                    nodeVal++;
            }
        int mid=nodeVal/2;
        int i =1;
            while(i<=mid)
            {
              temp=temp.next;
                    i++;
            }
            return temp;
    }
}