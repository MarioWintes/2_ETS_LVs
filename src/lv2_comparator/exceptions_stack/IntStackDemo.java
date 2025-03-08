package lv2_comparator.exceptions_stack;

import lv2_comparator.exceptions_stack.stack_exceptions.StackFullException;
import lv2_comparator.exceptions_stack.stack_exceptions.StackEmptyException;

public class IntStackDemo {

    public static void main(String[] args) {

        IntStack stack = new IntStack(2);

        try {
            stack.pop();
            stack.push(2);
            stack.push(2);
            stack.push(2);
            stack.push(2);
            stack.push(2);
            stack.push(2);
            stack.push(2);
        } catch (StackFullException e) {
            e.printStackTrace();
        } catch (StackEmptyException e) {
            throw new RuntimeException(e);
        }
    }

}
