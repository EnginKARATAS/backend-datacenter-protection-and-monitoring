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
@Table(name="Hcsr04AwakeLog")
public class Hcsr04 {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    private Date triggeredDate;

    @ManyToOne
    @JoinColumn(name="device_id", nullable=false)
    private Device device;

    Hcsr04(Long id, Date triggeredDate){
        this.triggeredDate=triggeredDate;
        this.id = id;
    }

}