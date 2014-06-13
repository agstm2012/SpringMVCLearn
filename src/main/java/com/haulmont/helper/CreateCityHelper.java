package com.haulmont.helper;

import com.haulmont.dao.CityDao;
import com.haulmont.domain.City;
import com.haulmont.service.CityService;
import com.haulmont.validation.CityValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Иван on 07.06.2014.
 */
@Component
public class CreateCityHelper {
    @Autowired
    private CityValidation cityValidation;
    @Autowired
    private CityService cityService;

    public boolean addCity(City city) {
        return cityService.saveCity(city);
    }

    public List<City> getCities() { return cityService.getCities(); }
}
