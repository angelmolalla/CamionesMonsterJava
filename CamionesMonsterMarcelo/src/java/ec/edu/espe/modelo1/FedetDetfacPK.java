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
public class FedetDetfacPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "FEDET_CODIGO")
    private String fedetCodigo;
    @Basic(optional = false)
    @Column(name = "FECAB_CODIGO")
    private String fecabCodigo;
    @Basic(optional = false)
    @Column(name = "MEPED_CODIGO")
    private String mepedCodigo;

    public FedetDetfacPK() {
    }

    public FedetDetfacPK(String fedetCodigo, String fecabCodigo, String mepedCodigo) {
        this.fedetCodigo = fedetCodigo;
        this.fecabCodigo = fecabCodigo;
        this.mepedCodigo = mepedCodigo;
    }

    public String getFedetCodigo() {
        return fedetCodigo;
    }

    public void setFedetCodigo(String fedetCodigo) {
        this.fedetCodigo = fedetCodigo;
    }

    public String getFecabCodigo() {
        return fecabCodigo;
    }

    public void setFecabCodigo(String fecabCodigo) {
        this.fecabCodigo = fecabCodigo;
    }

    public String getMepedCodigo() {
        return mepedCodigo;
    }

    public void setMepedCodigo(String mepedCodigo) {
        this.mepedCodigo = mepedCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fedetCodigo != null ? fedetCodigo.hashCode() : 0);
        hash += (fecabCodigo != null ? fecabCodigo.hashCode() : 0);
        hash += (mepedCodigo != null ? mepedCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FedetDetfacPK)) {
            return false;
        }
        FedetDetfacPK other = (FedetDetfacPK) object;
        if ((this.fedetCodigo == null && other.fedetCodigo != null) || (this.fedetCodigo != null && !this.fedetCodigo.equals(other.fedetCodigo))) {
            return false;
        }
        if ((this.fecabCodigo == null && other.fecabCodigo != null) || (this.fecabCodigo != null && !this.fecabCodigo.equals(other.fecabCodigo))) {
            return false;
        }
        if ((this.mepedCodigo == null && other.mepedCodigo != null) || (this.mepedCodigo != null && !this.mepedCodigo.equals(other.mepedCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.FedetDetfacPK[ fedetCodigo=" + fedetCodigo + ", fecabCodigo=" + fecabCodigo + ", mepedCodigo=" + mepedCodigo + " ]";
    }
    
}
