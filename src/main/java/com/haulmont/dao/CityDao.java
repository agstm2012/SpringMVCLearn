package com.haulmont.dao;

import com.haulmont.domain.City;
import org.springframework.stereotype.Component;

/**
 * Created by Иван on 07.06.2014.
 */
public interface CityDao {
    public boolean persistCity(City city);
}
