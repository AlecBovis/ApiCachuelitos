package com.tecsup.cachuelitos_api.controller;


import com.tecsup.cachuelitos_api.entity.Oficio;
import com.tecsup.cachuelitos_api.service.IOficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class OficioController {

    @Autowired
    @Qualifier(value = "oficioService")
    private IOficioService iOficioService;

    @GetMapping(value = {"/oficios"})
    List<Oficio> showAll() {
        return this.iOficioService.findAll();
    }

    @GetMapping(value = {"/oficio/{id}"})
    Oficio showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iOficioService.findById(id);
    }

    @PostMapping(value = {"/oficio"})
    @ResponseStatus(HttpStatus.CREATED)
    Oficio create(@RequestBody Oficio oficio) {
        this.iOficioService.save(oficio);
        return oficio;
    }

    @PutMapping(value = {"/oficio/{id}"})
    @ResponseStatus(HttpStatus.OK)
    Oficio update(@RequestBody Oficio oficio, @PathVariable(value = "id") Integer id) {
        Oficio currentOficio = this.iOficioService.findById(id);
        currentOficio.setNombreOficio(oficio.getNombreOficio());
        this.iOficioService.save(currentOficio);
        return currentOficio;
    }

    @DeleteMapping(value = {"/oficio/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Oficio currentOficio = this.iOficioService.findById(id);
        this.iOficioService.delete(currentOficio);
    }

}
