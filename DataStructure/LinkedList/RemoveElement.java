package DataStructure.LinkedList;

public class RemoveElement {
    ListNode head;

    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode next = null;
        if (head == null)
            return null;

        // if(head.val==val)
        // { head=head.next;}
        ListNode curr = head;

        while (curr != null) {
            next = curr.next;

            if (curr.val == val) {
                if (prev != null) {
                    prev.next = next;
                } else {
                    head = next;
                }

            } else {

                prev = curr;
            }

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
        RemoveElement list = new RemoveElement();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);

        System.out.println("Given Linked list");
        list.printList(list.head);
        ListNode newhead = list.removeElements(list.head, 4);
        System.out.println("");
        System.out.println("Modified linked list ");
        list.printList(newhead);
    }

}