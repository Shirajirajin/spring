package com.gda.spring.students.controller;

import com.gda.spring.students.model.Student;
import com.gda.spring.students.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping(path = "/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/add")

    public String add( Model model, Student student) {
        model.addAttribute("student", student);

        return "student-add";
    }
    @PostMapping
    public String add(Student student) {
        studentService.add(student);
        return "redirect:/student/list";
    }


    @GetMapping("/list")
    public String list(Model model) {
        List<Student> studentList = studentService.getAllStudents();

        model.addAttribute("students", studentList);
        return "student-list";
    }
}
