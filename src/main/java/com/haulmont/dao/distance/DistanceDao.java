package com.haulmont.dao.distance;

import com.haulmont.domain.Distance;

/**
 * Created by Иван on 10.06.2014.
 */
public interface DistanceDao {
    public boolean persistsDistance(Distance distance);
}
