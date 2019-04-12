package stack;

public class Stack {

    private int stackSize;
    private Object[] stack;
    private int topIndex;

    public Stack(int size) {
        this.stackSize = size;
        stack = new Object[size];
        topIndex = -1;
    }

    /**
     * @param item i would like to add this to the stack
     *             add an item to the stack
     *             Throw an exception when the stack is full and I want to add one more item
     */
    public void push(Object item) throws Exception {

        if (isFull()) {
            throw new Exception("Stack is full! can't insert: " + item.toString());
        }
        System.out.println("Inserted: " + item.toString());
        stack[++topIndex] = item;

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
    public Object peek() throws Exception {
        if (!isEmpty()) {
            return stack[topIndex];
        } else {
            throw new Exception("The stack is empty!");
        }
    }

    /**
     * @return with the stack actual size
     */
    public int getActualSize() {
        return topIndex + 1;
    }

    public boolean isFull() {
        return topIndex == stackSize - 1;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }


}
