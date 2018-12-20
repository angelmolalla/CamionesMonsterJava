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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "xeper_perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XeperPerfil.findAll", query = "SELECT x FROM XeperPerfil x")
    , @NamedQuery(name = "XeperPerfil.findByXeperCodigo", query = "SELECT x FROM XeperPerfil x WHERE x.xeperCodigo = :xeperCodigo")
    , @NamedQuery(name = "XeperPerfil.findByXeperDesc", query = "SELECT x FROM XeperPerfil x WHERE x.xeperDesc = :xeperDesc")
    , @NamedQuery(name = "XeperPerfil.findByXeperObser", query = "SELECT x FROM XeperPerfil x WHERE x.xeperObser = :xeperObser")})
public class XeperPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XEPER_CODIGO")
    private String xeperCodigo;
    @Basic(optional = false)
    @Column(name = "XEPER_DESC")
    private String xeperDesc;
    @Basic(optional = false)
    @Column(name = "XEPER_OBSER")
    private String xeperObser;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "xeperPerfil")
    private XerolRol xerolRol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xeperPerfil")
    private Collection<XeuxpUsxper> xeuxpUsxperCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xeperPerfil")
    private Collection<XeopeOpeper> xeopeOpeperCollection;

    public XeperPerfil() {
    }

    public XeperPerfil(String xeperCodigo) {
        this.xeperCodigo = xeperCodigo;
    }

    public XeperPerfil(String xeperCodigo, String xeperDesc, String xeperObser) {
        this.xeperCodigo = xeperCodigo;
        this.xeperDesc = xeperDesc;
        this.xeperObser = xeperObser;
    }

    public String getXeperCodigo() {
        return xeperCodigo;
    }

    public void setXeperCodigo(String xeperCodigo) {
        this.xeperCodigo = xeperCodigo;
    }

    public String getXeperDesc() {
        return xeperDesc;
    }

    public void setXeperDesc(String xeperDesc) {
        this.xeperDesc = xeperDesc;
    }

    public String getXeperObser() {
        return xeperObser;
    }

    public void setXeperObser(String xeperObser) {
        this.xeperObser = xeperObser;
    }

    public XerolRol getXerolRol() {
        return xerolRol;
    }

    public void setXerolRol(XerolRol xerolRol) {
        this.xerolRol = xerolRol;
    }

    @XmlTransient
    public Collection<XeuxpUsxper> getXeuxpUsxperCollection() {
        return xeuxpUsxperCollection;
    }

    public void setXeuxpUsxperCollection(Collection<XeuxpUsxper> xeuxpUsxperCollection) {
        this.xeuxpUsxperCollection = xeuxpUsxperCollection;
    }

    @XmlTransient
    public Collection<XeopeOpeper> getXeopeOpeperCollection() {
        return xeopeOpeperCollection;
    }

    public void setXeopeOpeperCollection(Collection<XeopeOpeper> xeopeOpeperCollection) {
        this.xeopeOpeperCollection = xeopeOpeperCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xeperCodigo != null ? xeperCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XeperPerfil)) {
            return false;
        }
        XeperPerfil other = (XeperPerfil) object;
        if ((this.xeperCodigo == null && other.xeperCodigo != null) || (this.xeperCodigo != null && !this.xeperCodigo.equals(other.xeperCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XeperPerfil[ xeperCodigo=" + xeperCodigo + " ]";
    }
    
}
