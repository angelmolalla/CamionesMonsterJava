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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name = "xerol_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XerolRol.findAll", query = "SELECT x FROM XerolRol x")
    , @NamedQuery(name = "XerolRol.findByXeperCodigo", query = "SELECT x FROM XerolRol x WHERE x.xeperCodigo = :xeperCodigo")
    , @NamedQuery(name = "XerolRol.findByXerolInser", query = "SELECT x FROM XerolRol x WHERE x.xerolInser = :xerolInser")
    , @NamedQuery(name = "XerolRol.findByXerolActual", query = "SELECT x FROM XerolRol x WHERE x.xerolActual = :xerolActual")
    , @NamedQuery(name = "XerolRol.findByXerolElimin", query = "SELECT x FROM XerolRol x WHERE x.xerolElimin = :xerolElimin")
    , @NamedQuery(name = "XerolRol.findByXerolConsul", query = "SELECT x FROM XerolRol x WHERE x.xerolConsul = :xerolConsul")})
public class XerolRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XEPER_CODIGO")
    private String xeperCodigo;
    @Basic(optional = false)
    @Column(name = "XEROL_INSER")
    private String xerolInser;
    @Basic(optional = false)
    @Column(name = "XEROL_ACTUAL")
    private String xerolActual;
    @Basic(optional = false)
    @Column(name = "XEROL_ELIMIN")
    private String xerolElimin;
    @Basic(optional = false)
    @Column(name = "XEROL_CONSUL")
    private String xerolConsul;
    @JoinColumn(name = "XEPER_CODIGO", referencedColumnName = "XEPER_CODIGO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private XeperPerfil xeperPerfil;

    public XerolRol() {
    }

    public XerolRol(String xeperCodigo) {
        this.xeperCodigo = xeperCodigo;
    }

    public XerolRol(String xeperCodigo, String xerolInser, String xerolActual, String xerolElimin, String xerolConsul) {
        this.xeperCodigo = xeperCodigo;
        this.xerolInser = xerolInser;
        this.xerolActual = xerolActual;
        this.xerolElimin = xerolElimin;
        this.xerolConsul = xerolConsul;
    }

    public String getXeperCodigo() {
        return xeperCodigo;
    }

    public void setXeperCodigo(String xeperCodigo) {
        this.xeperCodigo = xeperCodigo;
    }

    public String getXerolInser() {
        return xerolInser;
    }

    public void setXerolInser(String xerolInser) {
        this.xerolInser = xerolInser;
    }

    public String getXerolActual() {
        return xerolActual;
    }

    public void setXerolActual(String xerolActual) {
        this.xerolActual = xerolActual;
    }

    public String getXerolElimin() {
        return xerolElimin;
    }

    public void setXerolElimin(String xerolElimin) {
        this.xerolElimin = xerolElimin;
    }

    public String getXerolConsul() {
        return xerolConsul;
    }

    public void setXerolConsul(String xerolConsul) {
        this.xerolConsul = xerolConsul;
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
        hash += (xeperCodigo != null ? xeperCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XerolRol)) {
            return false;
        }
        XerolRol other = (XerolRol) object;
        if ((this.xeperCodigo == null && other.xeperCodigo != null) || (this.xeperCodigo != null && !this.xeperCodigo.equals(other.xeperCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XerolRol[ xeperCodigo=" + xeperCodigo + " ]";
    }
    
}
