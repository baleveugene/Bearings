/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.light.dao;


import com.springapp.light.domain.LightOffice;
import com.springapp.light.domain.LightOfficePower;
import com.springapp.light.domain.LightOfficeSize;
import com.springapp.light.domain.LightOfficeType;


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
public class LightOfficeDaoImpl extends PrintInFile implements LightOfficeDao{

    @Autowired private SessionFactory sessionFactory;


    @Override
    @SuppressWarnings("unchecked")
    public LightOffice getLightByUrl(String url) { 
        Query query = sessionFactory.getCurrentSession().createQuery("from LightOffice where url='" + url+ "'" );
        return (LightOffice) query.uniqueResult();
    }

    @Override
    @SuppressWarnings("unchecked")
    public LightOffice getLightById(String id) { 
        Query query = sessionFactory.getCurrentSession().createQuery("from LightOffice where id='" + id+ "'" );
        return (LightOffice) query.uniqueResult();
    }
    
    //       ORDER BY model DESC
    
    @Override @SuppressWarnings("unchecked")
    public void saveLightOffice(LightOffice lightOffice) { 
    sessionFactory.getCurrentSession().saveOrUpdate(lightOffice);
    }
    
    @Override @SuppressWarnings("unchecked")
    public List<LightOfficePower> getListLightOfficePower(){ 
       return (List<LightOfficePower> )sessionFactory.getCurrentSession().createCriteria(LightOfficePower.class).list();
   }
 
    
    @Override @SuppressWarnings("unchecked")
    public List<LightOfficeSize> getListLightOfficeSize(){ 
       return (List<LightOfficeSize> )sessionFactory.getCurrentSession().createCriteria(LightOfficeSize.class)
                                                    .addOrder(Order.desc("size")) .list();  
    }
        @Override
    @SuppressWarnings("unchecked")
    public List<LightOfficeType> getListLightOfficeType(){ 
//       return sessionFactory.getCurrentSession().createCriteria(LightOfficePower.class).addOrder(Order.desc("power")).list();
       return (List<LightOfficeType> )sessionFactory.getCurrentSession().createCriteria(LightOfficeType.class)
               .addOrder(Order.desc("type"))
               .list();
//        return  (List<Vmc> ) sessionFactory.getCurrentSession().createCriteria(Vmc.class).list();
    }
    
    
  

    
   
    
    @Override
    @SuppressWarnings("unchecked")
    public List<LightOffice> getListLightOffice() {
    return sessionFactory.getCurrentSession().createCriteria(LightOffice.class).addOrder(Order.desc("model")).list();
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<LightOffice> getListLightOffice(String emergency, String [] arrPowers, String size, String type) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(LightOffice.class);
    if (emergency != null)  crit.add(Restrictions.ne("luminousFluxEmergency", 0));
    if (arrPowers != null && !arrPowers[0].equals(""))   crit.add(Restrictions.in("power", arrPowers));
    if (size != null && !size.equals(""))  crit.add(Restrictions.eq("size", size));
    if (type != null && !type.equals(""))  crit.add(Restrictions.eq("type", type));
         return crit.list();
    }

    
     

     
    @Override
    @SuppressWarnings("unchecked")
    public void renewLightOfficePower() {
        renewLightFilter(LightOfficePower.class.getSimpleName(),"office", "power");
    }
    @Override
    @SuppressWarnings("unchecked")
    public void renewLightOfficeSize() {
        renewLightFilter(LightOfficeSize.class.getSimpleName(),"office", "size");
    }

    @Override
    @SuppressWarnings("unchecked")
    public void renewLightOfficeType() {
        renewLightFilter(LightOfficeType.class.getSimpleName(), "all", "type");
    }

 

  
    
    
    @Override
    @SuppressWarnings("unchecked")
    public List<LightOffice> getListLighByIds(String [] idsArr){
     Criteria criteria = sessionFactory.getCurrentSession().createCriteria(LightOffice.class);
     if (idsArr != null && !idsArr[0].equals("") )   criteria.add(Restrictions.in("id",  idsArr));
        return criteria.list(); 
    } 
    
    @Override @SuppressWarnings("unchecked")
    public List<LightOffice> getListLightFromSearch(String word){
    return sessionFactory.getCurrentSession().createQuery("from LightOffice where model LIKE '%"+word+"%' ORDER BY model DESC").list();
    } 
    
    
    
    @SuppressWarnings("unchecked")
    private void renewLightFilter(String className, String typeLight, String checkBoxName) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from " + className).executeUpdate();
        List<String> list;
if(typeLight.equals("all"))  list = session.createQuery("select M." + checkBoxName + " from LightOffice M").list();
else  list = session.createQuery("select M." + checkBoxName + " from LightOffice M where type='"+typeLight+"'").list();

               
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toLowerCase());
        }
        
        Set<String> set = new HashSet<String>();
        for(String val : list) {
            set.add(val);
        }
        
        if(className.equals(LightOfficePower.class.getSimpleName())) {
            for (String s : set) {
                session.save(getLightOfficePower((Integer.parseInt(s)) , Collections.frequency(list, s)));
            }
        } else if(className.equals(LightOfficeSize.class.getSimpleName())) {
            for (String s : set) {
                session.save(getLightOfficeSize(s, Collections.frequency(list, s)));
            }
        }
        else if(className.equals(LightOfficeType.class.getSimpleName())){
            for (String s : set) {
                session.save(getLightOfficeType(s, Collections.frequency(list, s)));
            }
        }
        
        
  
    }

  
    
    private LightOfficePower getLightOfficePower(int val, int num) {
        LightOfficePower lightOfficePower = new LightOfficePower();
        lightOfficePower.setPower(val);
        lightOfficePower.setNum(num);
        return lightOfficePower;
    }
    
    private LightOfficeSize getLightOfficeSize(String val, int num) {
        LightOfficeSize lightOfficePower = new LightOfficeSize();
        lightOfficePower.setSize(val);
        lightOfficePower.setNum(num);
        return lightOfficePower;
    }
    private LightOfficeType getLightOfficeType(String val, int num) {
        LightOfficeType lightOfficeType = new LightOfficeType();
        lightOfficeType.setType(val);
        lightOfficeType.setNum(num);
        return lightOfficeType;
    }

 
    
      
    
    
    
    
}
