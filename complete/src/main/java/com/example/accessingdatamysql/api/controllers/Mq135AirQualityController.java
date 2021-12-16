package com.example.accessingdatamysql.api.controllers;

import com.example.accessingdatamysql.dataAccess.abstracts.MqDao;
import com.example.accessingdatamysql.entity.concrate.sensor.Mq135;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/api/mq") // This means URL's start with /demo (after Application path)
@Repository
public class Mq135AirQualityController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private MqDao _mqDao;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String airQ) {

        Mq135 hcsr04 = new Mq135();
        hcsr04.setAirQualityValue(airQ);
        _mqDao.save(hcsr04);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Mq135> getAllDhtData() {
        // This returns a JSON or XML with the users
        return _mqDao.findAll();
    }
}
