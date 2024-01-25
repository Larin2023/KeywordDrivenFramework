package Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Constants.FrameworkConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ReadExcelSheetData {

    public ArrayList<String> readExcelData(int colNo) throws IOException {
        String filePath = FrameworkConstants.FILE_PATH;
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        java.util.Iterator<Row> rowIterator = sheet.rowIterator();
        rowIterator.next();

        ArrayList<String> dataList = new ArrayList<>();

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Cell cell = row.getCell(colNo);
            String data = cell.getStringCellValue();
            dataList.add(data);
        }

        System.out.println("List: " + dataList);
        return dataList;
    }
    public void DemoFile(int i)
    {

    }
}
