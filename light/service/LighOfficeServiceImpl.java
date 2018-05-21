
package com.springapp.light.service;

import com.springapp.light.dao.LightOfficeDao;

import com.springapp.light.domain.LightOffice;
import com.springapp.light.domain.LightOfficePower;
import com.springapp.light.domain.LightOfficeSize;
import com.springapp.light.domain.LightOfficeType;

import com.springapp.light.util.ImageUtilLight;
import com.springapp.light.util.UploadMultipartFileUtilLight;
import com.springapp.light.util.exel.ParserExcelLightOffice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service 
public class LighOfficeServiceImpl implements LighOfficeService {

        
    @Autowired  LightOfficeDao lightOfficeDao;
    
    @Override @Transactional
    public void uploadLightOffice(String path, MultipartFile[] file) {
        for (int i = 0; i < file.length; i++) {
            try {
                File uploadFile = UploadMultipartFileUtilLight.uploadFile(path, file[i]);
                LightOffice lightOffice = ParserExcelLightOffice.readLightOffice(uploadFile);
                lightOfficeDao.saveLightOffice(lightOffice);
                uploadFile.delete();
                System.out.println("Successfully uploaded machine: " + file[i].getOriginalFilename());
            } catch (IOException e) {
                System.out.println("Failed to upload machine file: " + e.getMessage());
            }
        }
    }
    
    @Override @Transactional
    public List<LightOffice> getListLightOffice() {
    return  lightOfficeDao.getListLightOffice();
    }
    
  
    
    @Override @Transactional
    public List<LightOfficePower> getListLightOfficePower() {
    return  lightOfficeDao.getListLightOfficePower();
    }
    
    @Override @Transactional
    public List<LightOfficeSize> getListLightOfficeSize() {
    return  lightOfficeDao.getListLightOfficeSize();
    }
    
    
  
    
    
    @Override @Transactional
    public List<LightOfficeType> getListLightOfficeType() {
    return  lightOfficeDao.getListLightOfficeType();
    }
    
    @Override @Transactional
    public List<LightOffice> getListLightOffice(String emergency, String powers, String size, String type) {
        String[] arrPowers = (powers != null) ? powers.split(",") : null;
    return  lightOfficeDao.getListLightOffice(emergency, arrPowers, size, type);
    }
    
    @Override @Transactional
    public LightOffice getLightByUrl(String url) {
    return  lightOfficeDao.getLightByUrl(url);
    }
    
        @Transactional
    public String[] listImage(String path) {
        return ImageUtilLight.getListImage(path);
    }
    
    
        @Transactional
    public void uploadImagesLight(String path, MultipartFile[] images) {
        for (int i = 0; i < images.length; i++) {
            try {
                UploadMultipartFileUtilLight.uploadImage(path, images[i]);
                System.out.println("Successfully uploaded photo: " + images[i].getOriginalFilename());
            } catch (IOException e) {
                System.out.println("Failed to upload photo: " + e.getMessage());
            }
        }
    }
    
    
    @Override @Transactional
    public LightOffice getLightById(String id) {
    return  lightOfficeDao.getLightById(id);
    }
    
    @Override @Transactional
    public void renewFiltersLight() {
        
   
        
    lightOfficeDao.renewLightOfficePower();
    lightOfficeDao.renewLightOfficeSize();
      
    lightOfficeDao.renewLightOfficeType();

    }


    @Override @Transactional
    public List<LightOffice> getListLighByIds(String ids) {
         String[] idsArr = (ids != null) ? ids.split(",") : null;
      return lightOfficeDao.getListLighByIds(idsArr);
    }
    @Override @Transactional
    public List<LightOffice> getListLightFromSearch(String word) {
      return lightOfficeDao.getListLightFromSearch( word);
    }
   
    
}
