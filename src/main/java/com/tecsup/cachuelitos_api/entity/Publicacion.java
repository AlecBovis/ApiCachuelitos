package com.tecsup.cachuelitos_api.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "publicaciones")
public class Publicacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpublicaciones")
    private Integer idPublicacion;

    @Column(name = "pub_titulo")
    private String tituloPublicacion;

    @Column(name = "pub_descripcion")
    private String descripcionPublicacion;

    @Column(name = "pub_email")
    private String emailPublicacion;

    @Column(name = "pub_telefono")
    private String telefonoPublicacion;

    @Column(name = "pub_habilidades")
    private String habilidadesPublicacion;

    @Column(name = "pub_estado")
    private Boolean estadoPublicacion;

    @Column(name = "pub_disponibilidad")
    private  Boolean disponibilidadPublicacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pub_fecha")
    private Date fechaPublicacion;

    @Column(name = "pub_calificacion_emp")
    private Integer calificacionEmpleado;

    @Column(name = "pub_calificacion_clien")
    private Integer calificacionCliente;

    @ManyToOne
    @JoinColumn(name = "usuarios_idusuarios")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "distritos_iddistritos")
    private Distrito distrito;

    @ManyToOne
    @JoinColumn(name = "oficios_idoficios")
    private Oficio oficio;

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTituloPublicacion() {
        return tituloPublicacion;
    }

    public void setTituloPublicacion(String tituloPublicacion) {
        this.tituloPublicacion = tituloPublicacion;
    }

    public String getDescripcionPublicacion() {
        return descripcionPublicacion;
    }

    public void setDescripcionPublicacion(String descripcionPublicacion) {
        this.descripcionPublicacion = descripcionPublicacion;
    }

    public String getEmailPublicacion() {
        return emailPublicacion;
    }

    public void setEmailPublicacion(String emailPublicacion) {
        this.emailPublicacion = emailPublicacion;
    }

    public String getTelefonoPublicacion() {
        return telefonoPublicacion;
    }

    public void setTelefonoPublicacion(String telefonoPublicacion) {
        this.telefonoPublicacion = telefonoPublicacion;
    }

    public String getHabilidadesPublicacion() {
        return habilidadesPublicacion;
    }

    public void setHabilidadesPublicacion(String habilidadesPublicacion) {
        this.habilidadesPublicacion = habilidadesPublicacion;
    }

    public Boolean getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(Boolean estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }

    public Boolean getDisponibilidadPublicacion() {
        return disponibilidadPublicacion;
    }

    public void setDisponibilidadPublicacion(Boolean disponibilidadPublicacion) {
        this.disponibilidadPublicacion = disponibilidadPublicacion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getCalificacionEmpleado() {
        return calificacionEmpleado;
    }

    public void setCalificacionEmpleado(Integer calificacionEmpleado) {
        this.calificacionEmpleado = calificacionEmpleado;
    }

    public Integer getCalificacionCliente() {
        return calificacionCliente;
    }

    public void setCalificacionCliente(Integer calificacionCliente) {
        this.calificacionCliente = calificacionCliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public Oficio getOficio() {
        return oficio;
    }

    public void setOficio(Oficio oficio) {
        this.oficio = oficio;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "idPublicacion=" + idPublicacion +
                ", tituloPublicacion='" + tituloPublicacion + '\'' +
                ", descripcionPublicacion='" + descripcionPublicacion + '\'' +
                ", emailPublicacion='" + emailPublicacion + '\'' +
                ", telefonoPublicacion='" + telefonoPublicacion + '\'' +
                ", habilidadesPublicacion='" + habilidadesPublicacion + '\'' +
                ", estadoPublicacion=" + estadoPublicacion +
                ", disponibilidadPublicacion=" + disponibilidadPublicacion +
                ", fechaPublicacion=" + fechaPublicacion +
                ", calificacionEmpleado=" + calificacionEmpleado +
                ", calificacionCliente=" + calificacionCliente +
                ", usuario=" + usuario +
                ", distrito=" + distrito +
                ", oficio=" + oficio +
                '}';
    }
}
