package ch01;

public class Person {
    String name=null;
    Person(){}
    Person(String name){
        this.name=name;
    }
}
class Employee extends Person{

    public Employee(String h) {
        super(h);
    }
}
class Student extends Person{
    public Student(String s) {
      super(s);
    }
}
