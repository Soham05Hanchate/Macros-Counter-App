import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class excel_data_storing {
    float protein, calories, carb, fat;

    public excel_data_storing(float prot, float cal, float carbs, float fats) {
        this.protein = prot;
        this.calories = cal;
        this.carb = carbs;
        this.fat = fats;

        LocalDateTime dt = LocalDateTime.now();

        // Separate date, day, and time
        String date = dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String day = dt.format(DateTimeFormatter.ofPattern("EEEE"));
        String time = dt.format(DateTimeFormatter.ofPattern("HH:mm a"));

        String filePath = "C:\\Users\\Soham\\Desktop\\healthdata.xlsx";

        try {
            File file = new File(filePath);
            Workbook workbook;
            Sheet sheet;

            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheetAt(0);
            } else {
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Health Data");

                // Create header row
                Row header = sheet.createRow(0);
                header.createCell(0).setCellValue("Date");
                header.createCell(1).setCellValue("Day");
                header.createCell(2).setCellValue("Time");
                header.createCell(3).setCellValue("Proteins");
                header.createCell(4).setCellValue("Calories");
                header.createCell(5).setCellValue("Carbohydrates");
                header.createCell(6).setCellValue("Fats");
            }

            int lastRow = sheet.getLastRowNum() + 1;
            Row row = sheet.createRow(lastRow);
            row.createCell(0).setCellValue(date);
            row.createCell(1).setCellValue(day);
            row.createCell(2).setCellValue(time);
            row.createCell(3).setCellValue(protein);
            row.createCell(4).setCellValue(calories);
            row.createCell(5).setCellValue(carb);
            row.createCell(6).setCellValue(fat);

            FileOutputStream fos = new FileOutputStream(filePath);
            workbook.write(fos);
            workbook.close();
            fos.close();

            System.out.println("✅ Data saved successfully to Excel!");

        } catch (IOException e) {
            throw new RuntimeException("❌ Error writing to Excel file", e);
        }
    }
}
