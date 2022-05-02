package pro.sky.java.course4.work2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course4.work2.model.StudentCount;
import pro.sky.java.course4.work2.service.StudentService;

import java.util.List;

@RestController
public class StudentCountController {

    private final StudentService studentService;

    public StudentCountController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student-count")
    public List<StudentCount> getCountStudents() {
        List<StudentCount> studentCount = studentService.getCountStudents();
        return studentCount;
    }


}
