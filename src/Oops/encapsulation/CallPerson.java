package Oops.encapsulation;

public class CallPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Mozahar");
        person.setAge(52);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
