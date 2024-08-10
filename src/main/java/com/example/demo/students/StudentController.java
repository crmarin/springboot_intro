package com.example.demo.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = new StudentService();
    }
    /*
	@GetMapping
	public String hello () {
		return "hello cris from sb";
	}*/

    /*	@GetMapping
	public List<String> hello () {
		return List.of("hello cris from sb", "123");
	}*/

    @GetMapping
    public List<Student> getStudents () {
        return studentService.getStudents();
    }
}
