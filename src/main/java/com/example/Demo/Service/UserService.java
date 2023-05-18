package com.example.Demo.Service;


import com.example.Demo.Model.User;
import com.example.Demo.Repository.UserRepository;
import org.springframework.stereotype.Service;
        import java.util.*;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }



    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
