package java16.end_project.controller;

import java16.end_project.entity.User;
import java16.end_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        var user = userService.findByUsername(username);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.status(401).body("Invalid username or password");
    }


}
