package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void pushAddTheNextPlace() throws Exception {
        Stack stack = new Stack(4);
        String object = "object";
        String object2 = "object2";
        stack.push(object);
        stack.push(object2);
        assertEquals(stack.getActualSize(), 2);
    }

    @Test
    public void pushToFullStack() throws Exception {
        Stack stack = new Stack(2);
        String object = "an item";
        stack.push(object);
        stack.push(object);
        Exception exception = assertThrows(Exception.class, () -> stack.push(object));
        assertTrue(exception.getMessage().contains("Stack is full! can't insert: "));
    }

    @Test
    public void isFullWorkingWell() throws Exception {
        Stack stack = new Stack(2);
        String object = "an item";
        stack.push(object);
        assertFalse(stack.isFull());
        stack.push(object);
        assertTrue(stack.isFull());
    }

    @Test
    public void isEmptyWorkingWell() throws Exception {
        Stack stack = new Stack(2);
        String object = "an item";
        assertTrue(stack.isEmpty());
        stack.push(object);
        assertFalse(stack.isEmpty());
    }

}