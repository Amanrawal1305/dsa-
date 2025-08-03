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
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
        
//         ListNode temp = head;

//         while(temp != null)
//         {
//             ListNode curr = temp;

//             while(curr.next != null && curr.val == curr.next.val)
//             {
//                 curr.next = curr.next.next;
//             }

//             if(temp.next != curr.next) temp.next = curr.next;
//             temp = temp.next;
//         }

//         return head;
//     }
// }


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){
            if(set.contains(temp.val)){
               prev.next = temp.next;
            }else{
                set.add(temp.val);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;    
    }
}