//Q1) SEARCHING FOR A SEQUENCE IN A STACK
//GIVEN A STACK AND A SMALLER ARRAY REPRESENTING A SEQUENCE, WRITE A FUNCTION THAT DETERMINES IF THE SEQUENCE IS PRESENT IN THE STACK. CONSIDER THE SEQUENCE PRESENT IF, UPON POPPING THE ELEMENTS, ALL ELEMENTS OF THE ARRAY APPEAR CONSECUTIVELY IN THE STACK.


package day4;



import java.util.Stack;


public class SearchSequence {

    public static boolean isSequencePresent(Stack<Integer> stack, int[] sequence) {

        // Convert stack to an array
        Integer[] stackArray = stack.toArray(new Integer[0]);

        
        // Get lengths of stack array and sequence
        int stackLength = stackArray.length;
        int sequenceLength = sequence.length;


        // Iterate through stack array to find sequence
        for (int i = 0; i <= stackLength - sequenceLength; i++) {
            boolean temp = true;
            
            for (int j = 0; j < sequenceLength; j++) {
                if (!stackArray[i + j].equals(sequence[j])) {
                    temp = false;
                    break;
                }
            }

            if (temp) {
                return true;
            }
        }

        return false;
    }


   //Main Method
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int[] sequence = {10,20,30};

        System.out.println("Is sequence present: " + isSequencePresent(stack, sequence));

    }
}





