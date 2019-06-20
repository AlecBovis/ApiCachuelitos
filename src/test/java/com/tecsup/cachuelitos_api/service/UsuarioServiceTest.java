package com.tecsup.cachuelitos_api.service;


import com.tecsup.cachuelitos_api.entity.Usuario;
import com.tecsup.cachuelitos_api.service.impl.UsuarioService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UsuarioServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioServiceTest.class);

    @Autowired
    private UsuarioService usuarioService;

    @Test
    public void testFindUsuarioById() {

        Integer ID = 1;
        String NAME = "marcos";
        Usuario usuario = null;

        usuario = usuarioService.findById(ID);

        logger.info("" + usuario);

        assertEquals(NAME, usuario.getNombreUsuario());

    }
}