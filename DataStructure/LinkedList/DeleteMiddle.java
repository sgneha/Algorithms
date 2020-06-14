package DataStructure.LinkedList;

class DeleteMiddle {
    ListNode head;

    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;

    }

    void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        DeleteMiddle list = new DeleteMiddle();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);

        System.out.println("Given Linked list");
        list.printList(list.head);
        list.deleteNode(list.head.next);
        System.out.println("");
        System.out.println("Linked list after deletion");
        list.printList(list.head);
    }
}
