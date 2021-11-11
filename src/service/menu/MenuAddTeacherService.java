package service.menu;

import bean.Config;
import bean.Teacher;
import serviceMenu.inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name= sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("Enter surname:");
        String surname = sc.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        Config.instance().appendTeacher(t);
            Config.save();
    }
}
