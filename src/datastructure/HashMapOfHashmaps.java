package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapOfHashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> cityAndZipOfUsa = new HashMap<>();
        cityAndZipOfUsa.put("NY", 58441);
        cityAndZipOfUsa.put("NJ", 55544);
        cityAndZipOfUsa.put("MI", 48212);
        HashMap<String, Integer> cityOfCanada = new HashMap<>();
        cityOfCanada.put("Orleance", 77799);
        cityOfCanada.put("Toronto", 99911);
        cityOfCanada.put("Vermont", 11122);
        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
        map.put("USA", cityAndZipOfUsa);
        map.put("Canada", cityOfCanada);
        System.out.println(map);
        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        list.add(cityAndZipOfUsa);
        list.add(cityOfCanada);
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        HashMap<Integer, HashMap<Integer, String>> student = new HashMap<>();
    }
}
