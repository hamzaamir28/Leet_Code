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
public class remove_nth_node_from_end_of_list {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;

        ListNode pt = head;
        ListNode pt_two = head;
        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count-n-1 < 0){
            return head.next;
        }

        if(count <= 2){
            temp = head;
            temp.next = null;
            return head;
        }
        
        for(int i = 0; i < count - n - 1; i++){
            pt = pt.next;
        }
        for(int i = 0; i < count - n + 1; i++){
            pt_two = pt_two.next;
        }

        pt.next = pt_two;

        return head;
    }
}
