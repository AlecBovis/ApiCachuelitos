package com.tecsup.cachuelitos_api.service;

import com.tecsup.cachuelitos_api.entity.Publicacion;

import java.util.List;

public interface IPublicacionService {

    List<Publicacion> findAll();

    Publicacion findById(Integer id);

    void save(Publicacion publicacion);

    void delete(Publicacion publicacion);

}
