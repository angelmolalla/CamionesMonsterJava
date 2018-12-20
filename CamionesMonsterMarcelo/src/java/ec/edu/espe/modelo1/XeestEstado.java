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
@Table(name = "xeest_estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XeestEstado.findAll", query = "SELECT x FROM XeestEstado x")
    , @NamedQuery(name = "XeestEstado.findByXeestCodigo", query = "SELECT x FROM XeestEstado x WHERE x.xeestCodigo = :xeestCodigo")
    , @NamedQuery(name = "XeestEstado.findByXeestDesc", query = "SELECT x FROM XeestEstado x WHERE x.xeestDesc = :xeestDesc")})
public class XeestEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XEEST_CODIGO")
    private String xeestCodigo;
    @Basic(optional = false)
    @Column(name = "XEEST_DESC")
    private String xeestDesc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xeestCodigo")
    private Collection<XeusuUsua> xeusuUsuaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xeestCodigo")
    private Collection<XesisSistem> xesisSistemCollection;

    public XeestEstado() {
    }

    public XeestEstado(String xeestCodigo) {
        this.xeestCodigo = xeestCodigo;
    }

    public XeestEstado(String xeestCodigo, String xeestDesc) {
        this.xeestCodigo = xeestCodigo;
        this.xeestDesc = xeestDesc;
    }

    public String getXeestCodigo() {
        return xeestCodigo;
    }

    public void setXeestCodigo(String xeestCodigo) {
        this.xeestCodigo = xeestCodigo;
    }

    public String getXeestDesc() {
        return xeestDesc;
    }

    public void setXeestDesc(String xeestDesc) {
        this.xeestDesc = xeestDesc;
    }

    @XmlTransient
    public Collection<XeusuUsua> getXeusuUsuaCollection() {
        return xeusuUsuaCollection;
    }

    public void setXeusuUsuaCollection(Collection<XeusuUsua> xeusuUsuaCollection) {
        this.xeusuUsuaCollection = xeusuUsuaCollection;
    }

    @XmlTransient
    public Collection<XesisSistem> getXesisSistemCollection() {
        return xesisSistemCollection;
    }

    public void setXesisSistemCollection(Collection<XesisSistem> xesisSistemCollection) {
        this.xesisSistemCollection = xesisSistemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xeestCodigo != null ? xeestCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XeestEstado)) {
            return false;
        }
        XeestEstado other = (XeestEstado) object;
        if ((this.xeestCodigo == null && other.xeestCodigo != null) || (this.xeestCodigo != null && !this.xeestCodigo.equals(other.xeestCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XeestEstado[ xeestCodigo=" + xeestCodigo + " ]";
    }
    
}
