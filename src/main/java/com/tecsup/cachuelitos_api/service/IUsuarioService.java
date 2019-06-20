package com.tecsup.cachuelitos_api.service;

import com.tecsup.cachuelitos_api.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    List<Usuario> findAll();

    Usuario findById(Integer id);

    void save(Usuario usuario);

    void delete(Usuario usuario);
}
