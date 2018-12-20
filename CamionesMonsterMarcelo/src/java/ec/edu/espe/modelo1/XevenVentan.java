/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "xeven_ventan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XevenVentan.findAll", query = "SELECT x FROM XevenVentan x")
    , @NamedQuery(name = "XevenVentan.findByXevenCodigo", query = "SELECT x FROM XevenVentan x WHERE x.xevenCodigo = :xevenCodigo")
    , @NamedQuery(name = "XevenVentan.findByXevenDesc", query = "SELECT x FROM XevenVentan x WHERE x.xevenDesc = :xevenDesc")
    , @NamedQuery(name = "XevenVentan.findByXevenMens", query = "SELECT x FROM XevenVentan x WHERE x.xevenMens = :xevenMens")})
public class XevenVentan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XEVEN_CODIGO")
    private String xevenCodigo;
    @Basic(optional = false)
    @Column(name = "XEVEN_DESC")
    private String xevenDesc;
    @Basic(optional = false)
    @Column(name = "XEVEN_MENS")
    private String xevenMens;
    @JoinColumn(name = "XEOPC_CODIGO", referencedColumnName = "XEOPC_CODIGO")
    @ManyToOne(optional = false)
    private XeopcOpcion xeopcCodigo;

    public XevenVentan() {
    }

    public XevenVentan(String xevenCodigo) {
        this.xevenCodigo = xevenCodigo;
    }

    public XevenVentan(String xevenCodigo, String xevenDesc, String xevenMens) {
        this.xevenCodigo = xevenCodigo;
        this.xevenDesc = xevenDesc;
        this.xevenMens = xevenMens;
    }

    public String getXevenCodigo() {
        return xevenCodigo;
    }

    public void setXevenCodigo(String xevenCodigo) {
        this.xevenCodigo = xevenCodigo;
    }

    public String getXevenDesc() {
        return xevenDesc;
    }

    public void setXevenDesc(String xevenDesc) {
        this.xevenDesc = xevenDesc;
    }

    public String getXevenMens() {
        return xevenMens;
    }

    public void setXevenMens(String xevenMens) {
        this.xevenMens = xevenMens;
    }

    public XeopcOpcion getXeopcCodigo() {
        return xeopcCodigo;
    }

    public void setXeopcCodigo(XeopcOpcion xeopcCodigo) {
        this.xeopcCodigo = xeopcCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xevenCodigo != null ? xevenCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XevenVentan)) {
            return false;
        }
        XevenVentan other = (XevenVentan) object;
        if ((this.xevenCodigo == null && other.xevenCodigo != null) || (this.xevenCodigo != null && !this.xevenCodigo.equals(other.xevenCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XevenVentan[ xevenCodigo=" + xevenCodigo + " ]";
    }
    
}
