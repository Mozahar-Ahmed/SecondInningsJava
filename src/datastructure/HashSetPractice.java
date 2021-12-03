package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> pastCities = new HashSet<>();
        pastCities.add("Dhaka");
        pastCities.add("Rajshahi");
        pastCities.add("Chittagong");
        pastCities.add("Kishoregonj");
        System.out.println(pastCities);
        System.out.println(pastCities.size());
        System.out.println(pastCities.contains("Dhaka"));
        pastCities.remove("Rajshahi");
        System.out.println(pastCities);
        pastCities.add("Sylhet");
        Iterator it = pastCities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //hashSet.clear();
        System.out.println(pastCities.size());
        System.out.println(pastCities.isEmpty());
        System.out.println(pastCities);

        HashSet<String> presentCities = new HashSet<>();
        presentCities.add("Hamtramck");
        presentCities.add(null);
        presentCities.add("Bloomfield Hill");
        presentCities.add("Warren");
        presentCities.add("Detroit");
        System.out.println(presentCities);
        System.out.println(presentCities.size());
        System.out.println(presentCities);

        Iterator iterator = presentCities.iterator();

        ArrayList<String> cityList = new ArrayList<>();
        while (iterator.hasNext()) {
            try {
                String city = iterator.next().toString();
                cityList.add(city);
            } catch (NullPointerException e) {
                System.out.println("Exception occured-Need further research");
                //e.printStackTrace();
            }
        }
        System.out.println(cityList);
        System.out.println(cityList.get(0));
        cityList.add("Hamtramck");
        cityList.add(null);
        cityList.add(null);
        cityList.add(null);
        System.out.println(cityList.size());
        System.out.println(cityList);

    }
}
