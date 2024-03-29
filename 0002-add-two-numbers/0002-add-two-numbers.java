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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int x = (temp1 != null) ? temp1.val : 0;
            int y = (temp2 != null) ? temp2.val : 0;

            int sum = carry + x + y;

            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;

            current.next = newNode;
            current = current.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }

        return dummyHead.next;
    }
}
