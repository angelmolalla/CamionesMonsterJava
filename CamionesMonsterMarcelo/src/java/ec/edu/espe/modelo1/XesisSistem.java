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
@Table(name = "xesis_sistem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XesisSistem.findAll", query = "SELECT x FROM XesisSistem x")
    , @NamedQuery(name = "XesisSistem.findByXesisCodigo", query = "SELECT x FROM XesisSistem x WHERE x.xesisCodigo = :xesisCodigo")
    , @NamedQuery(name = "XesisSistem.findByXesisDesc", query = "SELECT x FROM XesisSistem x WHERE x.xesisDesc = :xesisDesc")})
public class XesisSistem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XESIS_CODIGO")
    private String xesisCodigo;
    @Basic(optional = false)
    @Column(name = "XESIS_DESC")
    private String xesisDesc;
    @JoinColumn(name = "XEEST_CODIGO", referencedColumnName = "XEEST_CODIGO")
    @ManyToOne(optional = false)
    private XeestEstado xeestCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xesisCodigo")
    private Collection<XeopcOpcion> xeopcOpcionCollection;

    public XesisSistem() {
    }

    public XesisSistem(String xesisCodigo) {
        this.xesisCodigo = xesisCodigo;
    }

    public XesisSistem(String xesisCodigo, String xesisDesc) {
        this.xesisCodigo = xesisCodigo;
        this.xesisDesc = xesisDesc;
    }

    public String getXesisCodigo() {
        return xesisCodigo;
    }

    public void setXesisCodigo(String xesisCodigo) {
        this.xesisCodigo = xesisCodigo;
    }

    public String getXesisDesc() {
        return xesisDesc;
    }

    public void setXesisDesc(String xesisDesc) {
        this.xesisDesc = xesisDesc;
    }

    public XeestEstado getXeestCodigo() {
        return xeestCodigo;
    }

    public void setXeestCodigo(XeestEstado xeestCodigo) {
        this.xeestCodigo = xeestCodigo;
    }

    @XmlTransient
    public Collection<XeopcOpcion> getXeopcOpcionCollection() {
        return xeopcOpcionCollection;
    }

    public void setXeopcOpcionCollection(Collection<XeopcOpcion> xeopcOpcionCollection) {
        this.xeopcOpcionCollection = xeopcOpcionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xesisCodigo != null ? xesisCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XesisSistem)) {
            return false;
        }
        XesisSistem other = (XesisSistem) object;
        if ((this.xesisCodigo == null && other.xesisCodigo != null) || (this.xesisCodigo != null && !this.xesisCodigo.equals(other.xesisCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XesisSistem[ xesisCodigo=" + xesisCodigo + " ]";
    }
    
}
