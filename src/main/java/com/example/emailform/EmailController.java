package com.example.emailform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

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
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("phone", phone);
        model.addAttribute("address", address);
        model.addAttribute("username", username);
        return "success";  // This should render success.jsp
    }
}
