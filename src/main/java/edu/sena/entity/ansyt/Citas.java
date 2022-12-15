/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sena.entity.ansyt;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author anderson
 */
@Entity
@Table(name = "Citas")
@NamedQueries({
    @NamedQuery(name = "Citas.findAll", query = "SELECT c FROM Citas c")})
public class Citas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_cita")
    private Integer iDcita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "Cliente", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false)
    private Usuarios cliente;
    @JoinColumn(name = "Plan", referencedColumnName = "Id_Plan")
    @ManyToOne(optional = false)
    private Planes plan;
    @JoinColumn(name = "Estado", referencedColumnName = "ID_est")
    @ManyToOne(optional = false)
    private Estados estado;

    public Citas() {
    }

    public Citas(Integer iDcita) {
        this.iDcita = iDcita;
    }

    public Citas(Integer iDcita, Date fecha) {
        this.iDcita = iDcita;
        this.fecha = fecha;
    }

    public Integer getIDcita() {
        return iDcita;
    }

    public void setIDcita(Integer iDcita) {
        this.iDcita = iDcita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuarios getCliente() {
        return cliente;
    }

    public void setCliente(Usuarios cliente) {
        this.cliente = cliente;
    }

    public Planes getPlan() {
        return plan;
    }

    public void setPlan(Planes plan) {
        this.plan = plan;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDcita != null ? iDcita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citas)) {
            return false;
        }
        Citas other = (Citas) object;
        if ((this.iDcita == null && other.iDcita != null) || (this.iDcita != null && !this.iDcita.equals(other.iDcita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.entity.ansyt.Citas[ iDcita=" + iDcita + " ]";
    }
    
}
