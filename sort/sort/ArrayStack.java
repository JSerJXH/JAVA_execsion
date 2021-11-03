package com.sort.sort;

public class ArrayStack {
    public ArrayStack() {

    }


    private int maxStack;
    //����ģ��ջ
    private int[] stack;
    //û����ֵʱ��pop=-1
    private int top=-1;
    public ArrayStack(int maxStack){
        this.maxStack=maxStack;
        stack = new int[maxStack];
    }
    /*
    * 1ѹջ
    * 2��ջ
    * 3�ж��Ƿ��ջ
    * 4�Ƿ���ջ
    *
    * */
    //�ж��Ƿ���ջ
    public boolean isFull(){
        return this.top == this.maxStack-1;
    }
    //�жϿ�ս
    public boolean isEmpty(){
        return this.top == -1;
    }
    //ѹջ
    public void push(int val){
        //�Ƿ���ջ
        if(isFull()){
            throw new RuntimeException("��ս����");
        }
        top++;
        stack[top] = val;

    }
    /*
    * ��ջ
    * */
    public int pop(){
        //�ж��ǲ��ǿ�ս
        if(isEmpty()){
            throw new RuntimeException("��ս");
        }
        int value = stack[top];
        top--;
        return value;
    }

    /*
    * �鿴����Ԫ��
    * */
    public void list(){
        //�ж��Ƿ��ս
        if(!isEmpty()){
            for (int i =0;i<stack.length;i++){
                System.out.printf("stack[%d]=%d\n",i,stack[i]);
                System.out.println(stack[i]);
            }
        }else {
            throw new RuntimeException("kongzhan");
        }
    }
    //ջ��Ԫ�صĳ���
    public int length(){
        return this.top;
    }
}
