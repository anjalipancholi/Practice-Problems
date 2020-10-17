package LinkedLists;

public class ConvertBinaryNumberInALinkedListToInteger {

  public int getDecimalValue(ListNode head) {
    ListNode temp = head;
    int size = 0;
    if (head != null) {
      size++;
      head = head.next;
    }
    int i = 0;
    int answer = 0;
    while (temp != null) {
      if (temp.val == 1) {
        answer += Math.pow(2, size - 1 - i);
        i++;
        temp = temp.next;
      }
    }
    return answer;
  }

  public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
