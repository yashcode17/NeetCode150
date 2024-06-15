public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;

        while(cur.next != null){
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        cur.next = prev;

        return cur;
    }
}
