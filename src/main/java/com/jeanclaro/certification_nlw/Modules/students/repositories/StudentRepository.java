package com.jeanclaro.certification_nlw.Modules.students.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanclaro.certification_nlw.Modules.students.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID>{

    public Optional<StudentEntity> findByEmail(String email);
}
