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
@Table(name = "pedep_depart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedepDepart.findAll", query = "SELECT p FROM PedepDepart p")
    , @NamedQuery(name = "PedepDepart.findByPedepCodigo", query = "SELECT p FROM PedepDepart p WHERE p.pedepCodigo = :pedepCodigo")
    , @NamedQuery(name = "PedepDepart.findByPedepDesc", query = "SELECT p FROM PedepDepart p WHERE p.pedepDesc = :pedepDesc")})
public class PedepDepart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PEDEP_CODIGO")
    private String pedepCodigo;
    @Basic(optional = false)
    @Column(name = "PEDEP_DESC")
    private String pedepDesc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedepDepart")
    private Collection<PecarCargo> pecarCargoCollection;

    public PedepDepart() {
    }

    public PedepDepart(String pedepCodigo) {
        this.pedepCodigo = pedepCodigo;
    }

    public PedepDepart(String pedepCodigo, String pedepDesc) {
        this.pedepCodigo = pedepCodigo;
        this.pedepDesc = pedepDesc;
    }

    public String getPedepCodigo() {
        return pedepCodigo;
    }

    public void setPedepCodigo(String pedepCodigo) {
        this.pedepCodigo = pedepCodigo;
    }

    public String getPedepDesc() {
        return pedepDesc;
    }

    public void setPedepDesc(String pedepDesc) {
        this.pedepDesc = pedepDesc;
    }

    @XmlTransient
    public Collection<PecarCargo> getPecarCargoCollection() {
        return pecarCargoCollection;
    }

    public void setPecarCargoCollection(Collection<PecarCargo> pecarCargoCollection) {
        this.pecarCargoCollection = pecarCargoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedepCodigo != null ? pedepCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedepDepart)) {
            return false;
        }
        PedepDepart other = (PedepDepart) object;
        if ((this.pedepCodigo == null && other.pedepCodigo != null) || (this.pedepCodigo != null && !this.pedepCodigo.equals(other.pedepCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.PedepDepart[ pedepCodigo=" + pedepCodigo + " ]";
    }
    
}
