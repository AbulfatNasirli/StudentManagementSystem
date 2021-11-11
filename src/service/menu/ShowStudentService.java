package service.menu;

import bean.Config;
import bean.Student;
import serviceMenu.inter.ShowStudentServiceInter;

public class ShowStudentService implements ShowStudentServiceInter {
    @Override
    public void processLogic() {
        Student[] showAllStudent = Config.instance().getStudents();
        for (int i = 0; i < showAllStudent.length; i++) {
            System.out.println(showAllStudent[i]);
        }
    }
}
