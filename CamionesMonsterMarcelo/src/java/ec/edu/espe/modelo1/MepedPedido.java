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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "meped_pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MepedPedido.findAll", query = "SELECT m FROM MepedPedido m")
    , @NamedQuery(name = "MepedPedido.findByMepedCodigo", query = "SELECT m FROM MepedPedido m WHERE m.mepedCodigo = :mepedCodigo")
    , @NamedQuery(name = "MepedPedido.findByMepedPeso", query = "SELECT m FROM MepedPedido m WHERE m.mepedPeso = :mepedPeso")
    , @NamedQuery(name = "MepedPedido.findByMepedVol", query = "SELECT m FROM MepedPedido m WHERE m.mepedVol = :mepedVol")
    , @NamedQuery(name = "MepedPedido.findByMepedCosto", query = "SELECT m FROM MepedPedido m WHERE m.mepedCosto = :mepedCosto")
    , @NamedQuery(name = "MepedPedido.findByMepedEstado", query = "SELECT m FROM MepedPedido m WHERE m.mepedEstado = :mepedEstado")})
public class MepedPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MEPED_CODIGO")
    private String mepedCodigo;
    @Basic(optional = false)
    @Column(name = "MEPED_PESO")
    private float mepedPeso;
    @Basic(optional = false)
    @Column(name = "MEPED_VOL")
    private float mepedVol;
    @Basic(optional = false)
    @Column(name = "MEPED_COSTO")
    private float mepedCosto;
    @Basic(optional = false)
    @Column(name = "MEPED_ESTADO")
    private int mepedEstado;
    @JoinTable(name = "mepxv_pedvia", joinColumns = {
        @JoinColumn(name = "MEPED_CODIGO", referencedColumnName = "MEPED_CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "MEVIA_CODIGO", referencedColumnName = "MEVIA_CODIGO")})
    @ManyToMany
    private Collection<MeviaViaje> meviaViajeCollection;
    @JoinColumn(name = "MEALM_CODIGO", referencedColumnName = "MEALM_CODIGO")
    @ManyToOne(optional = false)
    private MealmAlmac mealmCodigo;
    @JoinColumn(name = "METIE_CODIGO", referencedColumnName = "METIE_CODIGO")
    @ManyToOne(optional = false)
    private MetieTienda metieCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mepedPedido")
    private Collection<FedetDetfac> fedetDetfacCollection;

    public MepedPedido() {
    }

    public MepedPedido(String mepedCodigo) {
        this.mepedCodigo = mepedCodigo;
    }

    public MepedPedido(String mepedCodigo, float mepedPeso, float mepedVol, float mepedCosto, int mepedEstado) {
        this.mepedCodigo = mepedCodigo;
        this.mepedPeso = mepedPeso;
        this.mepedVol = mepedVol;
        this.mepedCosto = mepedCosto;
        this.mepedEstado = mepedEstado;
    }

    public String getMepedCodigo() {
        return mepedCodigo;
    }

    public void setMepedCodigo(String mepedCodigo) {
        this.mepedCodigo = mepedCodigo;
    }

    public float getMepedPeso() {
        return mepedPeso;
    }

    public void setMepedPeso(float mepedPeso) {
        this.mepedPeso = mepedPeso;
    }

    public float getMepedVol() {
        return mepedVol;
    }

    public void setMepedVol(float mepedVol) {
        this.mepedVol = mepedVol;
    }

    public float getMepedCosto() {
        return mepedCosto;
    }

    public void setMepedCosto(float mepedCosto) {
        this.mepedCosto = mepedCosto;
    }

    public int getMepedEstado() {
        return mepedEstado;
    }

    public void setMepedEstado(int mepedEstado) {
        this.mepedEstado = mepedEstado;
    }

    @XmlTransient
    public Collection<MeviaViaje> getMeviaViajeCollection() {
        return meviaViajeCollection;
    }

    public void setMeviaViajeCollection(Collection<MeviaViaje> meviaViajeCollection) {
        this.meviaViajeCollection = meviaViajeCollection;
    }

    public MealmAlmac getMealmCodigo() {
        return mealmCodigo;
    }

    public void setMealmCodigo(MealmAlmac mealmCodigo) {
        this.mealmCodigo = mealmCodigo;
    }

    public MetieTienda getMetieCodigo() {
        return metieCodigo;
    }

    public void setMetieCodigo(MetieTienda metieCodigo) {
        this.metieCodigo = metieCodigo;
    }

    @XmlTransient
    public Collection<FedetDetfac> getFedetDetfacCollection() {
        return fedetDetfacCollection;
    }

    public void setFedetDetfacCollection(Collection<FedetDetfac> fedetDetfacCollection) {
        this.fedetDetfacCollection = fedetDetfacCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mepedCodigo != null ? mepedCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MepedPedido)) {
            return false;
        }
        MepedPedido other = (MepedPedido) object;
        if ((this.mepedCodigo == null && other.mepedCodigo != null) || (this.mepedCodigo != null && !this.mepedCodigo.equals(other.mepedCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.MepedPedido[ mepedCodigo=" + mepedCodigo + " ]";
    }
    
}
