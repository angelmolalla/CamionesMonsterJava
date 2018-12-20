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
@Table(name = "pesex_sexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PesexSexo.findAll", query = "SELECT p FROM PesexSexo p")
    , @NamedQuery(name = "PesexSexo.findByPesexCodigo", query = "SELECT p FROM PesexSexo p WHERE p.pesexCodigo = :pesexCodigo")
    , @NamedQuery(name = "PesexSexo.findByPesexDesc", query = "SELECT p FROM PesexSexo p WHERE p.pesexDesc = :pesexDesc")})
public class PesexSexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PESEX_CODIGO")
    private String pesexCodigo;
    @Basic(optional = false)
    @Column(name = "PESEX_DESC")
    private String pesexDesc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pesexCodigo")
    private Collection<PeempEmplea> peempEmpleaCollection;

    public PesexSexo() {
    }

    public PesexSexo(String pesexCodigo) {
        this.pesexCodigo = pesexCodigo;
    }

    public PesexSexo(String pesexCodigo, String pesexDesc) {
        this.pesexCodigo = pesexCodigo;
        this.pesexDesc = pesexDesc;
    }

    public String getPesexCodigo() {
        return pesexCodigo;
    }

    public void setPesexCodigo(String pesexCodigo) {
        this.pesexCodigo = pesexCodigo;
    }

    public String getPesexDesc() {
        return pesexDesc;
    }

    public void setPesexDesc(String pesexDesc) {
        this.pesexDesc = pesexDesc;
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
        hash += (pesexCodigo != null ? pesexCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PesexSexo)) {
            return false;
        }
        PesexSexo other = (PesexSexo) object;
        if ((this.pesexCodigo == null && other.pesexCodigo != null) || (this.pesexCodigo != null && !this.pesexCodigo.equals(other.pesexCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.PesexSexo[ pesexCodigo=" + pesexCodigo + " ]";
    }
    
}
