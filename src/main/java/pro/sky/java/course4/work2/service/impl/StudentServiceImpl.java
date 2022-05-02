package pro.sky.java.course4.work2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course4.work2.model.Student;
import pro.sky.java.course4.work2.model.StudentCount;
import pro.sky.java.course4.work2.model.StudentsAverageAge;
import pro.sky.java.course4.work2.model.StudentsFromEndOfTheListById;
import pro.sky.java.course4.work2.repository.StudentRepository;
import pro.sky.java.course4.work2.service.StudentService;

import java.util.Collection;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void removeStudent(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Collection<Student> filterStudentByAge(int age) {
        return studentRepository.findStudentByAge(age);
    }

    @Override
    public Collection<Student> filterStudentsByAgeBetween(int min, int max) {
        return studentRepository.findByAgeBetween(min, max);
    }

    @Override
    public List<StudentCount> getCountStudents() {
        return studentRepository.getCountStudents();
    }

    @Override
    public List<StudentsAverageAge> getStudentsAverageAge() {
        return studentRepository.getStudentsAverageAge();
    }

    @Override
    public List<StudentsFromEndOfTheListById> getStudentsFromEndOfTheListById() {
        return studentRepository.getStudentsFromEndOfTheListById();
    }

}
