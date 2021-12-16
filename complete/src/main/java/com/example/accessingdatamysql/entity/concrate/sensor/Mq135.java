package com.example.accessingdatamysql.entity.concrate.sensor;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Mq135")
public class Mq135 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String airQualityValue;

    @NotNull
    private Date date;

    @ManyToOne
    @JoinColumn(name="device_id", nullable=false)
    private Device device;

    Mq135(Long id, String airQualityValue){
        this.airQualityValue = airQualityValue;
        this.id = id;
    }

}
