/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.bearings.dao;


import com.springapp.bearings.domain.BearingsIndustrial;
import com.springapp.bearings.domain.BearingsIndustrialCountry;
import com.springapp.bearings.domain.BearingsIndustrialInnerDiameter;
import com.springapp.bearings.domain.BearingsIndustrialOuterDiameter;
import com.springapp.bearings.domain.BearingsIndustrialWidth;
import com.springapp.bearings.domain.BearingsIndustrialManufacturer;
import com.springapp.bearings.domain.BearingsIndustrialType;
import com.springapp.bearings.domain.BearingsIndustrialSubType;


import java.util.List;



public interface BearingsIndustrialDao {
    
//    public Video getVideo(String url);
//    
    public List<BearingsIndustrial> getListBearingsIndustrial();
    public List<BearingsIndustrial> getListBearingsIndustrial(
            String innerDiameter, String outerDiameter, String width, 
            String[] type, String[] subtype, String manufacturer, String country);
    public BearingsIndustrial getBearingsById(String id);
    public BearingsIndustrial getBearingsByUrl(String url);
//    public List<Video> getListVideo(String section);
//    public List<Video> getList10RandomVideo();
//    public List<Video> getListVideoFromRequest(String key);
//    public Video getRandomVideo();
//    public Video getLastInARowVideo();
    
    public void saveBearingsIndustrial(BearingsIndustrial bearingsIndustrial);

    public List<BearingsIndustrialInnerDiameter> getListBearingsIndustrialInnerDiameter();
    public List<BearingsIndustrialOuterDiameter> getListBearingsIndustrialOuterDiameter();
    public List<BearingsIndustrialWidth> getListBearingsIndustrialWidth();
    public List<BearingsIndustrialType> getListBearingsIndustrialType();
    public List<BearingsIndustrialSubType> getListBearingsIndustrialSubType();
    public List<BearingsIndustrialManufacturer> getListBearingsIndustrialManufacturer();
    public List<BearingsIndustrialCountry> getListBearingsIndustrialCountry();
       
    public void  renewBearingsIndustrialSize();

    public void  renewBearingsIndustrialType();
    public List<BearingsIndustrial> getListBearingsByIds(String [] ids);
    public List<BearingsIndustrial> getListBearingsFromSearch(String word);
    
}
