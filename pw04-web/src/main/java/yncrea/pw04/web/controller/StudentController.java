package yncrea.pw04.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import yncrea.pw04.entity.Student;
import yncrea.pw04.service.StudentService;

import javax.inject.Inject;
import java.util.List;

@Controller
public class StudentController {

    @Inject
    private StudentService studentService;

    public List<Student> studentsList;

    @RequestMapping("/list")
    public String getListOfStudents(ModelMap modelMap){
        studentsList=studentService.findAllWithCourses();
        modelMap.put("students",studentsList);
        return "studentsList";

    }
}
