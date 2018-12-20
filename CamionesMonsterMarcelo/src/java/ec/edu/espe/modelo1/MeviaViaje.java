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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "mevia_viaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MeviaViaje.findAll", query = "SELECT m FROM MeviaViaje m")
    , @NamedQuery(name = "MeviaViaje.findByMeviaCodigo", query = "SELECT m FROM MeviaViaje m WHERE m.meviaCodigo = :meviaCodigo")
    , @NamedQuery(name = "MeviaViaje.findByMeviaFeprog", query = "SELECT m FROM MeviaViaje m WHERE m.meviaFeprog = :meviaFeprog")
    , @NamedQuery(name = "MeviaViaje.findByMeviaFefin", query = "SELECT m FROM MeviaViaje m WHERE m.meviaFefin = :meviaFefin")
    , @NamedQuery(name = "MeviaViaje.findByMeviaVol", query = "SELECT m FROM MeviaViaje m WHERE m.meviaVol = :meviaVol")
    , @NamedQuery(name = "MeviaViaje.findByMeviaPeso", query = "SELECT m FROM MeviaViaje m WHERE m.meviaPeso = :meviaPeso")
    , @NamedQuery(name = "MeviaViaje.findByMeviaEstado", query = "SELECT m FROM MeviaViaje m WHERE m.meviaEstado = :meviaEstado")})
public class MeviaViaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MEVIA_CODIGO")
    private String meviaCodigo;
    @Basic(optional = false)
    @Column(name = "MEVIA_FEPROG")
    @Temporal(TemporalType.DATE)
    private Date meviaFeprog;
    @Column(name = "MEVIA_FEFIN")
    @Temporal(TemporalType.DATE)
    private Date meviaFefin;
    @Basic(optional = false)
    @Column(name = "MEVIA_VOL")
    private float meviaVol;
    @Basic(optional = false)
    @Column(name = "MEVIA_PESO")
    private float meviaPeso;
    @Basic(optional = false)
    @Column(name = "MEVIA_ESTADO")
    private int meviaEstado;
    @ManyToMany(mappedBy = "meviaViajeCollection")
    private Collection<MepedPedido> mepedPedidoCollection;
    @JoinColumn(name = "MECAM_CODIGO", referencedColumnName = "MECAM_CODIGO")
    @ManyToOne
    private MecamCamion mecamCodigo;
    @JoinColumn(name = "PEEMP_CODIGO", referencedColumnName = "PEEMP_CODIGO")
    @ManyToOne
    private PeempEmplea peempCodigo;

    public MeviaViaje() {
    }

    public MeviaViaje(String meviaCodigo) {
        this.meviaCodigo = meviaCodigo;
    }

    public MeviaViaje(String meviaCodigo, Date meviaFeprog, float meviaVol, float meviaPeso, int meviaEstado) {
        this.meviaCodigo = meviaCodigo;
        this.meviaFeprog = meviaFeprog;
        this.meviaVol = meviaVol;
        this.meviaPeso = meviaPeso;
        this.meviaEstado = meviaEstado;
    }

    public String getMeviaCodigo() {
        return meviaCodigo;
    }

    public void setMeviaCodigo(String meviaCodigo) {
        this.meviaCodigo = meviaCodigo;
    }

    public Date getMeviaFeprog() {
        return meviaFeprog;
    }

    public void setMeviaFeprog(Date meviaFeprog) {
        this.meviaFeprog = meviaFeprog;
    }

    public Date getMeviaFefin() {
        return meviaFefin;
    }

    public void setMeviaFefin(Date meviaFefin) {
        this.meviaFefin = meviaFefin;
    }

    public float getMeviaVol() {
        return meviaVol;
    }

    public void setMeviaVol(float meviaVol) {
        this.meviaVol = meviaVol;
    }

    public float getMeviaPeso() {
        return meviaPeso;
    }

    public void setMeviaPeso(float meviaPeso) {
        this.meviaPeso = meviaPeso;
    }

    public int getMeviaEstado() {
        return meviaEstado;
    }

    public void setMeviaEstado(int meviaEstado) {
        this.meviaEstado = meviaEstado;
    }

    @XmlTransient
    public Collection<MepedPedido> getMepedPedidoCollection() {
        return mepedPedidoCollection;
    }

    public void setMepedPedidoCollection(Collection<MepedPedido> mepedPedidoCollection) {
        this.mepedPedidoCollection = mepedPedidoCollection;
    }

    public MecamCamion getMecamCodigo() {
        return mecamCodigo;
    }

    public void setMecamCodigo(MecamCamion mecamCodigo) {
        this.mecamCodigo = mecamCodigo;
    }

    public PeempEmplea getPeempCodigo() {
        return peempCodigo;
    }

    public void setPeempCodigo(PeempEmplea peempCodigo) {
        this.peempCodigo = peempCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (meviaCodigo != null ? meviaCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MeviaViaje)) {
            return false;
        }
        MeviaViaje other = (MeviaViaje) object;
        if ((this.meviaCodigo == null && other.meviaCodigo != null) || (this.meviaCodigo != null && !this.meviaCodigo.equals(other.meviaCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.MeviaViaje[ meviaCodigo=" + meviaCodigo + " ]";
    }
    
}
