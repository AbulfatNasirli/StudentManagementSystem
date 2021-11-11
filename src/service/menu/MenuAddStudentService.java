package service.menu;

import bean.Config;
import bean.Student;
import serviceMenu.inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter{
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter surname");
        sc = new Scanner(System.in);
        String surname = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        Config.instance().appendStudent(s);
        Config.save();

    }
}
