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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "pecar_cargo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PecarCargo.findAll", query = "SELECT p FROM PecarCargo p")
    , @NamedQuery(name = "PecarCargo.findByPecarCodigo", query = "SELECT p FROM PecarCargo p WHERE p.pecarCargoPK.pecarCodigo = :pecarCodigo")
    , @NamedQuery(name = "PecarCargo.findByPedepCodigo", query = "SELECT p FROM PecarCargo p WHERE p.pecarCargoPK.pedepCodigo = :pedepCodigo")
    , @NamedQuery(name = "PecarCargo.findByPecarDesc", query = "SELECT p FROM PecarCargo p WHERE p.pecarDesc = :pecarDesc")})
public class PecarCargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PecarCargoPK pecarCargoPK;
    @Basic(optional = false)
    @Column(name = "PECAR_DESC")
    private String pecarDesc;
    @JoinColumn(name = "PEDEP_CODIGO", referencedColumnName = "PEDEP_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PedepDepart pedepDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pecarCargo")
    private Collection<PeempEmplea> peempEmpleaCollection;

    public PecarCargo() {
    }

    public PecarCargo(PecarCargoPK pecarCargoPK) {
        this.pecarCargoPK = pecarCargoPK;
    }

    public PecarCargo(PecarCargoPK pecarCargoPK, String pecarDesc) {
        this.pecarCargoPK = pecarCargoPK;
        this.pecarDesc = pecarDesc;
    }

    public PecarCargo(String pecarCodigo, String pedepCodigo) {
        this.pecarCargoPK = new PecarCargoPK(pecarCodigo, pedepCodigo);
    }

    public PecarCargoPK getPecarCargoPK() {
        return pecarCargoPK;
    }

    public void setPecarCargoPK(PecarCargoPK pecarCargoPK) {
        this.pecarCargoPK = pecarCargoPK;
    }

    public String getPecarDesc() {
        return pecarDesc;
    }

    public void setPecarDesc(String pecarDesc) {
        this.pecarDesc = pecarDesc;
    }

    public PedepDepart getPedepDepart() {
        return pedepDepart;
    }

    public void setPedepDepart(PedepDepart pedepDepart) {
        this.pedepDepart = pedepDepart;
    }

    @XmlTransient
    public Collection<PeempEmplea> getPeempEmpleaCollection() {
        return peempEmpleaCollection;
    }

    public void setPeempEmpleaCollection(Collection<PeempEmplea> peempEmpleaCollection) {
        this.peempEmpleaCollection = peempEmpleaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pecarCargoPK != null ? pecarCargoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PecarCargo)) {
            return false;
        }
        PecarCargo other = (PecarCargo) object;
        if ((this.pecarCargoPK == null && other.pecarCargoPK != null) || (this.pecarCargoPK != null && !this.pecarCargoPK.equals(other.pecarCargoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.PecarCargo[ pecarCargoPK=" + pecarCargoPK + " ]";
    }
    
}
