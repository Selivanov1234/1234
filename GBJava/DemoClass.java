package GBJava;

import java.util.*;

public class DemoClass {


    public void collectionDemo () {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("lion");
        list.add("tiger");
        list.add("giraffe");
        list.add("monkey");
        list.add("snake");
        list.add("owl");
        list.add("elephant");
        list.add("cat");
        list.add("hyena");
        list.add("hydra");
        list.add("mammoth");
        list.add("alligator");
        list.add("rhino");
        list.add("dog");
        System.out.println(list.size());
//        System.out.println(list.toString());
        Set<String> animals = new HashSet<>(list);
        System.out.println(animals);
        System.out.println(animals.size());
        HashMap<String, Integer > hm = new HashMap<>();
        Integer am;
        for (String i: list) {
            am = hm.get(i);
//            if(am == null){
//                hm.put(i,am=1);
//            }else {
//                hm.put(i,am+1);
//            }
            hm.put (i, am == null ? 1 : am + 1);
        }
        for (Object key : hm.keySet().toArray()) {
            if (hm.get(key) == 1) {
                hm.remove(key);
            }
        }
        System.out.println(hm);
//        System.out.println(hm.keySet().toString());
    }
}

