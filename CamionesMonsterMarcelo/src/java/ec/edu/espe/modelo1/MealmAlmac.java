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
@Table(name = "mealm_almac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MealmAlmac.findAll", query = "SELECT m FROM MealmAlmac m")
    , @NamedQuery(name = "MealmAlmac.findByMealmCodigo", query = "SELECT m FROM MealmAlmac m WHERE m.mealmCodigo = :mealmCodigo")
    , @NamedQuery(name = "MealmAlmac.findByMealmTelef", query = "SELECT m FROM MealmAlmac m WHERE m.mealmTelef = :mealmTelef")
    , @NamedQuery(name = "MealmAlmac.findByMealmEstado", query = "SELECT m FROM MealmAlmac m WHERE m.mealmEstado = :mealmEstado")
    , @NamedQuery(name = "MealmAlmac.findByMealmDirec", query = "SELECT m FROM MealmAlmac m WHERE m.mealmDirec = :mealmDirec")})
public class MealmAlmac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MEALM_CODIGO")
    private String mealmCodigo;
    @Basic(optional = false)
    @Column(name = "MEALM_TELEF")
    private String mealmTelef;
    @Basic(optional = false)
    @Column(name = "MEALM_ESTADO")
    private int mealmEstado;
    @Column(name = "MEALM_DIREC")
    private String mealmDirec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mealmCodigo")
    private Collection<MepedPedido> mepedPedidoCollection;

    public MealmAlmac() {
    }

    public MealmAlmac(String mealmCodigo) {
        this.mealmCodigo = mealmCodigo;
    }

    public MealmAlmac(String mealmCodigo, String mealmTelef, int mealmEstado) {
        this.mealmCodigo = mealmCodigo;
        this.mealmTelef = mealmTelef;
        this.mealmEstado = mealmEstado;
    }

    public String getMealmCodigo() {
        return mealmCodigo;
    }

    public void setMealmCodigo(String mealmCodigo) {
        this.mealmCodigo = mealmCodigo;
    }

    public String getMealmTelef() {
        return mealmTelef;
    }

    public void setMealmTelef(String mealmTelef) {
        this.mealmTelef = mealmTelef;
    }

    public int getMealmEstado() {
        return mealmEstado;
    }

    public void setMealmEstado(int mealmEstado) {
        this.mealmEstado = mealmEstado;
    }

    public String getMealmDirec() {
        return mealmDirec;
    }

    public void setMealmDirec(String mealmDirec) {
        this.mealmDirec = mealmDirec;
    }

    @XmlTransient
    public Collection<MepedPedido> getMepedPedidoCollection() {
        return mepedPedidoCollection;
    }

    public void setMepedPedidoCollection(Collection<MepedPedido> mepedPedidoCollection) {
        this.mepedPedidoCollection = mepedPedidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mealmCodigo != null ? mealmCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MealmAlmac)) {
            return false;
        }
        MealmAlmac other = (MealmAlmac) object;
        if ((this.mealmCodigo == null && other.mealmCodigo != null) || (this.mealmCodigo != null && !this.mealmCodigo.equals(other.mealmCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.MealmAlmac[ mealmCodigo=" + mealmCodigo + " ]";
    }
    
}
