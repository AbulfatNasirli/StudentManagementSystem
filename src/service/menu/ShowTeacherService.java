package service.menu;

import bean.Config;
import bean.Teacher;
import serviceMenu.inter.ShowTeacherServiceInter;

public class ShowTeacherService implements ShowTeacherServiceInter {
    @Override
    public void processLogic() {
        Teacher[] showAllTeacher = Config.instance().getTeachers();
        for (int i = 0; i < showAllTeacher.length; i++) {
            System.out.println(showAllTeacher[i]);
        }
    }
}
