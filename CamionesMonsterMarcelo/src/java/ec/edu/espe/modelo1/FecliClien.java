/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo1;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "fecli_clien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FecliClien.findAll", query = "SELECT f FROM FecliClien f")
    , @NamedQuery(name = "FecliClien.findByFecliCodigo", query = "SELECT f FROM FecliClien f WHERE f.fecliCodigo = :fecliCodigo")
    , @NamedQuery(name = "FecliClien.findByFecliRazsoc", query = "SELECT f FROM FecliClien f WHERE f.fecliRazsoc = :fecliRazsoc")
    , @NamedQuery(name = "FecliClien.findByFecliCedula", query = "SELECT f FROM FecliClien f WHERE f.fecliCedula = :fecliCedula")
    , @NamedQuery(name = "FecliClien.findByFecliRuc", query = "SELECT f FROM FecliClien f WHERE f.fecliRuc = :fecliRuc")
    , @NamedQuery(name = "FecliClien.findByFecliTelef", query = "SELECT f FROM FecliClien f WHERE f.fecliTelef = :fecliTelef")
    , @NamedQuery(name = "FecliClien.findByFecliDirec", query = "SELECT f FROM FecliClien f WHERE f.fecliDirec = :fecliDirec")
    , @NamedQuery(name = "FecliClien.findByFecliEstado", query = "SELECT f FROM FecliClien f WHERE f.fecliEstado = :fecliEstado")})
public class FecliClien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FECLI_CODIGO")
    private String fecliCodigo;
    @Basic(optional = false)
    @Column(name = "FECLI_RAZSOC")
    private String fecliRazsoc;
    @Column(name = "FECLI_CEDULA")
    private String fecliCedula;
    @Column(name = "FECLI_RUC")
    private String fecliRuc;
    @Basic(optional = false)
    @Column(name = "FECLI_TELEF")
    private String fecliTelef;
    @Basic(optional = false)
    @Column(name = "FECLI_DIREC")
    private String fecliDirec;
    @Basic(optional = false)
    @Column(name = "FECLI_ESTADO")
    private int fecliEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fecliCodigo")
    private Collection<FecabCabec> fecabCabecCollection;

    public FecliClien() {
    }

    public FecliClien(String fecliCodigo) {
        this.fecliCodigo = fecliCodigo;
    }

    public FecliClien(String fecliCodigo, String fecliRazsoc, String fecliTelef, String fecliDirec, int fecliEstado) {
        this.fecliCodigo = fecliCodigo;
        this.fecliRazsoc = fecliRazsoc;
        this.fecliTelef = fecliTelef;
        this.fecliDirec = fecliDirec;
        this.fecliEstado = fecliEstado;
    }

    public String getFecliCodigo() {
        return fecliCodigo;
    }

    public void setFecliCodigo(String fecliCodigo) {
        this.fecliCodigo = fecliCodigo;
    }

    public String getFecliRazsoc() {
        return fecliRazsoc;
    }

    public void setFecliRazsoc(String fecliRazsoc) {
        this.fecliRazsoc = fecliRazsoc;
    }

    public String getFecliCedula() {
        return fecliCedula;
    }

    public void setFecliCedula(String fecliCedula) {
        this.fecliCedula = fecliCedula;
    }

    public String getFecliRuc() {
        return fecliRuc;
    }

    public void setFecliRuc(String fecliRuc) {
        this.fecliRuc = fecliRuc;
    }

    public String getFecliTelef() {
        return fecliTelef;
    }

    public void setFecliTelef(String fecliTelef) {
        this.fecliTelef = fecliTelef;
    }

    public String getFecliDirec() {
        return fecliDirec;
    }

    public void setFecliDirec(String fecliDirec) {
        this.fecliDirec = fecliDirec;
    }

    public int getFecliEstado() {
        return fecliEstado;
    }

    public void setFecliEstado(int fecliEstado) {
        this.fecliEstado = fecliEstado;
    }

    @XmlTransient
    public Collection<FecabCabec> getFecabCabecCollection() {
        return fecabCabecCollection;
    }

    public void setFecabCabecCollection(Collection<FecabCabec> fecabCabecCollection) {
        this.fecabCabecCollection = fecabCabecCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fecliCodigo != null ? fecliCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FecliClien)) {
            return false;
        }
        FecliClien other = (FecliClien) object;
        if ((this.fecliCodigo == null && other.fecliCodigo != null) || (this.fecliCodigo != null && !this.fecliCodigo.equals(other.fecliCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.FecliClien[ fecliCodigo=" + fecliCodigo + " ]";
    }
    
}
