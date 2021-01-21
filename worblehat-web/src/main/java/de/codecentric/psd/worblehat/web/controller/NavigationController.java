package de.codecentric.psd.worblehat.web.controller;

import de.codecentric.psd.worblehat.domain.Book;
import de.codecentric.psd.worblehat.domain.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** Controller for Navigation */
@Controller
public class NavigationController {
  private BookService bookService;

  @Autowired
  public NavigationController(BookService bookService) {
    this.bookService = bookService;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home(ModelMap modelMap) {
    List<Book> books = bookService.findAllBooks();
    modelMap.addAttribute("books", books);
    return "home";
  }
}
