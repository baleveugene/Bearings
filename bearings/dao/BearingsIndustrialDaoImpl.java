/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.bearings.dao;

import com.springapp.bearings.domain.BearingsIndustrial;
import com.springapp.bearings.domain.BearingsIndustrialSize;
import com.springapp.bearings.domain.BearingsIndustrialType;

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
    
    //       ORDER BY model DESC
    
    @Override @SuppressWarnings("unchecked")
    public void saveBearingsIndustrial(BearingsIndustrial bearingsIndustrial) { 
    sessionFactory.getCurrentSession().saveOrUpdate(bearingsIndustrial);
    }    
    
    @Override @SuppressWarnings("unchecked")
    public List<BearingsIndustrialSize> getListBearingsIndustrialSize(){ 
       return (List<BearingsIndustrialSize> )sessionFactory.getCurrentSession().createCriteria(BearingsIndustrialSize.class)
                                                    .addOrder(Order.desc("size")) .list();  
    }
        @Override
    @SuppressWarnings("unchecked")
    public List<BearingsIndustrialType> getListBearingsIndustrialType(){ 
       return (List<BearingsIndustrialType> )sessionFactory.getCurrentSession().createCriteria(BearingsIndustrialType.class)
               .addOrder(Order.desc("type"))
               .list();
    }
         
    @Override
    @SuppressWarnings("unchecked")
    public List<BearingsIndustrial> getListBearingsIndustrial() {
    return sessionFactory.getCurrentSession().createCriteria(BearingsIndustrial.class).addOrder(Order.desc("model")).list();
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<BearingsIndustrial> getListBearingsIndustrial(String size, String type) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(BearingsIndustrial.class);
    if (size != null && !size.equals(""))  crit.add(Restrictions.eq("size", size));
    if (type != null && !type.equals(""))  crit.add(Restrictions.eq("type", type));
         return crit.list();
    }
             
    @Override
    @SuppressWarnings("unchecked")
    public void renewBearingsIndustrialSize() {
        renewBearingsFilter(BearingsIndustrialSize.class.getSimpleName(),"industrial", "size");
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
           
        if(className.equals(BearingsIndustrialSize.class.getSimpleName())) {
            for (String s : set) {
                session.save(getBearingsIndustrialSize(s, Collections.frequency(list, s)));
            }
        }
        else if(className.equals(BearingsIndustrialType.class.getSimpleName())){
            for (String s : set) {
                session.save(getBearingsIndustrialType(s, Collections.frequency(list, s)));
            }
        }          
    }       
    
    private BearingsIndustrialSize getBearingsIndustrialSize(String val, int num) {
        BearingsIndustrialSize bearingsIndustrialSize = new BearingsIndustrialSize();
        bearingsIndustrialSize.setSize(val);
        bearingsIndustrialSize.setNum(num);
        return bearingsIndustrialSize;
    }
    private BearingsIndustrialType getBearingsIndustrialType(String val, int num) {
        BearingsIndustrialType bearingsIndustrialType = new BearingsIndustrialType();
        bearingsIndustrialType.setType(val);
        bearingsIndustrialType.setNum(num);
        return bearingsIndustrialType;
    }                        
}
