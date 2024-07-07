//Task : Merging Two Sorted Linked Lists
//You are provided with the heads of two sorted linked lists. The lists are sorted in ascending order. Create a merged linked list in ascending order from the two input lists without using any extra space (i.e., do not create any new nodes).
//

package day5;


//Create Node
class ListNode {
 int val;
 ListNode next;
 ListNode(int x) { 
 	val = x;
 	next = null;
 	
 }
}


public class MergeSortedLists {
	
	public static ListNode mergetwolists(ListNode l1, ListNode l2) {
        // If either list is empty, return the other list
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        // Initialize head and tail pointers
        ListNode head, tail;
        if (l1.val <= l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        tail = head;
        
        // Traverse and merge the lists
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        // Attach the remaining part
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        
        return head;
    }
	
	
	  public static void printList(ListNode head) {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	
	

	public static void main(String[] args) {
		
		
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(8);
        l1.next.next.next.next = new ListNode(12);
    
        
        
        
        
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(10);
        l2.next.next.next.next = new ListNode(13);
        
        
        System.out.println("List 1st : " );
        printList(l1);
        
        System.out.println("\nList 2nd : " );
        printList(l2);
        
        ListNode mergeSortedList = mergetwolists(l1 ,l2);
        
        System.out.println("\nMerge sorted Lists : ");
        printList(mergeSortedList);
        

	}

}
