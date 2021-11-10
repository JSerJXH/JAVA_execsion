package com.cn.Execsion;

public class ArryBinaryTree {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        arrBinaryTree.perOreder(0);
    }

}
class ArrBinaryTree{
    private int[]arr;//存储数据
    public ArrBinaryTree(int[] i){
        arr=i;
    }
    public void perOrder(int i){
        this.perOrder(0);
    }

    /**
     *
     * @param index 数组下表
     */
    public void perOreder(int index){
        if(arr==null||arr.length==0){
            System.out.println("数组为空");
        }
        //输出当前元素
        System.out.println(arr[index]);
        //向左递归
        if((index*2+1)<arr.length){
            perOreder(2*index+1);
        }
        //向右递归
        if((index*2+2)<arr.length){
            perOreder(index*2+2 );
        }
    }
}