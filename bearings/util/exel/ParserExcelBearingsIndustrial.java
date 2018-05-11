package com.springapp.bearings.util.exel;

//import com.springapp.mvc.domain.common.LanguageEntity;
//import com.springapp.mvc.domain.Letter;
import com.springapp.bearings.domain.BearingsIndustrial;

//import com.springapp.mvc.domain.lathe.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParserExcelBearingsIndustrial  {

    private static Workbook getWorkbook(FileInputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        }
        return workbook;
    }

    
       public static BearingsIndustrial readBearingsIndustrial(File file) throws IOException{
      
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = getWorkbook(fis,file.getPath());
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = firstSheet.iterator();
        DataFormatter df = new DataFormatter();

        BearingsIndustrial bearingsIndustrial = new BearingsIndustrial();
        
        df.formatCellValue(rowIterator.next().getCell(1)).trim();
        printInFile("readBearingsIndustrial.txt", "1");
        
        bearingsIndustrial.setType(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        printInFile("readBearingsIndustrial.txt", "2 setType = " + bearingsIndustrial.getType());
        
        bearingsIndustrial.setSubType(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        printInFile("readBearingsIndustrial.txt", "3 setSubType = " + bearingsIndustrial.getSubType());
        
        bearingsIndustrial.setModel(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        printInFile("readBearingsIndustrial.txt", "4 getModel = " + bearingsIndustrial.getModel());             
        
        bearingsIndustrial.setManufacturer(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
         printInFile("readBearingsIndustrial.txt", "5 setManufacturer = " + bearingsIndustrial.getManufacturer());
         
        bearingsIndustrial.setCountry(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
         printInFile("readBearingsIndustrial.txt", "6 setCountry = " + bearingsIndustrial.getCountry());        
        
        bearingsIndustrial.setBasicDynamicLoadRating(intFromCell(rowIterator, df)); 
        bearingsIndustrial.setBasicStaticLoadRating(intFromCell(rowIterator, df));
        bearingsIndustrial.setFatiqueLoadLimit(intFromCell(rowIterator, df));
        bearingsIndustrial.setReferenceSpeed(intFromCell(rowIterator, df));
        bearingsIndustrial.setLimitingSpeed(intFromCell(rowIterator, df));
       
        bearingsIndustrial.setSize(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
          
        bearingsIndustrial.setWeight(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        bearingsIndustrial.setTemperatureWork(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        
        bearingsIndustrial.setGuarantee(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        printInFile("readBearingsIndustrial.txt", "21 setGuarantee = " + bearingsIndustrial.getGuarantee());

        rowIterator.next().getCell(1);
        
        bearingsIndustrial.setPhoto1(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        bearingsIndustrial.setPhoto2(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        bearingsIndustrial.setPhoto3(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        bearingsIndustrial.setPhoto4(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        bearingsIndustrial.setPhoto5(df.formatCellValue(rowIterator.next().getCell(1)).trim());

        
        bearingsIndustrial.setDescriptionEn(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        bearingsIndustrial.setVideo1(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        
        fis.close();
        return bearingsIndustrial;
    }
    
       private static String getID (String str){
        return   str.replaceAll(" ", "")
                    .replaceAll("'", "")
                    .replaceAll("\"", "")
                    .replaceAll(",", "")
                    .replaceAll(":", "")
                    .replaceAll(";", "")
                    .replaceAll("\\.", "")
                    .replaceAll("&", "") 
                    .replaceAll("/", "") 
                    .replaceAll("\\|", "") // ??
                    .replaceAll("!", "")
                    .replaceAll("\\?", "")
                    .replaceAll("\\(", "")
                    .replaceAll("\\)", "")
                    .replaceAll("---", "") 
                    .replaceAll("--", "")
                    .replaceAll("--", "") ;
       }
      
    private static int intFromCell (Iterator<Row> rowIterator, DataFormatter df ){
           int tt;
          Row tmp = rowIterator.next();
                  try {
                  tt = (int)tmp.getCell(1).getNumericCellValue();   
                   } catch (Exception e) {
                    tt = Integer.parseInt( df.formatCellValue(tmp.getCell(1)).trim());
                   }        
         return tt;
       }
       
    static void printInFile(String fileName, String str){    // For Check             
         File file = new File("d:\\2\\"+fileName);         
//            File file = new File("HMC exeption2.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("-------> "+new Date()+"): \n");
            fileWriter.write(str + "\n\n");
        } catch (IOException ex) {
//            Logger.getLogger(ControllerMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        } 


}
