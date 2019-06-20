package com.tecsup.cachuelitos_api.service.impl;

import com.tecsup.cachuelitos_api.entity.Oficio;
import com.tecsup.cachuelitos_api.repository.OficioRepository;
import com.tecsup.cachuelitos_api.service.IOficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "oficioService")
public class OficioService implements IOficioService {

    @Autowired
    private OficioRepository oficioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Oficio> findAll() {
        return this.oficioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Oficio findById(Integer id) {
        return this.oficioRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Oficio oficio) {
        this.oficioRepository.save(oficio);
    }

    @Override
    @Transactional
    public void delete(Oficio oficio) {
        this.oficioRepository.delete(oficio);
    }
}
