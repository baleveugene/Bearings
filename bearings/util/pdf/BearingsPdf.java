package com.springapp.bearings.util.pdf ;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.springapp.bearings.domain.BearingsIndustrial;

//import dao.vmc.Vmc;
//import com.springapp.mvc.domain.hmc.Hmc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BearingsPdf {

    private static String model;
    private static String type;
//    private static int year;
    
    private static PdfPTable getHeaderTable(String path) throws DocumentException, IOException {
        PdfPTable headerTable = new PdfPTable(3);
//        PdfPTable headerTable = new PdfPTable(2);
        headerTable.setWidthPercentage(100);
//        headerTable.setWidths(new float[]{1.5f,0.5f,2f});
        headerTable.setWidths(new float[]{2f,0.5f, 1.5f});
        
//cell1
//    Image imgLogo = Image.getInstance(path + "/images/logotype.png");
//    Image imgLogo = Image.getInstance(path + "/assets/images/vmc_hmc.jpg");
     Image imgLogo = Image.getInstance(path + "/assets/images/sen_zan_traid.jpg");
    PdfPCell cell1 = new PdfPCell(imgLogo,true);
    cell1.setBorder(Rectangle.NO_BORDER);
//cell2
            PdfPCell cell2 = new PdfPCell();
            cell2.setBorder(Rectangle.NO_BORDER);

        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 14);
        Font greenFont = new Font(Font.FontFamily.TIMES_ROMAN, 14);
        greenFont.setColor(new BaseColor(89, 178, 16));

        PdfPCell cell3 = new PdfPCell();
        Paragraph paragraph = new Paragraph();
        Chunk chunk = new Chunk("Industrial Bearings\n",font);
        paragraph.add(chunk);
//        chunk = new Chunk("+1 203 556-50-69",greenFont);
//        paragraph.add(chunk);
//        chunk = new Chunk("\ncontact@",font);
//        paragraph.add(chunk);
        chunk = new Chunk("www.vmccnc.com/bearings",greenFont);
        paragraph.add(chunk);
        paragraph.setAlignment(Element.ALIGN_RIGHT);
        cell3.addElement(paragraph);
        cell3.setBorder(Rectangle.NO_BORDER);

        headerTable.addCell(cell3);
        headerTable.addCell(cell2);
        headerTable.addCell(cell1);

        return headerTable;
    }

    private static void setForWhoData(Document document, String company, String director) throws DocumentException {
        Font fontBoldBig = new Font(Font.FontFamily.TIMES_ROMAN,22,Font.BOLD);
        Font fontNormal = new Font(Font.FontFamily.TIMES_ROMAN,13);

//        Paragraph paragraph = new Paragraph("\nCommercial proposal",fontBoldBig);
        Paragraph paragraph = new Paragraph("\n" + model + " (Type: " + type +")",fontBoldBig);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);

        paragraph = new Paragraph();
        Chunk chunk;
//        if(!company.equals("")) {
//            chunk = new Chunk("\nto the director of " + company, fontNormal);
//            paragraph.add(chunk);
//            if(!director.equals("")) {
//                chunk = new Chunk(", " + director, fontNormal);
//                paragraph.add(chunk);
//            }
//        } else if(!director.equals("")) {
//            chunk = new Chunk("for " + director, fontNormal);
//            paragraph.add(chunk);
//        }
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        chunk = new Chunk("\n" + dateFormat.format(date), fontNormal);
        paragraph.add(chunk);

        document.add(paragraph);
    }

    
    
    
    private static PdfPTable getItemTable(String path, BearingsIndustrial bearings, boolean showPrice) throws DocumentException, IOException {
//        PdfPTable itemTable = new PdfPTable(4);
      
        PdfPTable itemTable = new PdfPTable(2);
        
        itemTable.setWidthPercentage(100);
        itemTable.setSpacingBefore(20f);
//        itemTable.setSpacingAfter(10f);
//        itemTable.setWidths(new float[]{1f, 1f, 1f, 1f});
        itemTable.setWidths(new float[]{1f, 1f});

        Font fontBold = new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.BOLD);
        Font font = new Font(Font.FontFamily.TIMES_ROMAN,12);

//        PdfPCell[] itemCells = new PdfPCell[4];
        PdfPCell[] itemCells = new PdfPCell[2];

        Image img;
