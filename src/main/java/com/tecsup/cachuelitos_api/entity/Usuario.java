package com.tecsup.cachuelitos_api.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuarios")
    private Integer idUsuario;

    @Column(name = "id_firebase")
    private String idFirebase;

    @Column(name = "usu_nombre")
    private String nombreUsuario;

    @Column(name = "usu_telefono")
    private String telefonoUsuario;

    @Column(name = "usu_email")
    private String emailUsuario;

    @Column(name = "usu_estado")
    private Boolean estadoUsuario;

    @Column(name = "usu_disponibilidad")
    private Boolean disponibilidadUsuario;

    @Column(name = "usu_descripcion")
    private String descripcionUsuario;

    @Column(name = "usu_horarios")
    private String horariosUsuario;

    @Column(name = "usu_foto")
    private String fotoUsuario;

    @ManyToOne
    @JoinColumn(name = "distritos_iddistritos")
    private Distrito distrito;

    @ManyToOne
    @JoinColumn(name = "oficios_idoficios1")
    private Oficio oficio1;

    @ManyToOne
    @JoinColumn(name = "oficios_idoficios2")
    private Oficio oficio2;

    @ManyToOne
    @JoinColumn(name = "oficios_idoficios3")
    private Oficio oficio3;


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdFirebase() {
        return idFirebase;
    }

    public void setIdFirebase(String idFirebase) {
        this.idFirebase = idFirebase;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Boolean getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(Boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Boolean getDisponibilidadUsuario() {
        return disponibilidadUsuario;
    }

    public void setDisponibilidadUsuario(Boolean disponibilidadUsuario) {
        this.disponibilidadUsuario = disponibilidadUsuario;
    }

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }

    public String getHorariosUsuario() {
        return horariosUsuario;
    }

    public void setHorariosUsuario(String horariosUsuario) {
        this.horariosUsuario = horariosUsuario;
    }

    public String getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(String fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public Oficio getOficio1() {
        return oficio1;
    }

    public void setOficio1(Oficio oficio1) {
        this.oficio1 = oficio1;
    }

    public Oficio getOficio2() {
        return oficio2;
    }

    public void setOficio2(Oficio oficio2) {
        this.oficio2 = oficio2;
    }

    public Oficio getOficio3() {
        return oficio3;
    }

    public void setOficio3(Oficio oficio3) {
        this.oficio3 = oficio3;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", idFirebase='" + idFirebase + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", telefonoUsuario='" + telefonoUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", estadoUsuario=" + estadoUsuario +
                ", disponibilidadUsuario=" + disponibilidadUsuario +
                ", descripcionUsuario='" + descripcionUsuario + '\'' +
                ", horariosUsuario='" + horariosUsuario + '\'' +
                ", fotoUsuario='" + fotoUsuario + '\'' +
                ", distrito=" + distrito +
                ", oficio1=" + oficio1 +
                ", oficio2=" + oficio2 +
                ", oficio3=" + oficio3 +
                '}';
    }
}
