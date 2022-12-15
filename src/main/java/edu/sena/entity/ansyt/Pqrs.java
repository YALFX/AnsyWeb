/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sena.entity.ansyt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author anderson
 */
@Entity
@Table(name = "pqrs")
@NamedQueries({
    @NamedQuery(name = "Pqrs.findAll", query = "SELECT p FROM Pqrs p")})
public class Pqrs implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "descripcion")
    private int descripcion;
    @Lob
    @Column(name = "archivo")
    private byte[] archivo;
    @JoinColumn(name = "pqr_Estado", referencedColumnName = "ID_est")
    @ManyToOne(optional = false)
    private Estados pqrEstado;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_pqrs")
    private Integer idpqrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "pqr_Tipo")
    private String pqrTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "pqr_Descripcion")
    private String pqrDescripcion;
    
    @JoinColumn(name = "Id_Cliente", referencedColumnName = "Id_Cliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Clientes idCliente;

    public Pqrs() {
    }

    public Pqrs(Integer idpqrs) {
        this.idpqrs = idpqrs;
    }

    public Pqrs(Integer idpqrs, String pqrTipo, String pqrDescripcion, Estados pqrEstado) {
        this.idpqrs = idpqrs;
        this.pqrTipo = pqrTipo;
        this.pqrDescripcion = pqrDescripcion;
        this.pqrEstado = pqrEstado;
    }

    public Integer getIdpqrs() {
        return idpqrs;
    }

    public void setIdpqrs(Integer idpqrs) {
        this.idpqrs = idpqrs;
    }

    public String getPqrTipo() {
        return pqrTipo;
    }

    public void setPqrTipo(String pqrTipo) {
        this.pqrTipo = pqrTipo;
    }

    public String getPqrDescripcion() {
        return pqrDescripcion;
    }

    public void setPqrDescripcion(String pqrDescripcion) {
        this.pqrDescripcion = pqrDescripcion;
    }



    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpqrs != null ? idpqrs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pqrs)) {
            return false;
        }
        Pqrs other = (Pqrs) object;
        if ((this.idpqrs == null && other.idpqrs != null) || (this.idpqrs != null && !this.idpqrs.equals(other.idpqrs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.entity.ansyt.Pqrs[ idpqrs=" + idpqrs + " ]";
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public Estados getPqrEstado() {
        return pqrEstado;
    }

    public void setPqrEstado(Estados pqrEstado) {
        this.pqrEstado = pqrEstado;
    }
    
}