//        try {
//            img = Image.getInstance(path + "/assets/images/products/" + light.getPhoto1());
//            img.setScaleToFitHeight(false);
//            itemCells[0] = new PdfPCell(img, true);
//        } catch (Exception e) {
//            itemCells[0] = new PdfPCell(new Paragraph(""));
//        }
//        
//        
//        itemCells[0].setColspan(2);
//        itemCells[0].setPadding(1);
//        
// itemTable.addCell(itemCells[0]);
 
 

        
        
       

        
        


        try {
            img = Image.getInstance(path + "/assets/images/products/" + bearings.getPhoto1());
            img.setScaleToFitHeight(false);
            itemCells[0] = new PdfPCell(img, true);
        } catch (Exception e) {
            itemCells[0] = new PdfPCell(new Paragraph(""));
        }
        
        try {
            img = Image.getInstance(path + "/assets/images/products/" + bearings.getPhoto2());
            img.setScaleToFitHeight(false);
            itemCells[1] = new PdfPCell(img, true);
        } catch (Exception e) {
            itemCells[1] = new PdfPCell(new Paragraph(""));
        }
        
        
//        for (int i = 0; i < 2; i++) {
        for (int i = 0; i < 2; i++) {
            itemCells[i].setPadding(1);
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }

        itemCells[0] = new PdfPCell(new Paragraph("Type", font));
        itemCells[1] = new PdfPCell(new Paragraph(bearings.getType(), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
        
        itemCells[0] = new PdfPCell(new Paragraph("subType", font));
        itemCells[1] = new PdfPCell(new Paragraph(bearings.getSubType(), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
        
//        itemCells[0] = new PdfPCell(new Paragraph("Country", font));
//        itemCells[1] = new PdfPCell(new Paragraph(light.getCountry(), font));
//          for (int i = 0; i < 2; i++) {
//            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
//            itemTable.addCell(itemCells[i]);
//        }
        
//        &
/*        itemCells[0] = new PdfPCell(new Paragraph("Power, Watt", font));
        itemCells[1] = new PdfPCell(new Paragraph(""+light.getPower(), font));
            for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
            
            
        itemCells[0] = new PdfPCell(new Paragraph("luminous Flux, Lm", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getLuminousFlux()), font));  
            for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
    
            itemCells[0] = new PdfPCell(new Paragraph("Diffuser type", font));
        itemCells[1] = new PdfPCell(new Paragraph(light.getDiffuser(), font));
        
//        for (int i = 0; i < 4; i++) {
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
       



            if (light.getLuminousFluxEmergency()!=0){
        itemCells[0] = new PdfPCell(new Paragraph("luminous Flux Emergency, Lm", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getLuminousFluxEmergency()), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
            }

        itemCells[0] = new PdfPCell(new Paragraph("temperature Glow, C", font));
        itemCells[1] = new PdfPCell(new Paragraph(light.getTemperatureGlow(), font));
                
            for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
          
        itemCells[0] = new PdfPCell(new Paragraph("Size", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getSize()), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }

        itemCells[0] = new PdfPCell(new Paragraph("coefficient Pulsation", font));
        itemCells[1] = new PdfPCell(new Paragraph(light.getCoefficientPulsation(), font));
                
            for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
          
        itemCells[0] = new PdfPCell(new Paragraph("driver power coefficient", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getCoefficientPower()), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }

        itemCells[0] = new PdfPCell(new Paragraph("type of LIDC", font));
        itemCells[1] = new PdfPCell(new Paragraph(light.getTypeLidc(), font));
                
            for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }

          
        itemCells[0] = new PdfPCell(new Paragraph("index Color, Ra", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getIndexColor()), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }

        itemCells[0] = new PdfPCell(new Paragraph("Enclosure protection , IP", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getSecurity()), font));
                
            for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
          
        itemCells[0] = new PdfPCell(new Paragraph("Weight, kg", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getWeight()), font));
        
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
        
        itemCells[0] = new PdfPCell(new Paragraph("Work temperature", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getTemperatureWork()), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
        
        itemCells[0] = new PdfPCell(new Paragraph("Guarantee, years", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getGuarantee()), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
        
        if(!light.getDimmingFunction().equals(""))
        itemCells[0] = new PdfPCell(new Paragraph("dimming Function", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getDimmingFunction()), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }
        
        if(!light.getMountingType().equals(""))
        itemCells[0] = new PdfPCell(new Paragraph("mounting Type", font));
        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(light.getMountingType()), font));
        for (int i = 0; i < 2; i++) {
            itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
            itemTable.addCell(itemCells[i]);
        }


        
//        itemCells[0] = new PdfPCell(new Paragraph("Position/reposition precision, mm", font));
//        itemCells[1] = new PdfPCell(new Paragraph(machine.getPositionRepositionPrecision(), font));
//        itemCells[0] = new PdfPCell(new Paragraph("Machine launching, h", font));
//        itemCells[1] = new PdfPCell(new Paragraph(String.valueOf(machine.getMachineLaunching()), font));
//        for (int i = 0; i < 4; i++) {
//            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
//            itemTable.addCell(itemCells[i]);
//        }

//        if(showPrice) {
//            itemCells[1] = new PdfPCell(new Paragraph(""));
//            itemCells[1].setColspan(2);
//            itemCells[2] = new PdfPCell(new Paragraph("Price", font));
//            itemCells[3] = new PdfPCell(new Paragraph("$" + machine.getPrice() + ".00", font));
//            for (int i = 1; i < 4; i++) {
//                itemCells[i].setBackgroundColor(new BaseColor(238, 238, 238));
//                itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
//                itemTable.addCell(itemCells[i]);
//            }
//        }

       // Одна ячейка 
//        itemCells[0] = new PdfPCell();
//        
//        itemCells[0].addElement(new Paragraph(light.getModel(), fontBold));
//        itemCells[0].addElement(new Paragraph(light.getType()+ "\n" 
//                + light.getManufacturer()+ ", "
//                + light.getCountry()+  
//                 "\nDescription:\n" + light.getDescriptionEn().replace("<br>",""), font));
//        itemCells[0].setColspan(2);
//        itemCells[0].setRowspan(2);
//        itemCells[0].setPadding(5);
//        
//         itemTable.addCell(itemCells[0]);
        
//        for (int i = 0; i < 2; i++) {
//            itemCells[i].setBorderColor(new BaseColor(22, 22, 22));
//            itemTable.addCell(itemCells[i]);
//        }
        
        
                try {
            img = Image.getInstance(path + "/assets/images/products/" + light.getPhoto3());
            img.setScaleToFitHeight(false);
            itemCells[0] = new PdfPCell(img, true);
        } catch (Exception e) {
            itemCells[0] = new PdfPCell(new Paragraph(""));
        }
        
//        try {
//            img = Image.getInstance(path + "/assets/images/products/" + light.getPhoto4());
//            img.setScaleToFitHeight(false);
//            itemCells[1] = new PdfPCell(img, true);
//        } catch (Exception e) {
//            itemCells[1] = new PdfPCell(new Paragraph(""));
//        }
        
        
      */  
        
        return itemTable;
    }

    private static Paragraph getFooterParagraph() {
        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 14);
        Font fontSmall = new Font(Font.FontFamily.TIMES_ROMAN, 12);
        Font fontSmallGreen = new Font(Font.FontFamily.TIMES_ROMAN, 12);
        fontSmallGreen.setColor(new BaseColor(89, 178, 16));

        Paragraph paragraph = new Paragraph();
        Chunk chunk = new Chunk();
//        chunk = new Chunk("VMC & HMC",font);
//        paragraph.add(chunk);
        chunk = new Chunk("\nIndustrial Lighting: ",fontSmall);
        paragraph.add(chunk);
//        chunk = new Chunk("+1 203 556-50-69",fontSmallGreen);
//        paragraph.add(chunk);
    //        chunk = new Chunk("\ncontact@",fontSmall);
    //        paragraph.add(chunk);
        chunk = new Chunk("\nPhone: +375 (29) 255-88-88",fontSmall);
        paragraph.add(chunk);
        
        chunk = new Chunk("\nwww.vmccnc.com/light",fontSmallGreen);
        paragraph.add(chunk);
        
        
        paragraph.setAlignment(Element.ALIGN_LEFT);
        return paragraph;
    }

    public static String createPdfBearings(String path, BearingsIndustrial light, String company, String director, boolean showPrice) throws Exception {
     
        model = light.getModel();
        type = light.getType();
//        year = light.getYear();
        
        Document document = new Document(PageSize.A4,50,50,50,50);
        String pathPdf = path + "/offer-single.pdf";
        PdfWriter.getInstance(document, new FileOutputStream(pathPdf));
        document.open();

        document.add(getHeaderTable(path));
        setForWhoData(document,company,director);
        document.add(getItemTable(path, light, showPrice));
        document.add(getFooterParagraph());

        document.close();
        return pathPdf;
    }

}
