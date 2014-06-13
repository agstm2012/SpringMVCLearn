package com.haulmont.validation;

import com.haulmont.domain.Distance;
import org.springframework.stereotype.Component;

/**
 * Created by Иван on 12.06.2014.
 */
@Component
public class DistanceValidation {
    public boolean validated(Distance distance) {
        return true;
    }
}
