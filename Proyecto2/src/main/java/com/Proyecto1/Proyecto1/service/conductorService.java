package com.Proyecto1.Proyecto1.service;

import com.Proyecto1.Proyecto1.model.ConductorRepository;
import java.util.List;
import com.Proyecto1.Proyecto1.model.Conductor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class conductorService {

    @Autowired
    private ConductorRepository conductorRepository;

    public List<Conductor> listarConductores(){
        return conductorRepository.findAll();
    }
    
}
