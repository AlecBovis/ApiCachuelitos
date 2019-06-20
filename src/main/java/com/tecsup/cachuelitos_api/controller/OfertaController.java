package com.tecsup.cachuelitos_api.controller;

import com.tecsup.cachuelitos_api.entity.Oferta;
import com.tecsup.cachuelitos_api.service.IOfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class OfertaController {

    @Autowired
    @Qualifier(value = "ofertaService")
    private IOfertaService iOfertaService;

    @GetMapping(value = {"/ofertas"})
    List<Oferta> showAll() {
        return this.iOfertaService.findAll();
    }

    @GetMapping(value = {"/oferta/{id}"})
    Oferta showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iOfertaService.findById(id);
    }

    @PostMapping(value = {"/oferta"})
    @ResponseStatus(HttpStatus.CREATED)
    Oferta create(@RequestBody Oferta oferta) {
        this.iOfertaService.save(oferta);
        return oferta;
    }

    @PutMapping(value = {"/oferta/{id}"})
    Oferta update(@RequestBody Oferta oferta, @PathVariable(value = "id") Integer id) {
        Oferta currentOferta = this.iOfertaService.findById(id);
        currentOferta.setCotizarOferta(oferta.getCotizarOferta());
        currentOferta.setDetalleOferta(oferta.getDetalleOferta());
        currentOferta.setEstadoOferta(oferta.getEstadoOferta());
        this.iOfertaService.save(currentOferta);
        return currentOferta;
    }

    @DeleteMapping(value = {"/oferta/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Oferta currentOferta = this.iOfertaService.findById(id);
        this.iOfertaService.delete(currentOferta);
    }
}
