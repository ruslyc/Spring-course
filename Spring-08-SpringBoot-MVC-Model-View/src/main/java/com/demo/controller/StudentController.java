package com.demo.controller;

import com.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name","Russ");
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jerry");
        names.add("Johanna");
        names.add("Jeremy");
        model.addAttribute("students",names);

        Student student = new Student(1, "Russ", "Rusu");
        model.addAttribute("student", student);

        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){
        return "student/register";
    }


}
