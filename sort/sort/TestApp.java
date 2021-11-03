package com.sort.sort;

public class TestApp {
    public static void main(String[] args) {

        System.out.println( detecation("hello"));
    }
    public static boolean detecation(String val){
        ArrayStack arrayStack = new ArrayStack(10);
        int length = val.length();
        for(int i=0;i<length;i++){
           arrayStack.push(val.charAt(i));
        }
        String newVal=null;
        for(int i =0;i<arrayStack.length();i++){
            //ÊÇ·ñÊ±¿ÕÕ½
            if(!arrayStack.isEmpty()){
                char pop = (char)arrayStack.pop();
                newVal =newVal+pop;
            }
        }
        if(val.equals(newVal)){
            return true;
        }
        return false;

    }
}

