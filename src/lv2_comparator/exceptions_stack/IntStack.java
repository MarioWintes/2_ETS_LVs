package lv2_comparator.exceptions_stack;

import lv2_comparator.exceptions_stack.stack_exceptions.StackFullException;
import lv2_comparator.exceptions_stack.stack_exceptions.StackEmptyException;

public class IntStack {

    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws StackFullException {

        if (pointer == stack.length - 1){
            throw new StackFullException("Stack overflow");
        }
        pointer++;
        stack[pointer] = value;
    }

    public int pop() throws StackEmptyException {
        if (pointer == -1){
            throw new StackEmptyException("Stack ist leer amk");
        }
        int actualValue = stack[pointer];
        stack[pointer] = 0;
        pointer--;
        return actualValue;
    }
}
