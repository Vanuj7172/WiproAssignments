//Q2) QUEUE SORTING WITH LIMITED SPACE
//YOU HAVE A QUEUE OF INTEGERS THAT YOU NEED TO SORT. YOU CAN ONLY USE ADDITIONAL SPACE EQUIVALENT TO ONE STACK. DESCRIBE THE STEPS YOU WOULD TAKE TO SORT THE ELEMENTS IN THE QUEUE.  
//



package day2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueSort {
	
	
	public static void sortQueue(Queue<Integer> queue) {
	
		Stack<Integer> stack = new Stack<>();
		
		
		 // Move elements from stack to queue if they are greater than current
		while(!queue.isEmpty()) {
			int elementQueue = queue.poll();
			
			// Push the current element onto the stack
			if(!stack.isEmpty() && elementQueue < stack.peek() ) {
				queue.add(stack.pop());
			}
			
			stack.push(elementQueue);
			
		}
		
		  // Transfer elements back to the queue
		  while (!stack.isEmpty()) {
	            queue.add(stack.pop());
	        }
	}
	
	
	
	
	
//	main method
	public static void main(String[] args) {
		
		
		Queue<Integer> queue = new LinkedList<>();
		
		
		//adding the element in the queue
		queue.add(35);
		queue.add(12);
		queue.add(65);
		queue.add(98);
		queue.add(43);
		queue.add(90);
		queue.add(86);
		queue.add(74);
		
		System.out.println("Unsorted queue : " + queue);
		
		sortQueue(queue);
		
		System.out.println("sorted queue : " + queue);
		

	}

}
