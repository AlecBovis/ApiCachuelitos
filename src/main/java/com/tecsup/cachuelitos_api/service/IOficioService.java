package com.tecsup.cachuelitos_api.service;

import com.tecsup.cachuelitos_api.entity.Oficio;

import java.util.List;

public interface IOficioService {

    List<Oficio> findAll();

    Oficio findById(Integer id);

    void save(Oficio oficio);

    void delete(Oficio oficio);
}
