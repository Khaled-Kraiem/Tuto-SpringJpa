package com.tuto.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuto.spring.datajpa.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}