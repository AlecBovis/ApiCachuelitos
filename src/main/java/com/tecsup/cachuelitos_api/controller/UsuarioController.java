package com.tecsup.cachuelitos_api.controller;

import com.tecsup.cachuelitos_api.entity.Usuario;
import com.tecsup.cachuelitos_api.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class UsuarioController {

    @Autowired
    @Qualifier(value = "usuarioService")
    private IUsuarioService iUsuarioService;

    @GetMapping(value = {"/usuarios"})
    List<Usuario> showAll() {
        return this.iUsuarioService.findAll();
    }

    @GetMapping(value = {"/usuario/{id}"})
    Usuario showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iUsuarioService.findById(id);
    }

    @PostMapping(value = {"/usuario"})
    @ResponseStatus(HttpStatus.CREATED)
    Usuario create(@RequestBody Usuario usuario) {
        this.iUsuarioService.save(usuario);
        return usuario;
    }

    @PutMapping(value = {"/usuario/{id}"})
    Usuario update(@RequestBody Usuario usuario, @PathVariable(value = "id") Integer id) {
        Usuario currentUsuario = this.iUsuarioService.findById(id);
        currentUsuario.setNombreUsuario(usuario.getNombreUsuario());
        currentUsuario.setDescripcionUsuario(usuario.getDescripcionUsuario());
        currentUsuario.setDisponibilidadUsuario(usuario.getDisponibilidadUsuario());
        currentUsuario.setEstadoUsuario(usuario.getEstadoUsuario());
        currentUsuario.setHorariosUsuario(usuario.getHorariosUsuario());
        currentUsuario.setTelefonoUsuario(usuario.getTelefonoUsuario());
        currentUsuario.setDistrito(usuario.getDistrito());
        currentUsuario.setOficio1(usuario.getOficio1());
        currentUsuario.setOficio2(usuario.getOficio2());
        currentUsuario.setOficio3(usuario.getOficio3());
        this.iUsuarioService.save(currentUsuario);
        return currentUsuario;
    }

    @DeleteMapping(value = {"/usuario/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Usuario currentUsuario = this.iUsuarioService.findById(id);
        this.iUsuarioService.delete(currentUsuario);
    }

}
