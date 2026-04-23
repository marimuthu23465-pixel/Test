
package com.mycompany.stringoperations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringOperationsTest 
{

    StringOperations obj = new StringOperations();

    @Test
    public void testDuplicate() 
    {
        assertEquals("a", obj.duplicate("java"));
    }

    @Test
    public void testRemoveSpace()
    {
        assertEquals("helloworld", obj.removeSpace("hello world"));
    }

    @Test
    public void testReverse() 
    {
        assertEquals("avaj", obj.reverse("java"));
    }
}
