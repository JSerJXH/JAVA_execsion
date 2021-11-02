package com.sort.sort;

public class ArrayStack {
    public ArrayStack() {

    }


    private int maxStack;
    //数组模拟栈
    private int[] stack;
    //没有数值时，pop=-1
    private int top=-1;
    public ArrayStack(int maxStack){
        this.maxStack=maxStack;
        stack = new int[maxStack];
    }
    /*
    * 1压栈
    * 2弹栈
    * 3判断是否空栈
    * 4是否满栈
    *
    * */
    //判断是否满栈
    public boolean isFull(){
        return this.top == this.maxStack-1;
    }
    //判断空战
    public boolean isEmpty(){
        return this.top == -1;
    }
    //压栈
    public void push(int val){
        //是否满栈
        if(isFull()){
            throw new RuntimeException("此战已满");
        }
        top++;
        stack[top] = val;

    }
    /*
    * 弹栈
    * */
    public int pop(){
        //判断是不是空战
        if(isEmpty()){
            throw new RuntimeException("空战");
        }
        int value = stack[top];
        top--;
        return value;
    }

    /*
    * 查看所有元素
    * */
    public void list(){
        //判断是否空战
        if(!isEmpty()){
            for (int i =0;i<stack.length;i++){
                System.out.printf("stack[%d]=%d\n",i,stack[i]);
                System.out.println(stack[i]);
            }
        }else {
            throw new RuntimeException("kongzhan");
        }
    }
    //栈中元素的长度
    public int length(){
        return this.top;
    }
}
