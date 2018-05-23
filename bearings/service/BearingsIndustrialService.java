/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.bearings.service;

import com.springapp.bearings.domain.BearingsIndustrial;
import com.springapp.bearings.domain.BearingsIndustrialCountry;
import com.springapp.bearings.domain.BearingsIndustrialInnerDiameter;
import com.springapp.bearings.domain.BearingsIndustrialOuterDiameter;
import com.springapp.bearings.domain.BearingsIndustrialWidth;
import com.springapp.bearings.domain.BearingsIndustrialManufacturer;
import com.springapp.bearings.domain.BearingsIndustrialType;
import com.springapp.bearings.domain.BearingsIndustrialSubType;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;


public interface BearingsIndustrialService {
    

 public String[] listImage(String path);
 
  public void uploadImagesBearings(String path, MultipartFile[] images);
//    public Wesold getWesold(int id);
    public BearingsIndustrial getBearingsById(String id);
    public BearingsIndustrial getBearingsByUrl(String url);
    
    public  List<BearingsIndustrial> getListBearingsByIds(String ids);
    public  List<BearingsIndustrial> getListBearingsFromSearch(String word);
//    public List<Wesold> getListWesold();
    public List<BearingsIndustrial> getListBearingsIndustrial();
    public List<BearingsIndustrial> getListBearingsIndustrial(
            String innerDiameter, String outerDiameter, String width, 
            String[] type, String[] subtype, String manufacturer, String country);
    public void uploadBearingsIndustrial(String path, MultipartFile[] file);
          
    public List<BearingsIndustrialInnerDiameter> getListBearingsIndustrialInnerDiameter();
    public List<BearingsIndustrialOuterDiameter> getListBearingsIndustrialOuterDiameter();
    public List<BearingsIndustrialWidth> getListBearingsIndustrialWidth();
    public List<BearingsIndustrialType> getListBearingsIndustrialType();
    public List<BearingsIndustrialSubType> getListBearingsIndustrialSubType();
    public List<BearingsIndustrialManufacturer> getListBearingsIndustrialManufacturer();
    public List<BearingsIndustrialCountry> getListBearingsIndustrialCountry();
      
    public void renewFiltersBearings();
}

