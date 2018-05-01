/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.bearings.dao;


import com.springapp.bearings.domain.BearingsIndustrial;
import com.springapp.bearings.domain.BearingsIndustrialSize;
import com.springapp.bearings.domain.BearingsIndustrialType;


import java.util.List;



public interface BearingsIndustrialDao {
    
//    public Video getVideo(String url);
//    
    public List<BearingsIndustrial> getListBearingsIndustrial();
    public List<BearingsIndustrial> getListBearingsIndustrial(String size, String type);
    public BearingsIndustrial getBearingsById(String id);
//    public List<Video> getListVideo(String section);
//    public List<Video> getList10RandomVideo();
//    public List<Video> getListVideoFromRequest(String key);
//    public Video getRandomVideo();
//    public Video getLastInARowVideo();
    
    public void saveBearingsIndustrial(BearingsIndustrial bearingsIndustrial);

    public List<BearingsIndustrialSize> getListBearingsIndustrialSize();
    public List<BearingsIndustrialType> getListBearingsIndustrialType();
    
 
    

    public void  renewBearingsIndustrialSize();

    public void  renewBearingsIndustrialType();
    public List<BearingsIndustrial> getListBearingsByIds(String [] ids);
    public List<BearingsIndustrial> getListBearingsFromSearch(String word);
    
}
