/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        ListNode point_one = head;
        ListNode point_two = head;
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        while(point_one.next != null && point_two.next != null){
            if(point_one.next.next != null){
                point_one = point_one.next.next;
            }else break;
            if(point_two.next != null){
                point_two = point_two.next;
            }else break;
            
            
            if(point_one == point_two){
                return true;
            }
        }

        return false;
    }
}
