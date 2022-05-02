package pro.sky.java.course4.work2.service;

import pro.sky.java.course4.work2.model.Faculty;

import java.util.Collection;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    void removeFaculty(long id);

    Faculty editFaculty(Faculty faculty);

    Collection<Faculty> filterFacultyByColor(String color, String name);

}
