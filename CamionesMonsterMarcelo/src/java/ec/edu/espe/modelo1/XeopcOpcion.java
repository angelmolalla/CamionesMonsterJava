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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "xeopc_opcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XeopcOpcion.findAll", query = "SELECT x FROM XeopcOpcion x")
    , @NamedQuery(name = "XeopcOpcion.findByXeopcCodigo", query = "SELECT x FROM XeopcOpcion x WHERE x.xeopcCodigo = :xeopcCodigo")
    , @NamedQuery(name = "XeopcOpcion.findByXeopcDesc", query = "SELECT x FROM XeopcOpcion x WHERE x.xeopcDesc = :xeopcDesc")})
public class XeopcOpcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XEOPC_CODIGO")
    private String xeopcCodigo;
    @Basic(optional = false)
    @Column(name = "XEOPC_DESC")
    private String xeopcDesc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xeopcCodigo")
    private Collection<XevenVentan> xevenVentanCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xeopcOpcion")
    private Collection<XeopeOpeper> xeopeOpeperCollection;
    @JoinColumn(name = "XESIS_CODIGO", referencedColumnName = "XESIS_CODIGO")
    @ManyToOne(optional = false)
    private XesisSistem xesisCodigo;

    public XeopcOpcion() {
    }

    public XeopcOpcion(String xeopcCodigo) {
        this.xeopcCodigo = xeopcCodigo;
    }

    public XeopcOpcion(String xeopcCodigo, String xeopcDesc, XesisSistem xesisCodigo) {
        this.xeopcCodigo = xeopcCodigo;
        this.xeopcDesc = xeopcDesc;
        this.xesisCodigo = xesisCodigo;
    }

    public XeopcOpcion(String xeopcCodigo, String xeopcDesc) {
        this.xeopcCodigo = xeopcCodigo;
        this.xeopcDesc = xeopcDesc;
    }

    public String getXeopcCodigo() {
        return xeopcCodigo;
    }

    public void setXeopcCodigo(String xeopcCodigo) {
        this.xeopcCodigo = xeopcCodigo;
    }

    public String getXeopcDesc() {
        return xeopcDesc;
    }

    public void setXeopcDesc(String xeopcDesc) {
        this.xeopcDesc = xeopcDesc;
    }

    @XmlTransient
    public Collection<XevenVentan> getXevenVentanCollection() {
        return xevenVentanCollection;
    }

    public void setXevenVentanCollection(Collection<XevenVentan> xevenVentanCollection) {
        this.xevenVentanCollection = xevenVentanCollection;
    }

    @XmlTransient
    public Collection<XeopeOpeper> getXeopeOpeperCollection() {
        return xeopeOpeperCollection;
    }

    public void setXeopeOpeperCollection(Collection<XeopeOpeper> xeopeOpeperCollection) {
        this.xeopeOpeperCollection = xeopeOpeperCollection;
    }

    public XesisSistem getXesisCodigo() {
        return xesisCodigo;
    }

    public void setXesisCodigo(XesisSistem xesisCodigo) {
        this.xesisCodigo = xesisCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xeopcCodigo != null ? xeopcCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XeopcOpcion)) {
            return false;
        }
        XeopcOpcion other = (XeopcOpcion) object;
        if ((this.xeopcCodigo == null && other.xeopcCodigo != null) || (this.xeopcCodigo != null && !this.xeopcCodigo.equals(other.xeopcCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XeopcOpcion[ xeopcCodigo=" + xeopcCodigo + " ]";
    }
    
}
