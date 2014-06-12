package com.haulmont.domain;

import javax.persistence.*;

/**
 * Created by Иван on 07.06.2014.
 */
@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name="id")
    @GeneratedValue
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="latitude")
    private Long latitude;
    @Column(name="longitude")
    private Long longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
}
