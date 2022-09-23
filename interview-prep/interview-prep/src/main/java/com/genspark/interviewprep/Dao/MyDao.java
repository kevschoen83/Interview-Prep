package com.genspark.interviewprep.Dao;

import com.genspark.interviewprep.Entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDao extends JpaRepository<MyEntity, Integer> {
}
