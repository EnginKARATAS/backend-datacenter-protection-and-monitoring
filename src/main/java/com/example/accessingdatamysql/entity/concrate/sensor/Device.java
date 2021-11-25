package com.example.accessingdatamysql.entity.concrate.sensor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@JsonIgnoreProperties
public class Device {
    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Column(length = 48)
    private String mac_adres;

    @OneToMany(mappedBy="device")
    private Set<Dht11> items;

    @OneToMany(mappedBy="device")
    private Set<Hcsr04> hcsr04s;

    String getName(){
        return this.name;
    }
    String getMacAdres(){
        return this.mac_adres;
    }
    Long getId(){
        return this.id;
    }

    public Device(Long id, String name, String mac_adres) {
        this.id = id;
        this.name = name;
        this.mac_adres = mac_adres;
    }
}
