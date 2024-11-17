package java16.end_project.service;


import java16.end_project.entity.User;
import java16.end_project.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


        @Autowired
        private UserRepository userRepository;

        public User registerUser(User user) {
            return userRepository.save(user);
        }

        public Optional<User> findByUsername(String username) {
            return userRepository.findByUsername(username);
        }
}
