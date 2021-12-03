package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cityOfUsa = new ArrayList<>();//creating object (string type)
        cityOfUsa.add("Detroit");//adding data
        cityOfUsa.add("Lansing");
        cityOfUsa.add("Hamtramck");
        cityOfUsa.add("Tempa");
        System.out.println(cityOfUsa);
        Iterator it = cityOfUsa.iterator();//iteration using iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (int i = 0; i < cityOfUsa.size(); i++) {//iteration using for loop
            System.out.println(cityOfUsa.get(i));
        }
        ArrayList<String> cityOfCanada = new ArrayList<>();
        cityOfCanada.add("Toronto");
        cityOfCanada.add("London");
        cityOfCanada.add("Oakland");
        System.out.println(cityOfCanada);
        for (int i = 0; i < cityOfCanada.size(); i++) {
            System.out.println(cityOfCanada.get(i));
        }
        ArrayList<ArrayList<String>> world = new ArrayList<>();//object creation (ArrayList type)
        world.add(cityOfUsa);
        world.add(cityOfCanada);
        System.out.println(world);
        Iterator iterator = world.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
