package com.example.repo;

import com.example.model.Student;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {

}
