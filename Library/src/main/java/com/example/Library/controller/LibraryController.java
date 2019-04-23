
package com.example.Library.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Library.model.Library;
import com.example.Library.repository.LibraryRepository;

@RestController
@RequestMapping("/library")
public class LibraryController {
	@Autowired
	LibraryRepository libraryRepository;
	@GetMapping("/save")
	public Library saveDetails(){
		Library lib = new Library();
		lib.setBookName("falut");
		lib.setDueDate(11);
		return libraryRepository.save(lib);
	}
	@GetMapping("/id/{ id}")
	public Optional<Library> single(@PathVariable int id){
		return libraryRepository.findById(id);
	}
}
