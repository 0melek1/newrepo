package onlinebookshopping.onlinebookshoppingproject.controller;

import onlinebookshopping.onlinebookshoppingproject.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/librarian")

public class LibrarianController {

    @Autowired
    private LibrarianRepository librarianRepository;



}
