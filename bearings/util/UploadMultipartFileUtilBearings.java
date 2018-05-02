package com.springapp.bearings.util;

import com.springapp.mvc.util.*;
import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class UploadMultipartFileUtilBearings {

    private static File upload(String path, MultipartFile multipartFile) throws IOException{
        File file = new File(path);
        FileUtils.writeByteArrayToFile(file, multipartFile.getBytes());
        return file;
    }

    public static File uploadFile(String path, MultipartFile multipartFile) throws IOException{
        if(multipartFile.getOriginalFilename().endsWith("xls")){
            return upload(path + "/bearings.xls", multipartFile);
        }
        return upload(path + "/bearings.xlsx", multipartFile);
    }

    public static void uploadImage(String path, MultipartFile image) throws IOException{
        upload(path + "/" + image.getOriginalFilename(), image);
    }
}
