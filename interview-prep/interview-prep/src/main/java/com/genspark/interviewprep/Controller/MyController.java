package com.genspark.interviewprep.Controller;

import com.genspark.interviewprep.Entity.MyEntity;
import com.genspark.interviewprep.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/home")
    public String home() {
        return "<html><h1>Welcome to my Interview Prep application!</h1></html>";
    }

    @GetMapping("/entity")
    public List<MyEntity> getAllEntities() {
        return myService.getAllEntities();
    }

    @GetMapping("/entity/{id}")
    public MyEntity getEntity(@PathVariable String id) {
        return myService.getEntityById(Integer.parseInt(id));
    }

    @PostMapping("/entity")
    public MyEntity addEntity(@RequestBody MyEntity myEntity) {
        return myService.addEntity(myEntity);
    }

    @PutMapping("/entity")
    public MyEntity updateEntity(@RequestBody MyEntity myEntity) {
        return myService.updateEntity(myEntity);
    }

    @DeleteMapping("/entity/{id}")
    public String deleteEntity(@PathVariable String id) {
        return myService.deleteEntity(Integer.parseInt(id));
    }

}

/*  **List<MyEntity> getAllEntities();
    **MyEntity getEntityById(int id);
    **MyEntity addEntity(MyEntity myEntity);
    **MyEntity updateEntity(MyEntity myEntity);
    **String deleteEntity(int id);*/
