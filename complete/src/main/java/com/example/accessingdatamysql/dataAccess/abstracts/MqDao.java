package com.example.accessingdatamysql.dataAccess.abstracts;

import com.example.accessingdatamysql.entity.concrate.sensor.Mq135;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MqDao extends JpaRepository<Mq135, Integer> {
}
