package com.tecsup.cachuelitos_api.service;

import com.tecsup.cachuelitos_api.entity.Distrito;

import java.util.List;

public interface IDistritoService {

    List<Distrito> findAll();

    Distrito findById(Integer id);

    void save(Distrito distrito);

    void delete(Distrito distrito);

}
