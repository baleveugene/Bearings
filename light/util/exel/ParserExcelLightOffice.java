package com.springapp.light.util.exel;

//import com.springapp.mvc.domain.common.LanguageEntity;
//import com.springapp.mvc.domain.Letter;
import com.springapp.light.domain.LightOffice;


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

public class ParserExcelLightOffice  {

    private static Workbook getWorkbook(FileInputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        }
        return workbook;
    }

    
       public static LightOffice readLightOffice(File file) throws IOException{
      
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = getWorkbook(fis,file.getPath());
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = firstSheet.iterator();
        DataFormatter df = new DataFormatter();

        LightOffice lightOffice = new LightOffice();
        
        df.formatCellValue(rowIterator.next().getCell(1)).trim();
        printInFile("readLightOffice.txt", "1");
        
       
        
        lightOffice.setType(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        printInFile("readLightOffice.txt", "2 setType = " + lightOffice.getType());
        
        lightOffice.setModel(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        printInFile("readLightOffice.txt", "3 getModel = " + lightOffice.getModel());
        
        df.formatCellValue(rowIterator.next().getCell(1)).trim();
        lightOffice.setUrl(getUrl(lightOffice.getModel())); lightOffice.setId(getID(lightOffice.getModel()));
        printInFile("readLightOffice.txt", "4 setUrl"  );
        
        lightOffice.setManufacturer(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
         printInFile("readLightOffice.txt", "5 setManufacturer = " + lightOffice.getManufacturer());
         
        lightOffice.setCountry(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
         printInFile("readLightOffice.txt", "6 setCountry = " + lightOffice.getCountry());
         
        lightOffice.setDiffuser(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
         printInFile("readLightOffice.txt", "7 setDiffuser = " + lightOffice.getDiffuser());
        
        lightOffice.setPower(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        printInFile("readLightOffice.txt", "8 setPower = " + lightOffice.getPower());
        
        lightOffice.setLuminousFlux(intFromCell(rowIterator, df)); 
        lightOffice.setLuminousFluxEmergency(intFromCell(rowIterator, df)); 
        lightOffice.setTemperatureGlow(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setSize(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setSizeInstallation(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 

        lightOffice.setCoefficientPulsation(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setCoefficientPower(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setTypeLidc(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setIndexColor(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setSecurity(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setWeight(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setTemperatureWork(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        
        lightOffice.setGuarantee(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        printInFile("readLightOffice.txt", "21 setGuarantee = " + lightOffice.getGuarantee());

        lightOffice.setDimmingFunction(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        lightOffice.setMountingType(df.formatCellValue(rowIterator.next().getCell(1)).trim()); 
        
        rowIterator.next().getCell(1);
        
        lightOffice.setPhoto1(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        lightOffice.setPhoto2(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        lightOffice.setPhoto3(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        lightOffice.setPhoto4(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        lightOffice.setPhoto5(df.formatCellValue(rowIterator.next().getCell(1)).trim());

        
        lightOffice.setDescriptionEn(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        lightOffice.setVideo1(df.formatCellValue(rowIterator.next().getCell(1)).trim());
        
        fis.close();
        return lightOffice;
    }
 
       private static String getUrl (String str){
        return   str.replaceAll(" ", "-")
                    .replaceAll("'", "-")
                    .replaceAll("\"", "-")
                    .replaceAll(",", "-")
                    .replaceAll(":", "-")
                    .replaceAll(";", "-")
                    .replaceAll("\\.", "-")
                    .replaceAll("&", "-") 
                    .replaceAll("/", "-") 
                    .replaceAll("\\|", "-") // ??
                    .replaceAll("!", "-")
                    .replaceAll("\\?", "-")
                    .replaceAll("\\(", "-")
                    .replaceAll("\\)", "-")
                    .replaceAll("---", "-") 
                    .replaceAll("--", "-")
                    .replaceAll("--", "-") ;
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
