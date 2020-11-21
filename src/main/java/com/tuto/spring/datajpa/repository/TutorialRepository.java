package com.tuto.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tuto.spring.datajpa.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  Page<Tutorial> findByPublished(boolean published, Pageable pageable);
  Page<Tutorial> findByTitleContaining(String title, Pageable pageable);
}