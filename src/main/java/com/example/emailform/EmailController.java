package com.example.emailform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @GetMapping("/")
    public String showEmailForm() {
        return "emailForm"; // This should match the name of the JSP file
    }

    @PostMapping("/submitEmail")
    public String submitEmail(
            @RequestParam("email") String email,
            @RequestParam("message") String message,
            Model model) {
        model.addAttribute("email", email);
        model.addAttribute("message", message);
        return "success"; // This should match the name of the JSP file
    }
}
