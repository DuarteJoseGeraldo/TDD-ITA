package org.example;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class MyStackTest {
    private MyStack p;

    @Before
    public void initStack(){
        p = new MyStack(10);
    }
    @Test
    public void emptySatck(){

        assertTrue(p.isEmpty());
        assertEquals(0, p.size());
    }
    @Test
    public void pushOneElement(){

        p.push("primeiro");
        assertFalse(p.isEmpty());
        assertEquals(1, p.size());
        assertEquals("primeiro", p.peek());
    }
    @Test
    public void pushTwoAndPopOneElement(){
        p.push("primeiro");
        p.push("segundo");
        assertFalse(p.isEmpty());
        assertEquals(2, p.size());
        assertEquals("segundo", p.peek());
        Object element = p.pop();
        assertEquals(1, p.size());
        assertEquals("primeiro", p.peek());
        assertEquals("segundo", element);
    }

    @Test(expected = EmptyStackException.class)
    public void tryRemoveFromEmptyStack(){
        p.pop();
    }
    @Test(expected = StackOverflowError.class)
    public void addElementOnFullStack(){
        for (int i = 0; i <12 ; i++) {
            p.push("element: "+ i);
        }
    }
}
