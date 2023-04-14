package Model;

public class Student {
    private String name;
    private int id;
    private String email;
    private String phone;
    private String classCode;
    private double gpa;

    public Student(String name, int id, String email, String phone, String classCode, double gpa) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.classCode = classCode;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", classCode='" + classCode + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}