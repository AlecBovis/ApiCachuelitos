package com.tecsup.cachuelitos_api.service.impl;

import com.tecsup.cachuelitos_api.entity.Distrito;
import com.tecsup.cachuelitos_api.repository.DistritoRepository;
import com.tecsup.cachuelitos_api.service.IDistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "distritoService")
public class DistritoService implements IDistritoService {

    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> findAll() {
        return this.distritoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Distrito findById(Integer id) {
        return this.distritoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Distrito distrito) {
        this.distritoRepository.save(distrito);
    }

    @Override
    @Transactional
    public void delete(Distrito distrito) {
        this.distritoRepository.delete(distrito);
    }
}
