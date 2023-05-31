package ss9_mvc.View;

import ss9_mvc.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController sc = new StudentController();
        sc.displayMenu();
    }
}
