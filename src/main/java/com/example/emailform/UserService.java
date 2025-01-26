package com.example.emailform;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    // Simulated list of existing usernames (this would typically come from a database)
    private final List<String> existingUsernames = Arrays.asList("user1", "admin", "testuser", "srimanja");

    // Method to check if the username already exists
    public boolean isUsernameTaken(String username) {
        return existingUsernames.contains(username);
    }
}
