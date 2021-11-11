import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExportExcelToLocal {
    public static void main(String[] args) {
        String title[] = {"工号","姓名","部门"};
        String content[][] = {
                {"001","乔峰","财务部"},
                {"002","段誉","销售部"},
                {"003","虚竹","采购部"},
                {"004","张无忌","研发部"},
                {"005","黄蓉","人力资源部"}
        };

        //1.创建一个文件
        File file = new File("D:/ExportExcelToLocal.xls");

        try {
            //2.创建WritableWorkbook工作簿对象，并将其接入创建的文件
            WritableWorkbook writableWorkbook = Workbook.createWorkbook(file);

            //3.创建一个Sheet，第一个参数是sheet的名称，第二个参数是索引号
            //（可通过WritableFont、WritableCellFormat等方法对单元格的属性进行设置）
            WritableSheet writableSheet = writableWorkbook.createSheet("sheet1", 0);

            //4.在sheet中加入数据
            for (int i = 0; i < title.length; i++) { //标题行
                writableSheet.addCell(new Label(i,0,title[i])); //new Label(列号，行号，内容)
            }
            for (int i = 0; i < content.length; i++) { //内容
                for (int j = 0; j < content[0].length; j++){
                    writableSheet.addCell(new Label(j, i+1, content[i][j]));
                }
            }

            //5.对WritableWorkbook对象执行写入操作
            writableWorkbook.write();
            writableWorkbook.close(); //关闭writableWorkbook

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /**
     * 将数据写入到excel中
     */
    public static  void makeExcel(List<List<String>> result) {

        //第一步，创建一个workbook对应一个excel文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        //第二部，在workbook中创建一个sheet对应excel中的sheet
        HSSFSheet sheet = workbook.createSheet("病例日期表");
        //第三部，在sheet表中添加表头第0行，老版本的poi对sheet的行列有限制
        HSSFRow row = sheet.createRow(0);
        //第四步，创建单元格，设置表头
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("date");
        cell = row.createCell(1);
        cell.setCellValue("month");
        cell = row.createCell(2);
        cell.setCellValue("weekday");
        cell = row.createCell(3);
        cell.setCellValue("number");
        cell = row.createCell(4);
        cell.setCellValue("IsCaseDay");
        cell = row.createCell(5);
        cell.setCellValue("temperature");
        cell = row.createCell(6);
        cell.setCellValue("airPressure");
        cell = row.createCell(7);
        cell.setCellValue("RH(%)");
        cell = row.createCell(8);
        cell.setCellValue("so2μg/m3");
        cell = row.createCell(9);
        cell.setCellValue("no2μg/m3");
        cell = row.createCell(10);
        cell.setCellValue("pm10μg/m3");
        cell = row.createCell(11);
        cell.setCellValue("co mg/m3");
        cell = row.createCell(12);
        cell.setCellValue("o3-8h μg/m3");
        cell = row.createCell(13);
        cell.setCellValue("pm2.5μg/m3");

        //第五步，写入数据
        for(int i=0;i<result.size();i++) {

            List<String> oneData = result.get(i);
            HSSFRow row1 = sheet.createRow(i + 1);
            for(int j=0;j<oneData.size();j++) {

                //创建单元格设值
                row1.createCell(j).setCellValue(oneData.get(j));
            }
        }

        //将文件保存到指定的位置
        try {
            FileOutputStream fos = new FileOutputStream("E:\\result.xls");
            workbook.write(fos);
            System.out.println("写入成功");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}