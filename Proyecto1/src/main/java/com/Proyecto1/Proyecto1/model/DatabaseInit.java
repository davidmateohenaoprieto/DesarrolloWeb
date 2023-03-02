package com.Proyecto1.Proyecto1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

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

        Conductor conductor=new Conductor("Miguel","1001355730","3004567865","cra 9 #57-18");
        Conductor conductor1=new Conductor("Carlos","1010243712","3228745012","cra 54 #1-181");
        Conductor conductor2=new Conductor("Santiago","1001476439","3445764554","cra 76 #7-13");
        conductorRepository.save(conductor);
        conductorRepository.save(conductor1);
        conductorRepository.save(conductor2);


        asignacionBusRepository.save(new asignacionBuses("Miguel", "JCY612", "9-12",conductor));
        asignacionBusRepository.save(new asignacionBuses("Miguel", "BXN123", "9-23",conductor));
        asignacionBusRepository.save(new asignacionBuses("Carlos", "HBB007", "13-31",conductor1));
        asignacionBusRepository.save(new asignacionBuses("Santiago", "LMQ100", "15-23",conductor2));

        conductor.addList_bus(new asignacionBuses("Miguel", "JCY612", "9-12",conductor));
        conductor.addList_bus(new asignacionBuses("Miguel", "BXN123", "9-23",conductor));
        conductor1.addList_bus(new asignacionBuses("Carlos", "HBB007", "13-31",conductor1));
        conductor2.addList_bus(new asignacionBuses("Santiago", "LMQ100", "15-23",conductor2));


    }

}
