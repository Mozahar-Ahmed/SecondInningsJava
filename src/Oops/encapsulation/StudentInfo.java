package Oops.encapsulation;

public class StudentInfo {
    private String nameOfStudent;
    private String id_student;
    private int ssn;
    private int zipcode;

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;

    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public String getId_Student() {
        return id_student;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;

    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;

    }
}
