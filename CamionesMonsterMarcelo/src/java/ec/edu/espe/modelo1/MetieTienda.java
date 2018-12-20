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
@Table(name = "metie_tienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MetieTienda.findAll", query = "SELECT m FROM MetieTienda m")
    , @NamedQuery(name = "MetieTienda.findByMetieCodigo", query = "SELECT m FROM MetieTienda m WHERE m.metieCodigo = :metieCodigo")
    , @NamedQuery(name = "MetieTienda.findByMetieNombre", query = "SELECT m FROM MetieTienda m WHERE m.metieNombre = :metieNombre")
    , @NamedQuery(name = "MetieTienda.findByMetieTelef", query = "SELECT m FROM MetieTienda m WHERE m.metieTelef = :metieTelef")
    , @NamedQuery(name = "MetieTienda.findByMetieEstado", query = "SELECT m FROM MetieTienda m WHERE m.metieEstado = :metieEstado")
    , @NamedQuery(name = "MetieTienda.findByMetieDirec", query = "SELECT m FROM MetieTienda m WHERE m.metieDirec = :metieDirec")})
public class MetieTienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "METIE_CODIGO")
    private String metieCodigo;
    @Basic(optional = false)
    @Column(name = "METIE_NOMBRE")
    private String metieNombre;
    @Basic(optional = false)
    @Column(name = "METIE_TELEF")
    private String metieTelef;
    @Basic(optional = false)
    @Column(name = "METIE_ESTADO")
    private int metieEstado;
    @Column(name = "METIE_DIREC")
    private String metieDirec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "metieCodigo")
    private Collection<MepedPedido> mepedPedidoCollection;

    public MetieTienda() {
    }

    public MetieTienda(String metieCodigo) {
        this.metieCodigo = metieCodigo;
    }

    public MetieTienda(String metieCodigo, String metieNombre, String metieTelef, int metieEstado) {
        this.metieCodigo = metieCodigo;
        this.metieNombre = metieNombre;
        this.metieTelef = metieTelef;
        this.metieEstado = metieEstado;
    }

    public String getMetieCodigo() {
        return metieCodigo;
    }

    public void setMetieCodigo(String metieCodigo) {
        this.metieCodigo = metieCodigo;
    }

    public String getMetieNombre() {
        return metieNombre;
    }

    public void setMetieNombre(String metieNombre) {
        this.metieNombre = metieNombre;
    }

    public String getMetieTelef() {
        return metieTelef;
    }

    public void setMetieTelef(String metieTelef) {
        this.metieTelef = metieTelef;
    }

    public int getMetieEstado() {
        return metieEstado;
    }

    public void setMetieEstado(int metieEstado) {
        this.metieEstado = metieEstado;
    }

    public String getMetieDirec() {
        return metieDirec;
    }

    public void setMetieDirec(String metieDirec) {
        this.metieDirec = metieDirec;
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
        hash += (metieCodigo != null ? metieCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MetieTienda)) {
            return false;
        }
        MetieTienda other = (MetieTienda) object;
        if ((this.metieCodigo == null && other.metieCodigo != null) || (this.metieCodigo != null && !this.metieCodigo.equals(other.metieCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.MetieTienda[ metieCodigo=" + metieCodigo + " ]";
    }
    
}
