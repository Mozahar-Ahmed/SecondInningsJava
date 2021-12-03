package Oops.encapsulation;

public class EncapSchool {
    public static void main(String[] args) {
        EncapStudent encapStudent1 = new EncapStudent();
        encapStudent1.setFirstName("Sarraf");
        encapStudent1.setLastName("Ahmed");
        encapStudent1.setId(12345);
        encapStudent1.setIsaBoy(true);

        String firstName = encapStudent1.getFirstName();
        String lastName = encapStudent1.getLastName();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        int id = encapStudent1.getId();
        System.out.println(id);
        boolean isaBoy = encapStudent1.getIsaBoy();
        System.out.println(isaBoy);
    }
}
