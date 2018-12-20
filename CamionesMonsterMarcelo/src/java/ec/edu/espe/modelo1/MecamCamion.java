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
@Table(name = "mecam_camion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MecamCamion.findAll", query = "SELECT m FROM MecamCamion m")
    , @NamedQuery(name = "MecamCamion.findByMecamCodigo", query = "SELECT m FROM MecamCamion m WHERE m.mecamCodigo = :mecamCodigo")
    , @NamedQuery(name = "MecamCamion.findByMecamPlaca", query = "SELECT m FROM MecamCamion m WHERE m.mecamPlaca = :mecamPlaca")
    , @NamedQuery(name = "MecamCamion.findByMecamVol", query = "SELECT m FROM MecamCamion m WHERE m.mecamVol = :mecamVol")
    , @NamedQuery(name = "MecamCamion.findByMecamPeso", query = "SELECT m FROM MecamCamion m WHERE m.mecamPeso = :mecamPeso")
    , @NamedQuery(name = "MecamCamion.findByMecamEstado", query = "SELECT m FROM MecamCamion m WHERE m.mecamEstado = :mecamEstado")})
public class MecamCamion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MECAM_CODIGO")
    private String mecamCodigo;
    @Basic(optional = false)
    @Column(name = "MECAM_PLACA")
    private String mecamPlaca;
    @Basic(optional = false)
    @Column(name = "MECAM_VOL")
    private float mecamVol;
    @Basic(optional = false)
    @Column(name = "MECAM_PESO")
    private float mecamPeso;
    @Basic(optional = false)
    @Column(name = "MECAM_ESTADO")
    private int mecamEstado;
    @OneToMany(mappedBy = "mecamCodigo")
    private Collection<MeviaViaje> meviaViajeCollection;

    public MecamCamion() {
    }

    public MecamCamion(String mecamCodigo) {
        this.mecamCodigo = mecamCodigo;
    }

    public MecamCamion(String mecamCodigo, String mecamPlaca, float mecamVol, float mecamPeso, int mecamEstado) {
        this.mecamCodigo = mecamCodigo;
        this.mecamPlaca = mecamPlaca;
        this.mecamVol = mecamVol;
        this.mecamPeso = mecamPeso;
        this.mecamEstado = mecamEstado;
    }

    public String getMecamCodigo() {
        return mecamCodigo;
    }

    public void setMecamCodigo(String mecamCodigo) {
        this.mecamCodigo = mecamCodigo;
    }

    public String getMecamPlaca() {
        return mecamPlaca;
    }

    public void setMecamPlaca(String mecamPlaca) {
        this.mecamPlaca = mecamPlaca;
    }

    public float getMecamVol() {
        return mecamVol;
    }

    public void setMecamVol(float mecamVol) {
        this.mecamVol = mecamVol;
    }

    public float getMecamPeso() {
        return mecamPeso;
    }

    public void setMecamPeso(float mecamPeso) {
        this.mecamPeso = mecamPeso;
    }

    public int getMecamEstado() {
        return mecamEstado;
    }

    public void setMecamEstado(int mecamEstado) {
        this.mecamEstado = mecamEstado;
    }

    @XmlTransient
    public Collection<MeviaViaje> getMeviaViajeCollection() {
        return meviaViajeCollection;
    }

    public void setMeviaViajeCollection(Collection<MeviaViaje> meviaViajeCollection) {
        this.meviaViajeCollection = meviaViajeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mecamCodigo != null ? mecamCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MecamCamion)) {
            return false;
        }
        MecamCamion other = (MecamCamion) object;
        if ((this.mecamCodigo == null && other.mecamCodigo != null) || (this.mecamCodigo != null && !this.mecamCodigo.equals(other.mecamCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.MecamCamion[ mecamCodigo=" + mecamCodigo + " ]";
    }
    
}
