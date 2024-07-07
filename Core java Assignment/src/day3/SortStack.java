//Q1) STACK SORTING IN-PLACE
//YOU MUST WRITE A FUNCTION TO SORT A STACK SUCH THAT THE SMALLEST ITEMS ARE ON THE TOP. YOU CAN USE AN ADDITIONAL TEMPORARY STACK, BUT YOU MAY NOT COPY THE ELEMENTS INTO ANY OTHER DATA STRUCTURE SUCH AS AN ARRAY. THE STACK SUPPORTS THE FOLLOWING OPERATIONS: PUSH, POP, PEEK, AND ISEMPTY.


package day3;

import java.util.Stack;
public class SortStack {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            // Pop the top element from the original stack
            int current = stack.pop();

            // While temporary stack is not empty and top of tempStack is greater than current
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                // Pop from tempStack and push it back to the original stack
                stack.push(tempStack.pop());
            }

            // Push the current element to tempStack
            tempStack.push(current);
        }

        // Transfer the elements back from tempStack to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(76);
        stack.push(43);
        stack.push(87);
        stack.push(27);
        stack.push(12);
        stack.push(64);

        System.out.println("The Stack before sorting  :  "+ stack);

        sortStack(stack);

        System.out.println("The Stack After sorting  :  " + stack);
    }
}

