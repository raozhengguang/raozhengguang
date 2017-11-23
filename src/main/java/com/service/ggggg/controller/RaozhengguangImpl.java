package com.service.ggggg.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-23T01:46:02.476Z")

@RestSchema(schemaId = "raozhengguang")
@RequestMapping(path = "/ggggg", produces = MediaType.APPLICATION_JSON)
public class RaozhengguangImpl {

    @Autowired
    private RaozhengguangDelegate userRaozhengguangDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userRaozhengguangDelegate.helloworld(name);
    }

}
