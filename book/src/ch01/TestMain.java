package ch01;

import java.util.ArrayList;
import java.util.Collection;

public class TestMain {
    public static void testFanXing(Person[] persons){}
    public static void testFanXing1(Collection<Person> persons){}
    public static void testFanXing2(Collection<? extends Person> persons){}
    public static void main(String[] args) {

        /* 泛型的协变性和通配符
        Employee[] employees=new Employee[3];
        testFanXing(employees); //可以，因为数组具有协变性
        ArrayList<Employee> employees1=new ArrayList<>();
        //testFanXing1(employees1); //产生编译错误，因为泛型不是协变的，通过通配符实现泛型的协变
        testFanXing2(employees1); //使用了通配符，可以编译*/

        /* 使用Object实现泛型
        MemoryCell memoryCell=new MemoryCell();
        memoryCell.write(3);
        System.out.println(memoryCell.read().getClass());*/

        /* ArrayStoreException 数组的协变性，但是
        Person arr[]=new Employee[3];
        arr[0]=new Person("h");
        System.out.println(arr[0].name)
       */

        /*使用java5后提供的特性<>构建泛型类
        GenericMemeroryCell genericMemeroryCell=new GenericMemeroryCell();
        genericMemeroryCell.write("hello");
        System.out.println(genericMemeroryCell.read());*/

        /* 菱形运算符<>
        GenericMemeroryCell<Integer> genericMemeroryCellInt=new GenericMemeroryCell<>();
        genericMemeroryCellInt.write(2);
        System.out.println(genericMemeroryCellInt.read());*/

    }
}
