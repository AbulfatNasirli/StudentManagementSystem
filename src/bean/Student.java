package bean;

public class Student extends Person {
    private String schoolName;
    private String schoolarShip;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolarShip() {
        return schoolarShip;
    }

    public void setSchoolarShip(String schoolarShip) {
        this.schoolarShip = schoolarShip;
    }

}
