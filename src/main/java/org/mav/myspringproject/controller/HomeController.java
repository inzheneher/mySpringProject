package org.mav.myspringproject.controller;

import org.mav.myspringproject.data.UserRepository;
import org.mav.myspringproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private UserRepository userRepository;

    @Autowired
    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(list::add);

        model.addAttribute("userList", list);
        return "home";
    }
}
