package DataStructure.LinkedList;

class RemoveDuplicate {
    ListNode head;

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            while (next != null && curr.val == next.val) {
                next = next.next;
            }
            curr.next = next;
            curr = next;
        }
        return head;

    }

    void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicate list = new RemoveDuplicate();
        list.head = new ListNode(85);
        list.head.next = new ListNode(85);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);
        list.head.next.next.next.next = new ListNode(20);

        System.out.println("Given Linked list");
        list.printList(list.head);
        list.deleteDuplicates(list.head);
        System.out.println("");
        System.out.println("Linked list after deletion of duplicates");
        list.printList(list.head);
    }
}