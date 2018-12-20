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
@Table(name = "fefor_forpag")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FeforForpag.findAll", query = "SELECT f FROM FeforForpag f")
    , @NamedQuery(name = "FeforForpag.findByFeforCodigo", query = "SELECT f FROM FeforForpag f WHERE f.feforCodigo = :feforCodigo")
    , @NamedQuery(name = "FeforForpag.findByFeforDesc", query = "SELECT f FROM FeforForpag f WHERE f.feforDesc = :feforDesc")
    , @NamedQuery(name = "FeforForpag.findByEstadoFormapago", query = "SELECT f FROM FeforForpag f WHERE f.estadoFormapago = :estadoFormapago")})
public class FeforForpag implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FEFOR_CODIGO")
    private String feforCodigo;
    @Basic(optional = false)
    @Column(name = "FEFOR_DESC")
    private String feforDesc;
    @Basic(optional = false)
    @Column(name = "ESTADO_FORMAPAGO")
    private int estadoFormapago;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "feforCodigo")
    private Collection<FecabCabec> fecabCabecCollection;

    public FeforForpag() {
    }

    public FeforForpag(String feforCodigo) {
        this.feforCodigo = feforCodigo;
    }

    public FeforForpag(String feforCodigo, String feforDesc, int estadoFormapago) {
        this.feforCodigo = feforCodigo;
        this.feforDesc = feforDesc;
        this.estadoFormapago = estadoFormapago;
    }

    public String getFeforCodigo() {
        return feforCodigo;
    }

    public void setFeforCodigo(String feforCodigo) {
        this.feforCodigo = feforCodigo;
    }

    public String getFeforDesc() {
        return feforDesc;
    }

    public void setFeforDesc(String feforDesc) {
        this.feforDesc = feforDesc;
    }

    public int getEstadoFormapago() {
        return estadoFormapago;
    }

    public void setEstadoFormapago(int estadoFormapago) {
        this.estadoFormapago = estadoFormapago;
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
        hash += (feforCodigo != null ? feforCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeforForpag)) {
            return false;
        }
        FeforForpag other = (FeforForpag) object;
        if ((this.feforCodigo == null && other.feforCodigo != null) || (this.feforCodigo != null && !this.feforCodigo.equals(other.feforCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.FeforForpag[ feforCodigo=" + feforCodigo + " ]";
    }
    
}
