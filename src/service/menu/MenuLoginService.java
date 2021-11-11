package service.menu;

import bean.Config;
import serviceMenu.inter.MenuLoginServiceInter;
import util.Menu;
import util.MenuUtil;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
             boolean loogedIn;
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String userName = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("password:");
        String password = sc.nextLine();
        if (!(userName.equalsIgnoreCase("username")||password.equals("user123"))){

         throw new IllegalArgumentException("User or Password is invalid !!!");
        }
        Config.setLoogedIn(true);
    }
}
