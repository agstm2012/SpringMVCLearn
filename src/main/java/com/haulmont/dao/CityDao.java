package com.haulmont.dao;

import com.haulmont.domain.City;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Иван on 07.06.2014.
 */
public interface CityDao {
    public boolean persistCity(City city);
    public List<City> getCities();
}
