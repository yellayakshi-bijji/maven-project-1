package com.1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyAppTest{
    @Test
    public void testMyApp(){
        String message = "Hello, Maven!";
        assertTrue(message.equals("Hello, Maven!"));
    }
}