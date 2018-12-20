/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "xeusu_usua")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XeusuUsua.findAll", query = "SELECT x FROM XeusuUsua x")
    , @NamedQuery(name = "XeusuUsua.findByPeempCodigo", query = "SELECT x FROM XeusuUsua x WHERE x.peempCodigo = :peempCodigo")
    , @NamedQuery(name = "XeusuUsua.findByXeusuPass", query = "SELECT x FROM XeusuUsua x WHERE x.xeusuPass = :xeusuPass")
    , @NamedQuery(name = "XeusuUsua.findByXeusuPfirm", query = "SELECT x FROM XeusuUsua x WHERE x.xeusuPfirm = :xeusuPfirm")
    , @NamedQuery(name = "XeusuUsua.findByXeusuFecrea", query = "SELECT x FROM XeusuUsua x WHERE x.xeusuFecrea = :xeusuFecrea")
    , @NamedQuery(name = "XeusuUsua.findByXeusuFeucam", query = "SELECT x FROM XeusuUsua x WHERE x.xeusuFeucam = :xeusuFeucam")})
public class XeusuUsua implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PEEMP_CODIGO")
    private String peempCodigo;
    @Basic(optional = false)
    @Column(name = "XEUSU_PASS")
    private String xeusuPass;
    @Basic(optional = false)
    @Column(name = "XEUSU_PFIRM")
    private String xeusuPfirm;
    @Basic(optional = false)
    @Column(name = "XEUSU_FECREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xeusuFecrea;
    @Basic(optional = false)
    @Column(name = "XEUSU_FEUCAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xeusuFeucam;
    @JoinColumn(name = "PEEMP_CODIGO", referencedColumnName = "PEEMP_CODIGO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PeempEmplea peempEmplea;
    @JoinColumn(name = "XEEST_CODIGO", referencedColumnName = "XEEST_CODIGO")
    @ManyToOne(optional = false)
    private XeestEstado xeestCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xeusuUsua")
    private Collection<XeuxpUsxper> xeuxpUsxperCollection;

    public XeusuUsua() {
    }

    public XeusuUsua(String peempCodigo) {
        this.peempCodigo = peempCodigo;
    }

    public XeusuUsua(String peempCodigo, PeempEmplea peempEmplea,XeestEstado xeestCodigo, String xeusuPass, String xeusuPfirm, Date xeusuFecrea, Date xeusuFeucam) {
        this.peempCodigo = peempCodigo;
        this.xeusuPass = xeusuPass;
        this.xeusuPfirm = xeusuPfirm;
        this.xeusuFecrea = xeusuFecrea;
        this.xeusuFeucam = xeusuFeucam;
        this.peempEmplea = peempEmplea;
        this.xeestCodigo = xeestCodigo;
    }

    public XeusuUsua(String peempCodigo, String xeusuPass, String xeusuPfirm, Date xeusuFecrea, Date xeusuFeucam) {
        this.peempCodigo = peempCodigo;
        this.xeusuPass = xeusuPass;
        this.xeusuPfirm = xeusuPfirm;
        this.xeusuFecrea = xeusuFecrea;
        this.xeusuFeucam = xeusuFeucam;
    }

    public String getPeempCodigo() {
        return peempCodigo;
    }

    public void setPeempCodigo(String peempCodigo) {
        this.peempCodigo = peempCodigo;
    }

    public String getXeusuPass() {
        return xeusuPass;
    }

    public void setXeusuPass(String xeusuPass) {
        this.xeusuPass = xeusuPass;
    }

    public String getXeusuPfirm() {
        return xeusuPfirm;
    }

    public void setXeusuPfirm(String xeusuPfirm) {
        this.xeusuPfirm = xeusuPfirm;
    }

    public Date getXeusuFecrea() {
        return xeusuFecrea;
    }

    public void setXeusuFecrea(Date xeusuFecrea) {
        this.xeusuFecrea = xeusuFecrea;
    }

    public Date getXeusuFeucam() {
        return xeusuFeucam;
    }

    public void setXeusuFeucam(Date xeusuFeucam) {
        this.xeusuFeucam = xeusuFeucam;
    }

    public PeempEmplea getPeempEmplea() {
        return peempEmplea;
    }

    public void setPeempEmplea(PeempEmplea peempEmplea) {
        this.peempEmplea = peempEmplea;
    }

    public XeestEstado getXeestCodigo() {
        return xeestCodigo;
    }

    public void setXeestCodigo(XeestEstado xeestCodigo) {
        this.xeestCodigo = xeestCodigo;
    }

    @XmlTransient
    public Collection<XeuxpUsxper> getXeuxpUsxperCollection() {
        return xeuxpUsxperCollection;
    }

    public void setXeuxpUsxperCollection(Collection<XeuxpUsxper> xeuxpUsxperCollection) {
        this.xeuxpUsxperCollection = xeuxpUsxperCollection;
    }

      @Override
    public int hashCode() {
        int hash = 1;
       hash = hash * 31 + xeusuPass.hashCode();
        xeusuPass=Integer.toString(hash);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XeusuUsua)) {
            return false;
        }
        XeusuUsua other = (XeusuUsua) object;
        if ((this.peempCodigo == null && other.peempCodigo != null) || (this.peempCodigo != null && !this.peempCodigo.equals(other.peempCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XeusuUsua[ peempCodigo=" + peempCodigo + " ]";
    }
    
}
