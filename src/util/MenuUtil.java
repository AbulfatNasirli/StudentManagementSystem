package util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu() {
        System.out.println("Please selected menu:");
        Menu.showAllMenu();
        Scanner sc = new Scanner(System.in);
        int selectedMenu=sc.nextInt();
       Menu selected= Menu.find(selectedMenu);
       selected.process();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
