package com.example.accessingdatamysql.dataAccess.abstracts;

import com.example.accessingdatamysql.entity.concrate.sensor.Dht11;

import org.springframework.data.repository.CrudRepository;

public interface DhtDao extends CrudRepository<Dht11, Integer> {

}
