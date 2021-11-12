package com.cn.execl;

import com.spire.xls.ExcelVersion;

import com.spire.xls.Workbook;

import com.spire.xls.Worksheet;




public class de {


    public static void main(String[] args) {


        //加载文档


        Workbook wb = new Workbook();


        wb.loadFromFile("test.xlsx");




        //获取工作表


        Worksheet sheet = wb.getWorksheets().get(0);




        sheet.deleteRow(1);//删除第1行


        //sheet.deleteRow(1,2);//删除第1行及下一行在内的两行


        sheet.deleteColumn(4);//删除第4列


        //sheet.deleteColumn(4,2);//删除第4列及右侧一列在内的两列




        //保存文档


        wb.saveToFile("DeleteRowAndColumn.xlsx");


        wb.dispose();


    }


}