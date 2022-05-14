package com.holmes;

import com.holmes.user.model.User;
import com.holmes.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class CaixiuDbApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(CaixiuDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User user = userRepository.findUserByUsername("alex");
        if(user == null) {
            userRepository.save(new User("1", "alex", LocalDateTime.now()));
            user = userRepository.findUserByUsername("alex");
        }

        System.out.println("Item Name: " + user.getUsername());

    }
}
