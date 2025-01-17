package com.example.demo.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
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

    @PostMapping
    public void registerNewStudent (@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent (@PathVariable("studentId") Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent (@PathVariable("studentId") Long id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) String email) {
        studentService.updateStudent(id, name, email);
    }
}
