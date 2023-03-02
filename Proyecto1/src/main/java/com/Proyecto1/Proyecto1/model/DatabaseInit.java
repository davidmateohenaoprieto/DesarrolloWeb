package com.Proyecto1.Proyecto1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit implements ApplicationRunner{

    @Autowired
    ConductorRepository conductorRepository;

    @Autowired
    asignacionBusesRepository asignacionBusRepository;
    //Y resto de repositorios a los que se les considere crear una tabla

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Solo se ejecuta una vez al inicio de la app
        //Aqui se colocara el codigo de inicializacion de la base de datos
        asignacionBusRepository.save(new asignacionBuses("Miguel", "JCY612", "9-12"));
        asignacionBusRepository.save(new asignacionBuses("Paco", "BZN132", "11-25"));



    }

}