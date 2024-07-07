//Q2) REMOVING DUPLICATES FROM A SORTED LINKED LIST
//A SORTED LINKED LIST HAS BEEN CONSTRUCTED WITH REPEATED ELEMENTS. DESCRIBE AN ALGORITHM TO REMOVE ALL DUPLICATES FROM THE LINKED LIST EFFICIENTLY.



package day3;

// Create Node
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
    	val = x;
    	next = null;
    	
    }
}


//Removing duplicate nodes from list
public class RemoveDuplicates {
    public static ListNode removeDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return head;
    }
    
    
    // printing the Linked List
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    
    
    //Main method
    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(5);
        
        

        System.out.println("Original list:");
        printList(head);

        head = removeDuplicates(head);
 
        System.out.println("\nList after removing duplicates:");
        printList(head);
    }
    
   
}



