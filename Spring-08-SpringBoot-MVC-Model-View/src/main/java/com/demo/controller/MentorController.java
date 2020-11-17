package com.demo.controller;

import com.demo.enums.Gender;
import com.demo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith",45, Gender.MALE));
        mentorList.add(new Mentor("John", "Doe",35, Gender.MALE));
        mentorList.add(new Mentor("Allen", "Ardel",42, Gender.MALE));
        mentorList.add(new Mentor("Jake", "Xmas",46, Gender.MALE));

        model.addAttribute("mentors",mentorList);
        return "mentor/mentor-list";
    }
}
