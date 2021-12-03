package Oops.encapsulation;

public class SomeSchool {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setNameOfStudent("Sakib");
        studentInfo.setId_student("MI_25489");
        studentInfo.setSsn(1231231234);
        studentInfo.setZipcode(48212);
        StudentInfo adnan = new StudentInfo();
        adnan.setNameOfStudent("Adnan Ahmed");
        adnan.setId_student("8255_NY");
        adnan.setSsn(1112223333);
        adnan.setZipcode(56789);

        System.out.println(studentInfo.getNameOfStudent());
        System.out.println(studentInfo.getId_Student());
        System.out.println(studentInfo.getSsn());
        System.out.println(studentInfo.getZipcode());

        System.out.println(adnan.getNameOfStudent());
        System.out.println(adnan.getId_Student());
        System.out.println(adnan.getSsn());
        System.out.println(adnan.getZipcode());

    }
}
