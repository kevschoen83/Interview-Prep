package com.genspark.interviewprep.Service;

import com.genspark.interviewprep.Entity.MyEntity;

import java.util.List;

public interface MyService {

    List<MyEntity> getAllEntities();
    MyEntity getEntityById(int id);
    MyEntity addEntity(MyEntity myEntity);
    MyEntity updateEntity(MyEntity myEntity);
    String deleteEntity(int id);

}
