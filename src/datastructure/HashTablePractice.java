package datastructure;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {
        Hashtable<String, Integer> studentInfo = new Hashtable<>();
        studentInfo.put("Adil", 111);
        studentInfo.put("Badol", 222);
        studentInfo.put("Chinmoy", 333);
        /*studentInfo.put(null, 444);//hash table can not take null key or value, throws null pointer exception
        studentInfo.put("Dilu",null);
        studentInfo.put(null,null);*/
        System.out.println(studentInfo);
        System.out.println(studentInfo.keySet());
        System.out.println(studentInfo.values());
        System.out.println(studentInfo.isEmpty());
        System.out.println(studentInfo.size());
        //studentInfo.clear();
        //System.out.println(studentInfo);
        System.out.println(studentInfo.get("Adil"));
        System.out.println(studentInfo.contains(222));
        System.out.println(studentInfo.containsKey("Chinmoy"));
        System.out.println(studentInfo.containsValue(334));
        System.out.println(studentInfo.remove("Adil"));
        System.out.println(studentInfo);


    }
}
