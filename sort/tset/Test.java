package com.sort.tset;

import com.sort.sort.Student;

//定义测试类Test，在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
public class Test {
    public static void main(String[] args) {
        //创建两个student对象，并调用getMax方法，完成测试
        Student s1 =new Student();
        s1.setUsename("张三");
        s1.setAge(50);
        Student s2 = new Student();
        s2.setUsename("李四");
        s2.setAge(20);
        System.out.println(getMax(s1,s2));



    }
    public static Comparable getMax(Comparable c1,Comparable c2){

        int result = c1.compareTo(c2);
        System.out.println(result>=0? c1: c2);
        return "调用过我getMax";
    }

}
