package yncrea.pw04.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping("/form")
    public String getForm(ModelMap modelMap2){
        Student student=new Student();
        modelMap2.put("student",student);
        return "studentForm";
    }

    @RequestMapping(value="/form",method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("student") Student student){
    studentService.saveStudent(student);
    return "redirect:list";
    }
}
