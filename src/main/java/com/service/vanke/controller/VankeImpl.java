package com.service.vanke.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-13T01:40:11.192Z")

@RestSchema(schemaId = "vanke")
@RequestMapping(path = "/vanke", produces = MediaType.APPLICATION_JSON)
public class VankeImpl {

    @Autowired
    private VankeDelegate userVankeDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userVankeDelegate.helloworld(name);
    }

}
