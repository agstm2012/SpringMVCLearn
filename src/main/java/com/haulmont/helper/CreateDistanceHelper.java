package com.haulmont.helper;

import com.haulmont.domain.Distance;
import com.haulmont.service.distance.DistanceService;
import com.haulmont.validation.DistanceValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Иван on 12.06.2014.
 */
@Component
public class CreateDistanceHelper {
    @Autowired
    private DistanceValidation distanceValidation;
    @Autowired
    private DistanceService distanceService;

    public boolean addDistance(Distance distance) {return distanceService.saveDistance(distance);}
}
