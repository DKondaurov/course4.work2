package pro.sky.java.course4.work2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course4.work2.model.StudentsFromEndOfTheListById;
import pro.sky.java.course4.work2.service.StudentService;

import java.util.List;

@RestController
public class StudentsFromEndOfTheListByIdController {

    private final StudentService studentService;

    public StudentsFromEndOfTheListByIdController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student-from-end-of-the-list-by-id")
    public List<StudentsFromEndOfTheListById> getStudentsFromEndOfTheListById() {
        List<StudentsFromEndOfTheListById> studentsFromEndOfTheListById = studentService.getStudentsFromEndOfTheListById();
        return studentsFromEndOfTheListById;
    }
}
