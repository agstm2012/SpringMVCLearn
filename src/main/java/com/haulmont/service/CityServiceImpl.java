package com.haulmont.service;

import com.haulmont.dao.CityDao;
import com.haulmont.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Иван on 07.06.2014.
 */
@Transactional
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    public boolean saveCity(City city) {
        return cityDao.persistCity(city);
    }
}
