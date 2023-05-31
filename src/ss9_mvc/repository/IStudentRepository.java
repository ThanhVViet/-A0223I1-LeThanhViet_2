package ss9_mvc.repository;

import ss9_mvc.model.Student;

public interface IStudentRepository {
    Student[] list();
    int getSize();
    int addSize();
    int find(int id);
    void delete(int delid);
    boolean find1 (int id);
    int setSize();

}
