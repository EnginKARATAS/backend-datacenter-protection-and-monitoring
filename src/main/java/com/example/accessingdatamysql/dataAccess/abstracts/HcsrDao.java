package com.example.accessingdatamysql.dataAccess.abstracts;

import com.example.accessingdatamysql.entity.concrate.sensor.Dht11;
import com.example.accessingdatamysql.entity.concrate.sensor.Hcsr04;
import org.springframework.data.repository.CrudRepository;

public interface HcsrDao extends CrudRepository<Hcsr04, Integer> {

}