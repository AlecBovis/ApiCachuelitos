package com.tecsup.cachuelitos_api.service;

import com.tecsup.cachuelitos_api.entity.Oferta;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IOfertaService {

    List<Oferta> findAll();

    Oferta findById(Integer id);

    void save(Oferta oferta);

    void delete(Oferta oferta);

}
