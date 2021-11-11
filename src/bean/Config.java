package bean;

import util.FileUtility;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

public class Config implements Serializable {
    private static Config config = null;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static boolean loogedIn;
    private static final String fileName="app.obj";
    public static void initialize(){
        Object obj = FileUtility.readObject(fileName);
        if (obj==null){
            return;
        }
        if (obj instanceof Config){
            config = (Config) obj;
        }
    }
    public static void save()  {

        try {
            FileUtility.writeObject(Config.instance(),fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static void setLoogedIn(boolean loogedIn) {
        Config.loogedIn = loogedIn;
    }

    public void appendStudent(Student s) {
        Student[] newStudent = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudent[i] = students[i];
        }
        newStudent[newStudent.length - 1] = s;
        students = newStudent;
    }

    public void appendTeacher(Teacher t) {
        Teacher[] newTeacher = new Teacher[teachers.length + 1];
        for (int i = 0; i < teachers.length; i++) {
            newTeacher[i] = teachers[i];
        }
        newTeacher[newTeacher.length - 1] = t;
        teachers = newTeacher;
    }

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static boolean isLoggedIn() {
        return loogedIn;
    }

    @Override
    public String toString() {
        return Arrays.toString(teachers);
    }

}
