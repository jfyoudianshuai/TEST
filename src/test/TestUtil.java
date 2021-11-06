package test;

import util.BeanUtils;

public class TestUtil {
    public static void main(String[] args) {
        Person1 p=new Person1();
        p.setAge("18");
        p.setId("1");
        p.setName("wjf");
        p.setSex("nan");
        Dog dog=new Dog();
        BeanUtils.copyPropertes(dog,p);
        System.out.println(dog);
    }
}
