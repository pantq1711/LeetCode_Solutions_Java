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
public void reorderList(ListNode head) {
    List<ListNode> res = new ArrayList<>();
    ListNode cur = head;
    while(cur != null){
        res.add(cur);
        cur = cur.next;
    }
    int left = 0;
    int right = res.size() - 1;
    while(left < right){
        res.get(left).next = res.get(right);
        left++;
        res.get(right).next = res.get(left);
        right--;
    }
    res.get(left).next = null;
}
}