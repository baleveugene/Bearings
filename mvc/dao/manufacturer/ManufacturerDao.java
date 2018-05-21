/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.dao.manufacturer;

import com.springapp.mvc.domain.manufacturer.Manufacturer;
import java.util.List;



public interface ManufacturerDao {
    
    public List<Manufacturer> getListManufacturer();
    public  Manufacturer getManufacturer(String brand);
    public  void addManufacturer(Manufacturer manufacturer);
    
}
