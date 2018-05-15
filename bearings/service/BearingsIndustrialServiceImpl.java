
package com.springapp.bearings.service;

import com.springapp.bearings.dao.BearingsIndustrialDao;

import com.springapp.bearings.domain.BearingsIndustrial;
import com.springapp.bearings.domain.BearingsIndustrialSize;
import com.springapp.bearings.domain.BearingsIndustrialType;

import com.springapp.bearings.util.ImageUtilBearings;
import com.springapp.bearings.util.UploadMultipartFileUtilBearings;
import com.springapp.bearings.util.exel.ParserExcelBearingsIndustrial;
import com.springapp.light.domain.LightOffice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service 
public class BearingsIndustrialServiceImpl implements BearingsIndustrialService {
      
    @Autowired  BearingsIndustrialDao bearingsIndustrialDao;
    
    @Override @Transactional
    public void uploadBearingsIndustrial(String path, MultipartFile[] file) {
        for (int i = 0; i < file.length; i++) {
            try {
                File uploadFile = UploadMultipartFileUtilBearings.uploadFile(path, file[i]);
                BearingsIndustrial bearingsIndustrial = ParserExcelBearingsIndustrial.readBearingsIndustrial(uploadFile);
                bearingsIndustrialDao.saveBearingsIndustrial(bearingsIndustrial);
                uploadFile.delete();
                System.out.println("Successfully uploaded: " + file[i].getOriginalFilename());
            } catch (IOException e) {
                System.out.println("Failed to upload file: " + e.getMessage());
            }
        }
    }
    
    @Override @Transactional
    public List<BearingsIndustrial> getListBearingsIndustrial() {
    return  bearingsIndustrialDao.getListBearingsIndustrial();
    }           
    
    @Override @Transactional
    public List<BearingsIndustrialSize> getListBearingsIndustrialSize() {
    return  bearingsIndustrialDao.getListBearingsIndustrialSize();
    }
            
    @Override @Transactional
    public List<BearingsIndustrialType> getListBearingsIndustrialType() {
    return  bearingsIndustrialDao.getListBearingsIndustrialType();
    }
    
    @Override @Transactional
    public List<BearingsIndustrial> getListBearingsIndustrial(String size, String type) {
    return  bearingsIndustrialDao.getListBearingsIndustrial(size, type);
    }   
   
        @Transactional
    public String[] listImage(String path) {
        return ImageUtilBearings.getListImage(path);
    }
    
    
        @Transactional
    public void uploadImagesBearings(String path, MultipartFile[] images) {
        for (int i = 0; i < images.length; i++) {
            try {
                UploadMultipartFileUtilBearings.uploadImage(path, images[i]);
                System.out.println("Successfully uploaded photo: " + images[i].getOriginalFilename());
            } catch (IOException e) {
                System.out.println("Failed to upload photo: " + e.getMessage());
            }
        }
    }
    
    
    @Override @Transactional
    public BearingsIndustrial getBearingsById(String id) {
        return  bearingsIndustrialDao.getBearingsById(id);
    }
    
    @Override @Transactional
    public BearingsIndustrial getBearingsByUrl(String url) {
    return  bearingsIndustrialDao.getBearingsByUrl(url);
    }
    
    @Override @Transactional
    public void renewFiltersBearings() {               
        bearingsIndustrialDao.renewBearingsIndustrialSize();  
        bearingsIndustrialDao.renewBearingsIndustrialType();
    }

    @Override @Transactional
    public List<BearingsIndustrial> getListBearingsByIds(String ids) {
         String[] idsArr = (ids != null) ? ids.split(",") : null;
      return bearingsIndustrialDao.getListBearingsByIds(idsArr);
    }
   
    @Override @Transactional
    public List<BearingsIndustrial> getListBearingsFromSearch(String word) {
      return bearingsIndustrialDao.getListBearingsFromSearch( word);
    }      
}
