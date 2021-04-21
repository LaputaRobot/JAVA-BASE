package ch04;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> integerSet=new TreeSet<>();
        integerSet.add(23);
        integerSet.add(24);
        integerSet.add(22);
        for (Integer inter : integerSet) {
            System.out.println(inter);
        }
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(23,"ketty");
        for (String name: treeMap.values()) {
            System.out.println(name);
        }
    }
}
