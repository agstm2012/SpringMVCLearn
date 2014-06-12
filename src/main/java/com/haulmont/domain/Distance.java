package com.haulmont.domain;


import javax.persistence.*;

/**
 * Created by Иван on 07.06.2014.
 */
@Entity
@Table(name = "distance")
public class Distance {
    @Id
    @Column(name="id")
    @GeneratedValue
    public Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_city_id")
    public City fromCity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_city_id")
    public City toCity;
    @Column(name = "distance")
    public Long distance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(City fromCity) {
        this.fromCity = fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(City toCity) {
        this.toCity = toCity;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }
}
