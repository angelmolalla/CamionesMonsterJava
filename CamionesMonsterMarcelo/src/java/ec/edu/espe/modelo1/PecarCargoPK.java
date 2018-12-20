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
public class PecarCargoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PECAR_CODIGO")
    private String pecarCodigo;
    @Basic(optional = false)
    @Column(name = "PEDEP_CODIGO")
    private String pedepCodigo;

    public PecarCargoPK() {
    }

    public PecarCargoPK(String pecarCodigo, String pedepCodigo) {
        this.pecarCodigo = pecarCodigo;
        this.pedepCodigo = pedepCodigo;
    }

    public String getPecarCodigo() {
        return pecarCodigo;
    }

    public void setPecarCodigo(String pecarCodigo) {
        this.pecarCodigo = pecarCodigo;
    }

    public String getPedepCodigo() {
        return pedepCodigo;
    }

    public void setPedepCodigo(String pedepCodigo) {
        this.pedepCodigo = pedepCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pecarCodigo != null ? pecarCodigo.hashCode() : 0);
        hash += (pedepCodigo != null ? pedepCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PecarCargoPK)) {
            return false;
        }
        PecarCargoPK other = (PecarCargoPK) object;
        if ((this.pecarCodigo == null && other.pecarCodigo != null) || (this.pecarCodigo != null && !this.pecarCodigo.equals(other.pecarCodigo))) {
            return false;
        }
        if ((this.pedepCodigo == null && other.pedepCodigo != null) || (this.pedepCodigo != null && !this.pedepCodigo.equals(other.pedepCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.PecarCargoPK[ pecarCodigo=" + pecarCodigo + ", pedepCodigo=" + pedepCodigo + " ]";
    }
    
}
