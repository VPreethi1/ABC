package com.example.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Library.model.Library;

public interface LibraryRepository extends JpaRepository<Library,Integer> {
 
}
