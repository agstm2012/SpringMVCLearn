package com.haulmont.dao;

import com.haulmont.domain.City;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Иван on 07.06.2014.
 */
@Component
@Repository
public class CityDaoImpl implements CityDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean persistCity(City city) {
        sessionFactory.getCurrentSession().save(city);
        return true;
    }
}
