package com.Proyecto1.Proyecto1.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HorarioFuncionamientoRepository extends CrudRepository<HorarioFuncionamiento,Integer>{
    
}
