package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;
    private java.lang.String object = "object";
    private String object2 = "object2";

    @BeforeEach
    void createNewStackWithSize2() {
        stack = new Stack(2);
    }

    @Test
    public void pushAndActualSizeWorkingWell() throws Exception {
        stack.push(object);
        assertEquals(stack.getActualSize(), 1);
    }

    @Test
    public void pushToFullStack() throws Exception {
        stack.push(object);
        stack.push(object);
        Exception exception = assertThrows(Exception.class, () -> stack.push(object));
        assertTrue(exception.getMessage().contains("Stack is full! can't insert: "));
    }

    @Test
    public void isFullWorkingWell() throws Exception {
        stack.push(object);
        assertFalse(stack.isFull());
        stack.push(object);
        assertTrue(stack.isFull());
    }

    @Test
    public void isEmptyWorkingWell() throws Exception {
        assertTrue(stack.isEmpty());
        stack.push(object);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void isPeekWorkingWellWithEmptyStack() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> stack.peek());
        assertTrue(exception.getMessage().contains("The stack is empty!"));
    }

    @Test
    public void isPeekWorkingWell() throws Exception {
        stack.push(object);
        stack.push(object2);
        assertEquals(object2, stack.peek());
    }

    @Test
    public void isPopWorkingWellWithEmptyStack() {
        Exception exception = assertThrows(Exception.class, () -> stack.pop());
        assertTrue(exception.getMessage().contains("The stack is empty! You can't pop!"));
    }

    @Test
    public void isPopWorkingWell() throws Exception {
        stack.push(object);
        stack.push(object2);
        assertEquals(object2, stack.pop());
        assertEquals(1, stack.getActualSize());
    }

}