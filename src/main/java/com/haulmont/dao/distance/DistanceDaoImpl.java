package com.haulmont.dao.distance;

import com.haulmont.domain.Distance;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Иван on 10.06.2014.
 */
@Component
@Repository
public class DistanceDaoImpl implements DistanceDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean persistsDistance(Distance distance) {
        sessionFactory.getCurrentSession().save(distance);
        return true;
    }
}
