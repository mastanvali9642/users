package com.usa.ies.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usa.ies.admin.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
