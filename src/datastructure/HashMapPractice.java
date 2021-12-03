package datastructure;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> studentInfo = new HashMap<>();
        studentInfo.put("Alu", 1234);
        studentInfo.put("Balu", 5678);
        studentInfo.put("Chalu", 9012);
        studentInfo.put("Dalu", 3456);
        System.out.println(studentInfo);
        studentInfo.get("Alu");
        System.out.println(studentInfo.get("Alu"));
        System.out.println(studentInfo.keySet());
        System.out.println(studentInfo.values());
        System.out.println(studentInfo.size());
        System.out.println(studentInfo.containsKey("nalu"));
        System.out.println(studentInfo.containsValue(3456));
        System.out.println(studentInfo.clone());
        System.out.println(studentInfo.get("Chalu"));
        studentInfo.replace("Alu", 9999);
        System.out.println(studentInfo);
        studentInfo.replace("Balu", 5678, 5555);
        System.out.println(studentInfo);

    }
}
