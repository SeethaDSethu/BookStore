package com.bookstore.controller;

import java.sql.ResultSet; 
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper; 
 
public class BookRowMapper implements RowMapper<Book> { 
@Override  
public Book mapRow(ResultSet resultSet, int line) throws SQLException {

 BookExtractor bookExtractor = new BookExtractor(); 
 return bookExtractor.extractData(resultSet);       
 } 
 }