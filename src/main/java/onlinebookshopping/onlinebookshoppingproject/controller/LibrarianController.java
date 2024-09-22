package onlinebookshopping.onlinebookshoppingproject.controller;

import onlinebookshopping.onlinebookshoppingproject.model.Librarian;
import onlinebookshopping.onlinebookshoppingproject.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/librarian")

public class LibrarianController {

    @Autowired
    private LibrarianRepository librarianRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerLibrarian(@RequestBody Librarian librarian) {
        librarianRepository.save(librarian);
        return ResponseEntity.ok("Kitabxanaçı uğurla qeydiyyatdan keçdi!");


    }
}
