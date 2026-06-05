package gr.aueb.cf.ch15.interfaces;

import gr.aueb.cf.ch15.abstract_classes.school.Student;

public class Main {

    public static void main(String[] args) {
        ISchoolService studentService = new StudentServiceImpl();
        ISchoolService teacherService = new TeacherServiceImpl();

        studentService.register();
        teacherService.register();

        studentService.unregister();
        teacherService.unregister();

        doRegister(studentService);
        doRegister(teacherService);
    }

    public static void doRegister(ISchoolService service) {
        service.register();
    }
}
