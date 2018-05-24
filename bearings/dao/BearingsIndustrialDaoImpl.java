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

import com.springapp.mvc.util.PrintInFile;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.sql.DataSource;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
//import org.springframework.jdbc.o
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;


@Repository 
public class BearingsIndustrialDaoImpl extends PrintInFile implements BearingsIndustrialDao{

    @Autowired private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public BearingsIndustrial getBearingsById(String id) { 
        Query query = sessionFactory.getCurrentSession().createQuery("from BearingsIndustrial where id='" + id+ "'" );
        return (BearingsIndustrial) query.uniqueResult();
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public BearingsIndustrial getBearingsByUrl(String url) { 
        Query query = sessionFactory.getCurrentSession().createQuery("from BearingsIndustrial where url='" + url+ "'" );
        return (BearingsIndustrial) query.uniqueResult();
    }
    
    //       ORDER BY model DESC
    
    @Override @SuppressWarnings("unchecked")
    public void saveBearingsIndustrial(BearingsIndustrial bearingsIndustrial) { 
    sessionFactory.getCurrentSession().saveOrUpdate(bearingsIndustrial);
    }    
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrialInnerDiameter> getListBearingsIndustrialInnerDiameter(){ 
       return (List<BearingsIndustrialInnerDiameter>)sessionFactory.getCurrentSession()
               .createCriteria(BearingsIndustrialInnerDiameter.class)
               .list();  
    }
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrialOuterDiameter> getListBearingsIndustrialOuterDiameter(){ 
       return (List<BearingsIndustrialOuterDiameter>)sessionFactory.getCurrentSession()
               .createCriteria(BearingsIndustrialOuterDiameter.class)
               .list();  
    }
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrialWidth> getListBearingsIndustrialWidth(){ 
       return (List<BearingsIndustrialWidth>)sessionFactory.getCurrentSession()
               .createCriteria(BearingsIndustrialWidth.class)
               .list();  
    }
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrialType> getListBearingsIndustrialType(){ 
       return (List<BearingsIndustrialType> )sessionFactory.getCurrentSession()
               .createCriteria(BearingsIndustrialType.class)
               .addOrder(Order.desc("type"))
               .list();
    }
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrialSubType> getListBearingsIndustrialSubType(){ 
       return (List<BearingsIndustrialSubType> )sessionFactory.getCurrentSession()
               .createCriteria(BearingsIndustrialSubType.class)
               .list();
    }
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrialManufacturer> getListBearingsIndustrialManufacturer(){ 
       return (List<BearingsIndustrialManufacturer> )sessionFactory.getCurrentSession()
               .createCriteria(BearingsIndustrialManufacturer.class)
               .list();
    }
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrialCountry> getListBearingsIndustrialCountry(){ 
       return (List<BearingsIndustrialCountry> )sessionFactory.getCurrentSession()
               .createCriteria(BearingsIndustrialCountry.class)
               .list();
    }
         
    @Override
    @SuppressWarnings("unchecked")
    public List<BearingsIndustrial> getListBearingsIndustrial() {
    return sessionFactory.getCurrentSession().createCriteria(BearingsIndustrial.class)
            .addOrder(Order.desc("model"))
            .list();
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<BearingsIndustrial> getListBearingsIndustrial(
            String innerDiameter, String outerDiameter, String width, 
            String[] type, String[] subtype, String manufacturer, String country) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(BearingsIndustrial.class);
        if (innerDiameter != null && !innerDiameter.equals("")){            
            String[] arrInnerDFromTo = innerDiameter.split("<d<= ");           
            if(arrInnerDFromTo.length>1){
                crit.add(Restrictions.between("innerDiameter", arrInnerDFromTo[0], arrInnerDFromTo[1]));
            } else{            
                crit.add(Restrictions.sqlRestriction("d_inner_diameter >"+innerDiameter.substring(0, innerDiameter.indexOf("<"))));
            }                    
        }
        if (outerDiameter != null && !outerDiameter.equals("")){            
            String[] arrOuterDFromTo = outerDiameter.split("<D<=");           
            if(arrOuterDFromTo.length>1){
                crit.add(Restrictions.between("outerDiameter", arrOuterDFromTo[0], arrOuterDFromTo[1]));
            } else{            
                crit.add(Restrictions.sqlRestriction("D_outer_diameter >"+outerDiameter.substring(0, outerDiameter.indexOf("<"))));
            }                    
        }
        if (width != null && !width.equals("")){            
            String[] arrWidthFromTo = width.split("<B<=");           
            if(arrWidthFromTo.length>1){
                crit.add(Restrictions.between("width", arrWidthFromTo[0], arrWidthFromTo[1]));
            } else{            
                crit.add(Restrictions.sqlRestriction("B_width >"+width.substring(0, width.indexOf("<"))));
            }                    
        }
        if (type != null && !type[0].equals("")){   
            crit.add(Restrictions.in("typeEn", type));
        }
        if (subtype != null && !subtype[0].equals("")){   
            crit.add(Restrictions.in("subTypeEn", subtype));
        }
        if (manufacturer != null && !manufacturer.equals("")){   
            crit.add(Restrictions.eq("manufacturerEn", manufacturer));
        }
        if (country != null && !country.equals("")){   
            crit.add(Restrictions.eq("countryEn", country));
        }
        return crit.list();     
    }
             
    @Override
    @SuppressWarnings("unchecked")
    public void renewBearingsIndustrialSize() {
        renewBearingsFilter(BearingsIndustrialSubType.class.getSimpleName(),"industrial", "subtype");
    }

    @Override
    @SuppressWarnings("unchecked")
    public void renewBearingsIndustrialType() {
        renewBearingsFilter(BearingsIndustrialType.class.getSimpleName(), "all", "type");
    }
   
    @Override
    @SuppressWarnings("unchecked")
    public List<BearingsIndustrial> getListBearingsByIds(String [] idsArr){
     Criteria criteria = sessionFactory.getCurrentSession().createCriteria(BearingsIndustrial.class);
     if (idsArr != null && !idsArr[0].equals("") )   criteria.add(Restrictions.in("id",  idsArr));
        return criteria.list(); 
    } 
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrial> getListBearingsFromSearch(String word){
    return sessionFactory.getCurrentSession().createQuery("from BearingsIndustrial where model LIKE '%"+word+"%' ORDER BY model DESC").list();
    } 
    
    
    
    @SuppressWarnings("unchecked")
    private void renewBearingsFilter(String className, String typeBearings, String checkBoxName) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from " + className).executeUpdate();
        List<String> list;
if(typeBearings.equals("all"))  list = session.createQuery("select M." + checkBoxName + " from BearingsIndustrial M").list();
else  list = session.createQuery("select M." + checkBoxName + " from BearingsIndustrial M where type='"+typeBearings+"'").list();

               
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toLowerCase());
        }
        
        Set<String> set = new HashSet<String>();
        for(String val : list) {
            set.add(val);
        }
           
        if(className.equals(BearingsIndustrialInnerDiameter.class.getSimpleName())) {
            for (String s : set) {
                session.save(getBearingsIndustrialInnerDiameter(s, Collections.frequency(list, s)));
            }
        }
        else if(className.equals(BearingsIndustrialType.class.getSimpleName())){
            for (String s : set) {
                session.save(getBearingsIndustrialType(s, Collections.frequency(list, s)));
            }
        }          
    }       
    
    private BearingsIndustrialInnerDiameter getBearingsIndustrialInnerDiameter(String val, int num) {
        BearingsIndustrialInnerDiameter bearingsIndustrialInnerDiameter = new BearingsIndustrialInnerDiameter();
        bearingsIndustrialInnerDiameter.setInnerDiameter(val);
        bearingsIndustrialInnerDiameter.setNum(num);
        return bearingsIndustrialInnerDiameter;
    }
    private BearingsIndustrialOuterDiameter getBearingsIndustrialOuterDiameter(String val, int num) {
        BearingsIndustrialOuterDiameter bearingsIndustrialOuterDiameter = new BearingsIndustrialOuterDiameter();
        bearingsIndustrialOuterDiameter.setOuterDiameter(val);
        bearingsIndustrialOuterDiameter.setNum(num);
        return bearingsIndustrialOuterDiameter;
    }
    private BearingsIndustrialWidth getBearingsIndustrialWidth(String val, int num) {
        BearingsIndustrialWidth bearingsIndustrialWidth = new BearingsIndustrialWidth();
        bearingsIndustrialWidth.setWidth(val);
        bearingsIndustrialWidth.setNum(num);
        return bearingsIndustrialWidth;
    }
    private BearingsIndustrialType getBearingsIndustrialType(String val, int num) {
        BearingsIndustrialType bearingsIndustrialType = new BearingsIndustrialType();
        bearingsIndustrialType.setType(val);
        bearingsIndustrialType.setNum(num);
        return bearingsIndustrialType;
    }                        
}
