//Q1) LINKED LIST MIDDLE ELEMENT SEARCH
//YOU ARE GIVEN A SINGLY LINKED LIST. WRITE A FUNCTION TO FIND THE MIDDLE ELEMENT WITHOUT USING ANY EXTRA SPACE AND ONLY ONE TRAVERSAL THROUGH THE LINKED LIST. 
//
//


package day2;

public class MiddleElement{

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


static Node head;
	

// add method for adding node into the list

	public void add(int data) {
		
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			
			while(current.next != null){
				current = current.next;
			}
			
			current.next = newNode;	
		}
		
	} // end add method


	
// printList method for printing the LinkedList
	public void printList() {
		
		Node current = head;
		while(current != null) {
			if(current.next == null) {
				System.out.print(current.data + "");
				current = current.next;
				break;
				
			}
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		
		System.out.println();

	} //End  printList method

	
	
	
	// findMiddle method to find the middle node

    public static Node findMiddle() {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
  }  // end findMiddle node


// Main method 
    public static void main(String[] args) {

// Creating object of Linked List
    	MiddleElement list = new MiddleElement();
    	
// Calling add method for adding node in linked list
    	list.add(42);
    	list.add(58);
    	list.add(23);
    	list.add(68);
    	list.add(49);
    	list.add(38);
    	list.add(94);
    	list.add(56);
    	list.add(77);
    	list.add(88);
    	list.add(35);
    	list.add(81);
    	list.add(100);
    	
    	
    	System.out.println(" Print list : ");

// Calling printlist method  for printing the node
    	list.printList();
    	
// Calling findMiddle method for finding the middle node in the list
    	Node middle = findMiddle();
    	
       
        if (middle != null) {
            System.out.println("The middle element is: " + middle.data);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}



