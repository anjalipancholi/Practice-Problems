package LinkedLists;

public class DeleteNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        if (node.val == node.next.val) {
            node.next = node.next.next;
        }
    }
}
