package com.kpraghav.mongodb.kubetest.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kpraghav.mongodb.kubetest.model.Tutorial;



public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
