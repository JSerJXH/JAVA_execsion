package com.sort.sort;

public class MyStack {

    private Object[] elements ;
    private int index =-1;//栈帧，指向-1 index 不仅可以表示栈帧，更可以表示栈里面的个数
    //无参构造方法
    public MyStack() {
        //this.elements = new Object[10]; //赋值object为10
    }
    //有参构造方法
    public MyStack(Object[] elements) {
        this.elements = elements;
    }

    //创建set和get elements 习惯
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    /**
     * 压栈方法
     * @param obj 压栈的元素
     */
    public void  push(Object obj){
        if(index >= elements.length-1){
            System.out.println("压栈失败");
            return;

        }
        //程序到这里证明程序没有满，可以继续压栈
        index++;
        elements[index]=obj;//elements[++index]=obj;++写在前面先自加，再赋值
        System.out.println("压栈"+obj+"-----"+index);
    }

    /**
     * 弹栈方法
     * @param obj  弹栈元素
     */
    public void opo(){
        if(index<0){
            System.out.println("弹栈失败，");

        }
        index--;
        System.out.println(elements[index]);


    }

    }
