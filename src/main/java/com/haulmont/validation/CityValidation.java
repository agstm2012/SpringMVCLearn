package com.haulmont.validation;

import com.haulmont.domain.City;
import org.springframework.stereotype.Component;

/**
 * Created by Иван on 07.06.2014.
 */
@Component
public class CityValidation {
    public boolean validated(City city) {
        return true;
    }
}
