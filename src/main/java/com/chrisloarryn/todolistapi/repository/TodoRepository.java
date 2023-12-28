package com.chrisloarryn.todolistapi.repository;

import com.chrisloarryn.todolistapi.entities.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo, String> {

    //   List<Todo> findAll();


}