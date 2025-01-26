package com.example.emailform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @Autowired
    private UserService userService;  // Assuming a service class to check for username existence

    // Mapping for displaying the form
    @GetMapping("/")
    public String showAccountForm() {
        return "emailForm";  // This should render emailForm.jsp
    }

    // Mapping for handling form submission
    @PostMapping("/submitAccount")
    public String submitAccount(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("email") String email,
            @RequestParam("phone") String phone,
            @RequestParam("address") String address,
            @RequestParam("username") String username,
            Model model) {

        // Perform server-side validation
        String errorMessage = validateAccountForm(firstName, lastName, email, phone, address, username);

        if (errorMessage != null) {
            // If validation fails, add error message and return to form
            model.addAttribute("error", errorMessage);
            return "emailForm";  // Return to the form with error
        }

        // Check if username already exists
        if (userService.isUsernameTaken(username)) {
            model.addAttribute("error", "Username is already taken. Please choose another one.");
            return "emailForm";  // Return to form with error
        }

        // If all validations pass, add attributes and return success view
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("phone", phone);
        model.addAttribute("address", address);
        model.addAttribute("username", username);
        return "success";  // This should render success.jsp
    }

    // A simple method for manual form validation
    private String validateAccountForm(String firstName, String lastName, String email, String phone, String address, String username) {
        if (firstName == null || firstName.trim().isEmpty()) {
            return "First name is required.";
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            return "Last name is required.";
        }
        if (email == null || email.trim().isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return "Valid email is required.";
        }
        if (phone == null || phone.trim().isEmpty() || !phone.matches("^\\d{10}$")) {
            return "Phone number must be exactly 10 digits.";
        }
        if (address == null || address.trim().isEmpty()) {
            return "Address is required.";
        }
        if (username == null || username.trim().isEmpty()) {
            return "Username is required.";
        }
        return null;  // No validation errors
    }
}
