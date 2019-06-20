package com.tecsup.cachuelitos_api.service.impl;

import com.tecsup.cachuelitos_api.entity.Oferta;
import com.tecsup.cachuelitos_api.repository.OfertaRepository;
import com.tecsup.cachuelitos_api.service.IOfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "ofertaService")
public class OfertaService implements IOfertaService {

    @Autowired
    private OfertaRepository ofertaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Oferta> findAll() {
        return this.ofertaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Oferta findById(Integer id) {
        return this.ofertaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Oferta oferta) {
        this.ofertaRepository.save(oferta);
    }

    @Override
    @Transactional
    public void delete(Oferta oferta) {
        this.ofertaRepository.delete(oferta);
    }
}
