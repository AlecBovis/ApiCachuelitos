package com.tecsup.cachuelitos_api.controller;

import com.tecsup.cachuelitos_api.entity.Publicacion;
import com.tecsup.cachuelitos_api.service.IPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class PublicacionController {

    @Autowired
    @Qualifier(value = "publicacionService")
    private IPublicacionService iPublicacionService;

    @GetMapping(value = {"/publicaciones"})
    List<Publicacion> showAll() {
        return this.iPublicacionService.findAll();
    }

    @GetMapping(value = {"/publicacion/{id}"})
    Publicacion showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iPublicacionService.findById(id);
    }

    @PostMapping(value = {"/publicacion"})
    @ResponseStatus(HttpStatus.CREATED)
    Publicacion create(@RequestBody Publicacion publicacion) {
        this.iPublicacionService.save(publicacion);
        return publicacion;
    }

    @PutMapping(value = {"/publicacion/{id}"})
    Publicacion update(@RequestBody Publicacion publicacion, @PathVariable(value = "id") Integer id) {
        Publicacion currentPublicacion = this.iPublicacionService.findById(id);
        currentPublicacion.setCalificacionCliente(publicacion.getCalificacionCliente());
        currentPublicacion.setCalificacionEmpleado(publicacion.getCalificacionEmpleado());
        currentPublicacion.setDescripcionPublicacion(publicacion.getDescripcionPublicacion());
        currentPublicacion.setEstadoPublicacion(publicacion.getEstadoPublicacion());
        currentPublicacion.setHabilidadesPublicacion(publicacion.getHabilidadesPublicacion());
        currentPublicacion.setTelefonoPublicacion(publicacion.getTelefonoPublicacion());
        currentPublicacion.setTituloPublicacion(publicacion.getTituloPublicacion());
        currentPublicacion.setDistrito(publicacion.getDistrito());
        currentPublicacion.setOficio(publicacion.getOficio());
        currentPublicacion.setDisponibilidadPublicacion(publicacion.getDisponibilidadPublicacion());
        this.iPublicacionService.save(currentPublicacion);
        return currentPublicacion;
    }

    @DeleteMapping(value = {"/publicacion/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Publicacion currentPublicacion = this.iPublicacionService.findById(id);
        this.iPublicacionService.delete(currentPublicacion);
    }
}
