package de.codecentric.psd.worblehat.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** Controller for Navigation */
@Controller
public class NavigationController {
  // private BookService bookService;

  // @Autowired
  public NavigationController() {
    // this.bookService = bookService;
  }

  @RequestMapping(value = "/" /*, method = RequestMethod.GET*/)
  public String home(/*ModelMap modelMap*/ ) {
    // List<Book> books = bookService.findAllBooks();
    // modelMap.addAttribute("books", books);
    return "home";
  }
}
