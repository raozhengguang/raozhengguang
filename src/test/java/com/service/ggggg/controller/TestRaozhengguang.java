package com.service.ggggg.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestRaozhengguang {

        RaozhengguangDelegate raozhengguangDelegate = new RaozhengguangDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = raozhengguangDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}