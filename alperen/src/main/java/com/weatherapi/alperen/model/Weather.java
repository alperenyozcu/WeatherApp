package com.weatherapi.alperen.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Weather")
@Getter
@Setter
public class Weather implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "DESCRİPTİON", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @Column(name = "CİTY", nullable = false)
    private String city ;

    @Column(name = "TEMPERATURE",nullable = false)
    private int temperature;


}
