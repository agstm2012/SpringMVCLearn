package com.haulmont.controller.distance;

import com.haulmont.domain.City;
import com.haulmont.domain.Distance;
import com.haulmont.helper.CreateCityHelper;
import com.haulmont.helper.CreateDistanceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Иван on 13.06.2014.
 */
@Controller
public class DistanceController {
    @Autowired
    private CreateDistanceHelper createDistanceHelper;
    @Autowired
    private CreateCityHelper createCityHelper;

    @RequestMapping(value = "/createDistance", method = RequestMethod.POST)
    public String createDistance(Distance distance){
        distance.setDistance(555l);
        createDistanceHelper.addDistance(distance);
        return "distance-worker";
    }

    @RequestMapping(value = "/newDistance", method = RequestMethod.GET)
    public ModelAndView createDistance(@ModelAttribute(value="distance") Distance distance, BindingResult result) {
        List<City> cityList = createCityHelper.getCities();
        Map<Long, String> cityOptionList =  new LinkedHashMap<Long, String>();
        for(City city : cityList) {
            cityOptionList.put(city.getId(), city.getName());
        }
        ModelAndView modelAndView = new ModelAndView("distance-worker");
        modelAndView.addObject("cityList", cityOptionList);
        modelAndView.addObject("distance", new Distance());
        return modelAndView;
    }
}
