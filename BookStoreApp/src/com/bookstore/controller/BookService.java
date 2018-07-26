package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookDao bookDao;

	public List<Book> getList() throws Exception {
		List<Book> books = bookDao.findAllBooks();
		return books;
	}

}
