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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "fecab_cabec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FecabCabec.findAll", query = "SELECT f FROM FecabCabec f")
    , @NamedQuery(name = "FecabCabec.findByFecabCodigo", query = "SELECT f FROM FecabCabec f WHERE f.fecabCodigo = :fecabCodigo")
    , @NamedQuery(name = "FecabCabec.findByFecabFecha", query = "SELECT f FROM FecabCabec f WHERE f.fecabFecha = :fecabFecha")
    , @NamedQuery(name = "FecabCabec.findByFecabSubtot", query = "SELECT f FROM FecabCabec f WHERE f.fecabSubtot = :fecabSubtot")
    , @NamedQuery(name = "FecabCabec.findByFecabIva", query = "SELECT f FROM FecabCabec f WHERE f.fecabIva = :fecabIva")
    , @NamedQuery(name = "FecabCabec.findByFecabDescue", query = "SELECT f FROM FecabCabec f WHERE f.fecabDescue = :fecabDescue")
    , @NamedQuery(name = "FecabCabec.findByFecabTotal", query = "SELECT f FROM FecabCabec f WHERE f.fecabTotal = :fecabTotal")
    , @NamedQuery(name = "FecabCabec.findByFecabEstado", query = "SELECT f FROM FecabCabec f WHERE f.fecabEstado = :fecabEstado")})
public class FecabCabec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FECAB_CODIGO")
    private String fecabCodigo;
    @Basic(optional = false)
    @Column(name = "FECAB_FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecabFecha;
    @Basic(optional = false)
    @Column(name = "FECAB_SUBTOT")
    private float fecabSubtot;
    @Basic(optional = false)
    @Column(name = "FECAB_IVA")
    private float fecabIva;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FECAB_DESCUE")
    private Float fecabDescue;
    @Basic(optional = false)
    @Column(name = "FECAB_TOTAL")
    private float fecabTotal;
    @Basic(optional = false)
    @Column(name = "FECAB_ESTADO")
    private int fecabEstado;
    @JoinColumn(name = "FECLI_CODIGO", referencedColumnName = "FECLI_CODIGO")
    @ManyToOne(optional = false)
    private FecliClien fecliCodigo;
    @JoinColumn(name = "FEFOR_CODIGO", referencedColumnName = "FEFOR_CODIGO")
    @ManyToOne(optional = false)
    private FeforForpag feforCodigo;
    @JoinColumn(name = "PEEMP_CODIGO", referencedColumnName = "PEEMP_CODIGO")
    @ManyToOne(optional = false)
    private PeempEmplea peempCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fecabCabec")
    private Collection<FedetDetfac> fedetDetfacCollection;

    public FecabCabec() {
    }

    public FecabCabec(String fecabCodigo) {
        this.fecabCodigo = fecabCodigo;
    }

    public FecabCabec(String fecabCodigo, Date fecabFecha, float fecabSubtot, float fecabIva, float fecabTotal, int fecabEstado) {
        this.fecabCodigo = fecabCodigo;
        this.fecabFecha = fecabFecha;
        this.fecabSubtot = fecabSubtot;
        this.fecabIva = fecabIva;
        this.fecabTotal = fecabTotal;
        this.fecabEstado = fecabEstado;
    }

    public String getFecabCodigo() {
        return fecabCodigo;
    }

    public void setFecabCodigo(String fecabCodigo) {
        this.fecabCodigo = fecabCodigo;
    }

    public Date getFecabFecha() {
        return fecabFecha;
    }

    public void setFecabFecha(Date fecabFecha) {
        this.fecabFecha = fecabFecha;
    }

    public float getFecabSubtot() {
        return fecabSubtot;
    }

    public void setFecabSubtot(float fecabSubtot) {
        this.fecabSubtot = fecabSubtot;
    }

    public float getFecabIva() {
        return fecabIva;
    }

    public void setFecabIva(float fecabIva) {
        this.fecabIva = fecabIva;
    }

    public Float getFecabDescue() {
        return fecabDescue;
    }

    public void setFecabDescue(Float fecabDescue) {
        this.fecabDescue = fecabDescue;
    }

    public float getFecabTotal() {
        return fecabTotal;
    }

    public void setFecabTotal(float fecabTotal) {
        this.fecabTotal = fecabTotal;
    }

    public int getFecabEstado() {
        return fecabEstado;
    }

    public void setFecabEstado(int fecabEstado) {
        this.fecabEstado = fecabEstado;
    }

    public FecliClien getFecliCodigo() {
        return fecliCodigo;
    }

    public void setFecliCodigo(FecliClien fecliCodigo) {
        this.fecliCodigo = fecliCodigo;
    }

    public FeforForpag getFeforCodigo() {
        return feforCodigo;
    }

    public void setFeforCodigo(FeforForpag feforCodigo) {
        this.feforCodigo = feforCodigo;
    }

    public PeempEmplea getPeempCodigo() {
        return peempCodigo;
    }

    public void setPeempCodigo(PeempEmplea peempCodigo) {
        this.peempCodigo = peempCodigo;
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
        hash += (fecabCodigo != null ? fecabCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FecabCabec)) {
            return false;
        }
        FecabCabec other = (FecabCabec) object;
        if ((this.fecabCodigo == null && other.fecabCodigo != null) || (this.fecabCodigo != null && !this.fecabCodigo.equals(other.fecabCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.FecabCabec[ fecabCodigo=" + fecabCodigo + " ]";
    }
    
}
