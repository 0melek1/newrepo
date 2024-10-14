package onlinebookshopping.onlinebookshoppingproject.controller;

import onlinebookshopping.onlinebookshoppingproject.model.Librarian;
import onlinebookshopping.onlinebookshoppingproject.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PostMapping("/login")
    public Librarian login(@RequestParam String email, @RequestParam String password) {
        return librarianService.login(email, password);
    }
    @GetMapping
    public List<Librarian> getAllLibrarians() {
        return librarianService.getAllLibrarians();
    }

}
