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
@Table(name = "xeope_opeper")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XeopeOpeper.findAll", query = "SELECT x FROM XeopeOpeper x")
    , @NamedQuery(name = "XeopeOpeper.findByXeperCodigo", query = "SELECT x FROM XeopeOpeper x WHERE x.xeopeOpeperPK.xeperCodigo = :xeperCodigo")
    , @NamedQuery(name = "XeopeOpeper.findByXeopcCodigo", query = "SELECT x FROM XeopeOpeper x WHERE x.xeopeOpeperPK.xeopcCodigo = :xeopcCodigo")
    , @NamedQuery(name = "XeopeOpeper.findByXeopeFasign", query = "SELECT x FROM XeopeOpeper x WHERE x.xeopeFasign = :xeopeFasign")
    , @NamedQuery(name = "XeopeOpeper.findByXeopeEstado", query = "SELECT x FROM XeopeOpeper x WHERE x.xeopeEstado = :xeopeEstado")})
public class XeopeOpeper implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected XeopeOpeperPK xeopeOpeperPK;
    @Basic(optional = false)
    @Column(name = "XEOPE_FASIGN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xeopeFasign;
    @Basic(optional = false)
    @Column(name = "XEOPE_ESTADO")
    private String xeopeEstado;
    @JoinColumn(name = "XEOPC_CODIGO", referencedColumnName = "XEOPC_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private XeopcOpcion xeopcOpcion;
    @JoinColumn(name = "XEPER_CODIGO", referencedColumnName = "XEPER_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private XeperPerfil xeperPerfil;

    public XeopeOpeper() {
    }

    public XeopeOpeper(XeopeOpeperPK xeopeOpeperPK) {
        this.xeopeOpeperPK = xeopeOpeperPK;
    }

    public XeopeOpeper(XeopeOpeperPK xeopeOpeperPK, Date xeopeFasign, String xeopeEstado) {
        this.xeopeOpeperPK = xeopeOpeperPK;
        this.xeopeFasign = xeopeFasign;
        this.xeopeEstado = xeopeEstado;
    }

    public XeopeOpeper(String xeperCodigo, String xeopcCodigo) {
        this.xeopeOpeperPK = new XeopeOpeperPK(xeperCodigo, xeopcCodigo);
    }

    public XeopeOpeperPK getXeopeOpeperPK() {
        return xeopeOpeperPK;
    }

    public void setXeopeOpeperPK(XeopeOpeperPK xeopeOpeperPK) {
        this.xeopeOpeperPK = xeopeOpeperPK;
    }

    public Date getXeopeFasign() {
        return xeopeFasign;
    }

    public void setXeopeFasign(Date xeopeFasign) {
        this.xeopeFasign = xeopeFasign;
    }

    public String getXeopeEstado() {
        return xeopeEstado;
    }

    public void setXeopeEstado(String xeopeEstado) {
        this.xeopeEstado = xeopeEstado;
    }

    public XeopcOpcion getXeopcOpcion() {
        return xeopcOpcion;
    }

    public void setXeopcOpcion(XeopcOpcion xeopcOpcion) {
        this.xeopcOpcion = xeopcOpcion;
    }

    public XeperPerfil getXeperPerfil() {
        return xeperPerfil;
    }

    public void setXeperPerfil(XeperPerfil xeperPerfil) {
        this.xeperPerfil = xeperPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xeopeOpeperPK != null ? xeopeOpeperPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XeopeOpeper)) {
            return false;
        }
        XeopeOpeper other = (XeopeOpeper) object;
        if ((this.xeopeOpeperPK == null && other.xeopeOpeperPK != null) || (this.xeopeOpeperPK != null && !this.xeopeOpeperPK.equals(other.xeopeOpeperPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XeopeOpeper[ xeopeOpeperPK=" + xeopeOpeperPK + " ]";
    }
    
}
