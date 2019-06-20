package com.tecsup.cachuelitos_api.controller;

import com.tecsup.cachuelitos_api.entity.Distrito;
import com.tecsup.cachuelitos_api.service.IDistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class DistritoController {

    @Autowired
    @Qualifier(value = "distritoService")
    private IDistritoService iDistritoService;

    @GetMapping(value = {"/distritos"})
    List<Distrito> showAll() {
        return this.iDistritoService.findAll();
    }

    @GetMapping(value = {"/distrito/{id}"})
    Distrito showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iDistritoService.findById(id);
    }

    @PostMapping(value = {"/distrito"})
    @ResponseStatus(HttpStatus.CREATED)
    Distrito create(@RequestBody Distrito distrito) {
        this.iDistritoService.save(distrito);
        return distrito;
    }

    @PutMapping(value = {"/distrito/{id}"})
    @ResponseStatus(HttpStatus.OK)
    Distrito update(@RequestBody Distrito distrito, @PathVariable(value = "id") Integer id) {
        Distrito currentDistrito = this.iDistritoService.findById(id);
        currentDistrito.setNombreDistrito(distrito.getNombreDistrito());
        this.iDistritoService.save(currentDistrito);
        return currentDistrito;
    }

    @DeleteMapping(value = {"/distrito/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Distrito currentDistrito = this.iDistritoService.findById(id);
        this.iDistritoService.delete(currentDistrito);
    }

}
