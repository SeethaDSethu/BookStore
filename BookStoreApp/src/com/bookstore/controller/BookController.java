package com.bookstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/book", produces = "application/json")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public ModelAndView getBookList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView("bookList");
		try {
			modelAndView.addObject("bookList", bookService.getList());
			return modelAndView;
		} catch (Exception exception) {
			modelAndView.addObject("error", exception);
			return modelAndView;
		}
	}

}
