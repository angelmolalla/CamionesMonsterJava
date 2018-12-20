/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "fedet_detfac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FedetDetfac.findAll", query = "SELECT f FROM FedetDetfac f")
    , @NamedQuery(name = "FedetDetfac.findByFedetCodigo", query = "SELECT f FROM FedetDetfac f WHERE f.fedetDetfacPK.fedetCodigo = :fedetCodigo")
    , @NamedQuery(name = "FedetDetfac.findByFecabCodigo", query = "SELECT f FROM FedetDetfac f WHERE f.fedetDetfacPK.fecabCodigo = :fecabCodigo")
    , @NamedQuery(name = "FedetDetfac.findByMepedCodigo", query = "SELECT f FROM FedetDetfac f WHERE f.fedetDetfacPK.mepedCodigo = :mepedCodigo")
    , @NamedQuery(name = "FedetDetfac.findByFedetCosto", query = "SELECT f FROM FedetDetfac f WHERE f.fedetCosto = :fedetCosto")})
public class FedetDetfac implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FedetDetfacPK fedetDetfacPK;
    @Basic(optional = false)
    @Column(name = "FEDET_COSTO")
    private float fedetCosto;
    @JoinColumn(name = "FECAB_CODIGO", referencedColumnName = "FECAB_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FecabCabec fecabCabec;
    @JoinColumn(name = "MEPED_CODIGO", referencedColumnName = "MEPED_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MepedPedido mepedPedido;

    public FedetDetfac() {
    }

    public FedetDetfac(FedetDetfacPK fedetDetfacPK) {
        this.fedetDetfacPK = fedetDetfacPK;
    }

    public FedetDetfac(FedetDetfacPK fedetDetfacPK, float fedetCosto) {
        this.fedetDetfacPK = fedetDetfacPK;
        this.fedetCosto = fedetCosto;
    }

    public FedetDetfac(String fedetCodigo, String fecabCodigo, String mepedCodigo) {
        this.fedetDetfacPK = new FedetDetfacPK(fedetCodigo, fecabCodigo, mepedCodigo);
    }

    public FedetDetfacPK getFedetDetfacPK() {
        return fedetDetfacPK;
    }

    public void setFedetDetfacPK(FedetDetfacPK fedetDetfacPK) {
        this.fedetDetfacPK = fedetDetfacPK;
    }

    public float getFedetCosto() {
        return fedetCosto;
    }

    public void setFedetCosto(float fedetCosto) {
        this.fedetCosto = fedetCosto;
    }

    public FecabCabec getFecabCabec() {
        return fecabCabec;
    }

    public void setFecabCabec(FecabCabec fecabCabec) {
        this.fecabCabec = fecabCabec;
    }

    public MepedPedido getMepedPedido() {
        return mepedPedido;
    }

    public void setMepedPedido(MepedPedido mepedPedido) {
        this.mepedPedido = mepedPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fedetDetfacPK != null ? fedetDetfacPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FedetDetfac)) {
            return false;
        }
        FedetDetfac other = (FedetDetfac) object;
        if ((this.fedetDetfacPK == null && other.fedetDetfacPK != null) || (this.fedetDetfacPK != null && !this.fedetDetfacPK.equals(other.fedetDetfacPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.FedetDetfac[ fedetDetfacPK=" + fedetDetfacPK + " ]";
    }
    
}
