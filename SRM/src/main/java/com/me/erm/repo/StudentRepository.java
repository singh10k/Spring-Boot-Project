package com.me.erm.repo;

import org.springframework.data.repository.CrudRepository;

import com.me.erm.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
