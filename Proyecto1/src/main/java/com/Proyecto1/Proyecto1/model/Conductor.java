package com.Proyecto1.Proyecto1.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//import java.util.List;

@Entity
@Table(name="Driver")

public class Conductor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column (name="name",nullable=false)
    //@NotBlank(message="No puede estar en blanco")
    private String name;

    @Column (name="identification",nullable=false)
    //@NotBlank(message="No puede estar en blanco")
    private String identification;
    
    @Column (name="phoneNumber",nullable=false)
    //@NotBlank(message="No puede estar en blanco")
    private String phoneNumber;
    
    @Column (name="address",nullable=false)
    //@NotBlank(message="No puede estar en blanco")
    private String address;
    
/*pendiente en definir SI SE USA CONSTRUCTOIR Y SI SE FREA UNA COLUMNA*/
    @OneToMany(mappedBy = "conductor" )
    private List<asignacionBuses> list_bus=new ArrayList<>();

    public Conductor(){

    }


    public Conductor(String name, String identification, String phoneNumber, String address) {
        
        this.name = name;
        this.identification = identification;
        this.phoneNumber = phoneNumber;
        this.address = address;
    
    }

    public List<asignacionBuses> getList_bus() {
        return list_bus;
    }


    public void addList_bus(asignacionBuses e) {
        this.list_bus.add(e);
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getIdentification() {
        return identification;
    }


    public void setIdentification(String identification) {
        this.identification = identification;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

}
