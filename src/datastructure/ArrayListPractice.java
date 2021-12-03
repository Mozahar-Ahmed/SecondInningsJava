package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Adnan");
        arrayList.add("Badol");
        arrayList.add("Choyon");
        arrayList.size();
        System.out.println(arrayList.size());

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove("Badol");
        System.out.println(arrayList);
        arrayList.get(0);
        System.out.println(arrayList.get(0));
        arrayList.add("Dulal");
        arrayList.add("Elias");
        System.out.println(arrayList);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        ArrayList<Object> misc = new ArrayList<>();
        misc.add("A name");
        misc.add(555);
        misc.add(true);
        misc.add(12.50);
        System.out.println(misc);
        Iterator it = misc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
