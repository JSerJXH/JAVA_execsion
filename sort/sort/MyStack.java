package com.sort.sort;

public class MyStack {

    private Object[] elements ;
    private int index =-1;//ջ֡��ָ��-1 index �������Ա�ʾջ֡�������Ա�ʾջ����ĸ���
    //�޲ι��췽��
    public MyStack() {
        //this.elements = new Object[10]; //��ֵobjectΪ10
    }
    //�вι��췽��
    public MyStack(Object[] elements) {
        this.elements = elements;
    }

    //����set��get elements ϰ��
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    /**
     * ѹջ����
     * @param obj ѹջ��Ԫ��
     */
    public void  push(Object obj){
        if(index >= elements.length-1){
            System.out.println("ѹջʧ��");
            return;

        }
        //��������֤������û���������Լ���ѹջ
        index++;
        elements[index]=obj;//elements[++index]=obj;++д��ǰ�����Լӣ��ٸ�ֵ
        System.out.println("ѹջ"+obj+"-----"+index);
    }

    /**
     * ��ջ����
     * @param obj  ��ջԪ��
     */
    public void opo(){
        if(index<0){
            System.out.println("��ջʧ�ܣ�");

        }
        index--;
        System.out.println(elements[index]);


    }

    }
