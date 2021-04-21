package ch03;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;


public class TestCollections {
    public static <Anytype> void print(Collection<Anytype> collection){
        Iterator<Anytype> iterator=collection.iterator();
        while (iterator.hasNext()){
            Anytype item=iterator.next();
            System.out.println(item);  //先输出再删除
            iterator.remove(); //迭代过程中被删除了
        }
    }
    public static void del(LinkedList linkedList){
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getClass()=="".getClass()){
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        LinkedList linkedList=new LinkedList();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add(23);
        arrayList.add("hello");
        arrayList.add(23);
        print(arrayList);
        System.out.println(arrayList.size());
        del(linkedList);
        System.out.println(linkedList);
    }
}
