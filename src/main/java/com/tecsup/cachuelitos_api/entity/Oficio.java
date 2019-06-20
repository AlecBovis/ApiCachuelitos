package com.tecsup.cachuelitos_api.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "oficios")
public class Oficio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idoficios")
    private Integer idOficio;

    @Column(name = "tra_nombre")
    private String nombreOficio;
    
    

    public Oficio(String nombreOficio) {
		super();
		this.nombreOficio = nombreOficio;
	}

	public Oficio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdOficio() {
        return idOficio;
    }

    public void setIdOficio(Integer idOficio) {
        this.idOficio = idOficio;
    }

    public String getNombreOficio() {
        return nombreOficio;
    }

    public void setNombreOficio(String nombreOficio) {
        this.nombreOficio = nombreOficio;
    }

    @Override
    public String toString() {
        return "Oficio{" +
                "idOficio=" + idOficio +
                ", nombreOficio='" + nombreOficio + '\'' +
                '}';
    }
}
