package DataStructure.LinkedList;

import java.util.Stack;

public class Palindrome {
    ListNode head;

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> st = new Stack<Integer>();
        while (fast != null && fast.next != null) {
            st.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) // its odd number of elements in LinkedList
        {
            slow = slow.next;
        }
        while (slow != null) {
            int top = st.pop().intValue();
            if (top != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Palindrome list = new Palindrome();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next = new ListNode(15);
        list.head.next.next.next = new ListNode(85);
        System.out.println(list.isPalindrome(list.head));

    }
}