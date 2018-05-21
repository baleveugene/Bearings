/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.dao.manufacturer;

import com.springapp.mvc.domain.manufacturer.Manufacturer;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ManufacturerDaoImpl implements ManufacturerDao{

     @Autowired
    private SessionFactory sessionFactory;

    
    @Override
      @SuppressWarnings("unchecked")
    public List<Manufacturer> getListManufacturer() {
  return sessionFactory.getCurrentSession().createQuery("from Manufacturer ORDER BY brand ASC").list();
    }
    
    @Override
      @SuppressWarnings("unchecked")
    public   Manufacturer getManufacturer(String brand){
//  return sessionFactory.getCurrentSession().createQuery("from Manufacturer ORDER BY brand DESC").list();
   Query query = sessionFactory.getCurrentSession().createQuery("from Manufacturer where  brand='"+brand+"'");
        return (Manufacturer) query.uniqueResult();
    }

    @Override
    public void addManufacturer(Manufacturer manufacturer) {
       sessionFactory.getCurrentSession().saveOrUpdate(manufacturer);
    }
    
}
