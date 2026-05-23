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
    int len = 0;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = head;
    while(cur != null){
        len++;
        cur = cur.next;
    }
    int pos = len - n;
    ListNode prev = dummy;
    for(int i = 0; i < pos; i++){
        prev = prev.next;
    }
    prev.next = prev.next.next;
    return dummy.next;
}
}