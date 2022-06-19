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
    ListNode fake = new ListNode(0);
    fake.next=head;
    ListNode end=fake;
    ListNode first=fake;
    int i;
    for(i=1;i<=n+1;i++)
    {
        end=end.next;
    }
    while(end!=null)
    {
        first=first.next;
        end=end.next;
    }
    first.next=first.next.next;
    return fake.next;
    }
}