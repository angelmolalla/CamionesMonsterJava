/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Marcelo
 */
@Embeddable
public class XeuxpUsxperPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PEEMP_CODIGO")
    private String peempCodigo;
    @Basic(optional = false)
    @Column(name = "XEPER_CODIGO")
    private String xeperCodigo;

    public XeuxpUsxperPK() {
    }

    public XeuxpUsxperPK(String peempCodigo, String xeperCodigo) {
        this.peempCodigo = peempCodigo;
        this.xeperCodigo = xeperCodigo;
    }

    public String getPeempCodigo() {
        return peempCodigo;
    }

    public void setPeempCodigo(String peempCodigo) {
        this.peempCodigo = peempCodigo;
    }

    public String getXeperCodigo() {
        return xeperCodigo;
    }

    public void setXeperCodigo(String xeperCodigo) {
        this.xeperCodigo = xeperCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peempCodigo != null ? peempCodigo.hashCode() : 0);
        hash += (xeperCodigo != null ? xeperCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XeuxpUsxperPK)) {
            return false;
        }
        XeuxpUsxperPK other = (XeuxpUsxperPK) object;
        if ((this.peempCodigo == null && other.peempCodigo != null) || (this.peempCodigo != null && !this.peempCodigo.equals(other.peempCodigo))) {
            return false;
        }
        if ((this.xeperCodigo == null && other.xeperCodigo != null) || (this.xeperCodigo != null && !this.xeperCodigo.equals(other.xeperCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.XeuxpUsxperPK[ peempCodigo=" + peempCodigo + ", xeperCodigo=" + xeperCodigo + " ]";
    }
    
}
