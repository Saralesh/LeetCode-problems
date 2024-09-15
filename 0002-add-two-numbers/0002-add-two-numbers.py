class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy_head = ListNode(0)
        current = dummy_head
        carry = 0
        
        # Traverse both linked lists simultaneously
        while l1 or l2:
            # Get the values of the current nodes (or 0 if node is None)
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            
            # Add the values along with the carry
            total = val1 + val2 + carry
            carry = total // 10
            digit = total % 10
            
            # Create a new node with the digit and append it to the result
            current.next = ListNode(digit)
            current = current.next
            
            # Move to the next nodes in the linked lists
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        
        # Handle the case where there's a carry at the end
        if carry > 0:
            current.next = ListNode(carry)
        
        return dummy_head.next
