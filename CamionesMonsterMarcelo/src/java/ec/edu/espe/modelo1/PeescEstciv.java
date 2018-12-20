/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo1;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "peesc_estciv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeescEstciv.findAll", query = "SELECT p FROM PeescEstciv p")
    , @NamedQuery(name = "PeescEstciv.findByPeescCodigo", query = "SELECT p FROM PeescEstciv p WHERE p.peescCodigo = :peescCodigo")
    , @NamedQuery(name = "PeescEstciv.findByPeescDesc", query = "SELECT p FROM PeescEstciv p WHERE p.peescDesc = :peescDesc")})
public class PeescEstciv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PEESC_CODIGO")
    private String peescCodigo;
    @Basic(optional = false)
    @Column(name = "PEESC_DESC")
    private String peescDesc;
    @OneToMany(mappedBy = "peescCodigo")
    private Collection<PeempEmplea> peempEmpleaCollection;

    public PeescEstciv() {
    }

    public PeescEstciv(String peescCodigo) {
        this.peescCodigo = peescCodigo;
    }

    public PeescEstciv(String peescCodigo, String peescDesc) {
        this.peescCodigo = peescCodigo;
        this.peescDesc = peescDesc;
    }

    public String getPeescCodigo() {
        return peescCodigo;
    }

    public void setPeescCodigo(String peescCodigo) {
        this.peescCodigo = peescCodigo;
    }

    public String getPeescDesc() {
        return peescDesc;
    }

    public void setPeescDesc(String peescDesc) {
        this.peescDesc = peescDesc;
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
        hash += (peescCodigo != null ? peescCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeescEstciv)) {
            return false;
        }
        PeescEstciv other = (PeescEstciv) object;
        if ((this.peescCodigo == null && other.peescCodigo != null) || (this.peescCodigo != null && !this.peescCodigo.equals(other.peescCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.PeescEstciv[ peescCodigo=" + peescCodigo + " ]";
    }
    
}
