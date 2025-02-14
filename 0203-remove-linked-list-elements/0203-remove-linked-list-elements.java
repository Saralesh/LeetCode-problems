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
    public ListNode removeElements(ListNode first, int val) {
        ListNode s = new ListNode(0,first);
        ListNode ptr = first;
        while(ptr != null){
            if(ptr.val != val)
            {
                s = ptr;
             
            }
            else{
                if(ptr == first){
                    first = first.next;
                }
                else{
                s.next = ptr.next;
            }
            }
            ptr = ptr.next;
        }
        return first;
        
    }
}