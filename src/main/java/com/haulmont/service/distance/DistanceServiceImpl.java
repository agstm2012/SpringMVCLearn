package com.haulmont.service.distance;

import com.haulmont.dao.distance.DistanceDao;
import com.haulmont.domain.Distance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Иван on 12.06.2014.
 */
@Transactional
@Service
public class DistanceServiceImpl implements DistanceService {
    @Autowired
    private DistanceDao distanceDao;
    @Override
    public boolean saveDistance(Distance distance) {
        return distanceDao.persistsDistance(distance);
    }
}
