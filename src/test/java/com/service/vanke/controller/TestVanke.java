package com.service.vanke.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestVanke {

        VankeDelegate vankeDelegate = new VankeDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = vankeDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}