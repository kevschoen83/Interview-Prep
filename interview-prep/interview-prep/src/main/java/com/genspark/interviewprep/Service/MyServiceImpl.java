package com.genspark.interviewprep.Service;

import com.genspark.interviewprep.Dao.MyDao;
import com.genspark.interviewprep.Entity.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MyDao myDao;

    @Override
    public List<MyEntity> getAllEntities() {
        return myDao.findAll();
    }

    @Override
    public MyEntity getEntityById(int id) {
        Optional<MyEntity> o = myDao.findById(id);
        MyEntity myEntity = null;

        if (o.isPresent()) {
            myEntity = o.get();
        } else {
            throw new RuntimeException("Entity not found for id :: " + id);
        }

        return myEntity;
    }

    @Override
    public MyEntity addEntity(MyEntity myEntity) {
        return myDao.save(myEntity);
    }

    @Override
    public MyEntity updateEntity(MyEntity myEntity) {
        return myDao.save(myEntity);
    }

    @Override
    public String deleteEntity(int id) {
        myDao.deleteById(id);
        return "Entity deleted successfully";
    }
}
