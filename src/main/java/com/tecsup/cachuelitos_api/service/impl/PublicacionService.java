package com.tecsup.cachuelitos_api.service.impl;

import com.tecsup.cachuelitos_api.entity.Publicacion;
import com.tecsup.cachuelitos_api.repository.PublicacionRepository;
import com.tecsup.cachuelitos_api.service.IPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "publicacionService")
public class PublicacionService implements IPublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Publicacion> findAll() {
        return this.publicacionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Publicacion findById(Integer id) {
        return this.publicacionRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Publicacion publicacion) {
        this.publicacionRepository.save(publicacion);
    }

    @Override
    @Transactional
    public void delete(Publicacion publicacion) {
        this.publicacionRepository.delete(publicacion);
    }
}
