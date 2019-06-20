package com.tecsup.cachuelitos_api.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "distritos")
public class Distrito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddistritos")
    private Integer idDistrito;

    @Column(name = "dis_nombre")
    private String nombreDistrito;

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    @Override
    public String toString() {
        return "Distrito{" +
                "idDistrito=" + idDistrito +
                ", nombreDistrito='" + nombreDistrito + '\'' +
                '}';
    }
}
