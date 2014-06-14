package com.haulmont.controller;

import com.haulmont.domain.City;
import com.haulmont.helper.CreateCityHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Иван on 07.06.2014.
 */
@Controller
public class CityController {
    @Autowired
    private CreateCityHelper createCityHelper;

    @RequestMapping(value = "/createCity", method = RequestMethod.POST)
    public String createCity(City city) {
        createCityHelper.addCity(city);
        return "city-worker";
    }

    @RequestMapping(value = "/newCity", method = RequestMethod.GET)
    public ModelAndView neewCity() {
        return new ModelAndView("city-worker");
    }
}
