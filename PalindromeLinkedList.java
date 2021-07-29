import java.util.LinkedList;

public class PalindromeLinkedList {

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

    public boolean isPalindrome(ListNode head) {

       
        int i =  head.val;
        return false;

       
    }

    public static void main(String[] args) {
        int[] list = {1, 0, 0, 1 };
        PalindromeLinkedList linkedList = new PalindromeLinkedList();
        linkedList.isPalindrome(list);
    }
}
