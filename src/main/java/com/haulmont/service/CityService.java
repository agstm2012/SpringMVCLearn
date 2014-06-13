package com.haulmont.service;

import com.haulmont.dao.CityDao;
import com.haulmont.domain.City;
import com.vf.restaurants.DoctorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Иван on 07.06.2014.
 */
@Component
public interface CityService {
    public boolean saveCity(City city);
    public List<City> getCities();
}
