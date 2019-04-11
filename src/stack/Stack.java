package stack;

public class Stack {

    private int stackSize;
    private static int actualSize;
    private Object[] stack = new Object[stackSize];

    public Stack(int size) {
        this.stackSize = size;
    }

    /**
     * @param item i would like to add this to the stack
     *             add an item to the stack
     *             Throw an exception when the stack is full and I want to add one more item
     */
    public void push(Object item) {
    }

    /**
     * @return with the last added item
     * remove the last added item
     * Throw an exception when the stack is empty and I want to pop an item
     */
    public Object pop() {
        return null;
    }

    /**
     * @return the top item without removing it from the stack
     */
    public Object peek() {
        return null;
    }

    /**
     * @return with the stack actual size
     */
    public int getActualSize() {
        return actualSize;
    }


}
