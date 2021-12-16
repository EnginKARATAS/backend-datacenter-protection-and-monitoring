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
@Table(name = "dht11")
public class Dht11 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(length=5)
    private String heat;

    @NotNull
    @Column(length=5)
    private String humidity;

    @NotNull
    private Date date;

    @ManyToOne
    @JoinColumn(name="device_id", nullable=false)
    private Device device;

    private Dht11(String heat, String humidity){
        this.heat = heat;
        this.humidity = humidity;
    }

}
