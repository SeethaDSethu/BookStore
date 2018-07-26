package com.bookstore.controller;

import java.util.ArrayList;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

import javax.sql.DataSource;

public class BookDao {

	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Book> findAllBooks() throws Exception {
		try {
			List<Book> bookList = new ArrayList<>();
			String sql = "select * from book inner join author on book.id = author.book_id";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			bookList = jdbcTemplate.query(sql, new BookRowMapper());
			return bookList;
		} catch (Exception exception) {
			throw new Exception("Error while find books: ", exception);
		}
	}
}