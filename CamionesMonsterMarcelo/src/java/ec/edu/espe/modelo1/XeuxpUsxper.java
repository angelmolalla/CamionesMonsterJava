/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "xeuxp_usxper")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XeuxpUsxper.findAll", query = "SELECT x FROM XeuxpUsxper x")
    , @NamedQuery(name = "XeuxpUsxper.findByPeempCodigo", query = "SELECT x FROM XeuxpUsxper x WHERE x.xeuxpUsxperPK.peempCodigo = :peempCodigo")
    , @NamedQuery(name = "XeuxpUsxper.findByXeperCodigo", query = "SELECT x FROM XeuxpUsxper x WHERE x.xeuxpUsxperPK.xeperCodigo = :xeperCodigo")
    , @NamedQuery(name = "XeuxpUsxper.findByXeuxpFeasig", query = "SELECT x FROM XeuxpUsxper x WHERE x.xeuxpFeasig = :xeuxpFeasig")
    , @NamedQuery(name = "XeuxpUsxper.findByXeuxpFecam", query = "SELECT x FROM XeuxpUsxper x WHERE x.xeuxpFecam = :xeuxpFecam")})
public class XeuxpUsxper implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected XeuxpUsxperPK xeuxpUsxperPK;
    @Basic(optional = false)
    @Column(name = "XEUXP_FEASIG")
    @Temporal(TemporalType.DATE)
    private Date xeuxpFeasig;
    @Basic(optional = false)
    @Column(name = "XEUXP_FECAM")
    @Temporal(TemporalType.DATE)
    private Date xeuxpFecam;
    @JoinColumn(name = "XEPER_CODIGO", referencedColumnName = "XEPER_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private XeperPerfil xeperPerfil;
    @JoinColumn(name = "PEEMP_CODIGO", referencedColumnName = "PEEMP_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private XeusuUsua xeusuUsua;

    public XeuxpUsxper() {
        
    }

    public XeuxpUsxper(XeuxpUsxperPK xeuxpUsxperPK) {
        this.xeuxpUsxperPK = xeuxpUsxperPK;
    }

    public XeuxpUsxper(XeuxpUsxperPK xeuxpUsxperPK, Date xeuxpFeasig, Date xeuxpFecam) {
        this.xeuxpUsxperPK = xeuxpUsxperPK;
        this.xeuxpFeasig = xeuxpFeasig;
        this.xeuxpFecam = xeuxpFecam;
    }

    public XeuxpUsxper(String peempCodigo, String xeperCodigo) {
        this.xeuxpUsxperPK = new XeuxpUsxperPK(peempCodigo, xeperCodigo);
    }

    public XeuxpUsxperPK getXeuxpUsxperPK() {
        return xeuxpUsxperPK;
    }

    public void setXeuxpUsxperPK(XeuxpUsxperPK xeuxpUsxperPK) {
        this.xeuxpUsxperPK = xeuxpUsxperPK;
    }

    public Date getXeuxpFeasig() {
        return xeuxpFeasig;
    }

    public void setXeuxpFeasig(Date xeuxpFeasig) {
        this.xeuxpFeasig = xeuxpFeasig;
    }

    public Date getXeuxpFecam() {
        return xeuxpFecam;
    }

    public void setXeuxpFecam(Date xeuxpFecam) {
        this.xeuxpFecam = xeuxpFecam;
    }

    public XeperPerfil getXeperPerfil() {
        return xeperPerfil;
    }

    public void setXeperPerfil(XeperPerfil xeperPerfil) {
        this.xeperPerfil = xeperPerfil;
    }

    public XeusuUsua getXeusuUsua() {
        return xeusuUsua;
    }

    public void setXeusuUsua(XeusuUsua xeusuUsua) {
        this.xeusuUsua = xeusuUsua;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xeuxpUsxperPK != null ? xeuxpUsxperPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XeuxpUsxper)) {
            return false;
        }
        XeuxpUsxper other = (XeuxpUsxper) object;
        if ((this.xeuxpUsxperPK == null && other.xeuxpUsxperPK != null) || (this.xeuxpUsxperPK != null && !this.xeuxpUsxperPK.equals(other.xeuxpUsxperPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XeuxpUsxper[ xeuxpUsxperPK=" + xeuxpUsxperPK + " ]";
    }
    
}
