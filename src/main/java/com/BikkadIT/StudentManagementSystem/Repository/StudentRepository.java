package com.BikkadIT.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.StudentManagementSystem.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
