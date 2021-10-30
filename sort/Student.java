package com.sort.sort;
//定义一个学生类Student，具有年龄age和姓名username两个属性，并通过Comparable接口提供比较规则；
 public class Student implements Comparable<Student>{
    private String usename;
    private  int age;

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "usename='" + usename + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}

 class Test {
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
