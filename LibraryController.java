package com.chethan.library.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chethan.library.model.Book;



@RestController
public class LibraryController {

	@RequestMapping(path = "/hello")
	public String hello(){
		return "working";
	}
	
	public Book viewBook() {
		return null;

	}
	
	public Book borrowBook() {
		return null;
	}
	
	public Book borrowCopyOfBook() {
		return null;
	}
	
	public void returnBook(ArrayList<Book> book) {
		
	}
}
