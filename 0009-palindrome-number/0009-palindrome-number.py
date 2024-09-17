class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        summ = 0
        original_x = x
    # Storing the original value of x
        while x > 0:
            rem = x % 10
            x = x // 10
            summ = summ * 10 + rem
        return summ == original_x


        