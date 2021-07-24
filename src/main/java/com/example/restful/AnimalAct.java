package com.example.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangling
 */
@RestController
@RequestMapping(value = "/animal")
public class AnimalAct {

    @GetMapping("/{name}")
    public String queryAnimal(@PathVariable String name) {
        return "queryAnimal:"+name;
    }
}
