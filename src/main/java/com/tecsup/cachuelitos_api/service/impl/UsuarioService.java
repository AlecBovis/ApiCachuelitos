package com.tecsup.cachuelitos_api.service.impl;

import com.tecsup.cachuelitos_api.entity.Usuario;
import com.tecsup.cachuelitos_api.repository.UsuarioRepository;
import com.tecsup.cachuelitos_api.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "usuarioService")
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Integer id) {
        return this.usuarioRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        this.usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        this.usuarioRepository.delete(usuario);
    }
}
