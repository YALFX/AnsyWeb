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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author anderson
 */
@Entity
@Table(name = "Comprobantes")
@NamedQueries({
    @NamedQuery(name = "Comprobantes.findAll", query = "SELECT c FROM Comprobantes c")})
public class Comprobantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Comprobante")
    private Integer iDComprobante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaPago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Lob
    @Column(name = "Comprobante")
    private byte[] comprobante;
    @Size(max = 300)
    @Column(name = "nombreArchivo")
    private String nombreArchivo;
    @JoinColumn(name = "Cliente", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false)
    private Usuarios cliente;
    @JoinColumn(name = "Plan", referencedColumnName = "Id_Plan")
    @ManyToOne(optional = false)
    private Planes plan;
    @JoinColumn(name = "Estado", referencedColumnName = "ID_est")
    @ManyToOne(optional = false)
    private Estados estado;

    public Comprobantes() {
    }

    public Comprobantes(Integer iDComprobante) {
        this.iDComprobante = iDComprobante;
    }

    public Comprobantes(Integer iDComprobante, Date fechaPago) {
        this.iDComprobante = iDComprobante;
        this.fechaPago = fechaPago;
    }

    public Integer getIDComprobante() {
        return iDComprobante;
    }

    public void setIDComprobante(Integer iDComprobante) {
        this.iDComprobante = iDComprobante;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public byte[] getComprobante() {
        return comprobante;
    }

    public void setComprobante(byte[] comprobante) {
        this.comprobante = comprobante;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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
        hash += (iDComprobante != null ? iDComprobante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comprobantes)) {
            return false;
        }
        Comprobantes other = (Comprobantes) object;
        if ((this.iDComprobante == null && other.iDComprobante != null) || (this.iDComprobante != null && !this.iDComprobante.equals(other.iDComprobante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.entity.ansyt.Comprobantes[ iDComprobante=" + iDComprobante + " ]";
    }
    
}
