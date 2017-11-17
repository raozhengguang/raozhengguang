package com.service.controller;

import com.service.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestRaozhengguang {

    RaozhengguangImpl raozhengguangImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        raozhengguangImpl = BeanUtils.getBean("raozhengguangImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: raozhengguangImpl.add(Integer a, Integer b)
        Integer returnValue = raozhengguangImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: raozhengguangImpl.sayHei(String name)
        String returnValue = raozhengguangImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: raozhengguangImpl.sayHello(String name)
        String returnValue = raozhengguangImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: raozhengguangImpl.sayHi(String name)
        String returnValue = raozhengguangImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: raozhengguangImpl.saySomething(String prefix, Person user)
        String returnValue = raozhengguangImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



