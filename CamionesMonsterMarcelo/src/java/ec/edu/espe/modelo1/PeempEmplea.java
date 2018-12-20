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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "peemp_emplea")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeempEmplea.findAll", query = "SELECT p FROM PeempEmplea p")
    , @NamedQuery(name = "PeempEmplea.findByPeempCodigo", query = "SELECT p FROM PeempEmplea p WHERE p.peempCodigo = :peempCodigo")
    , @NamedQuery(name = "PeempEmplea.findByPeempNombre", query = "SELECT p FROM PeempEmplea p WHERE p.peempNombre = :peempNombre")
    , @NamedQuery(name = "PeempEmplea.findByPeempApelli", query = "SELECT p FROM PeempEmplea p WHERE p.peempApelli = :peempApelli")
    , @NamedQuery(name = "PeempEmplea.findByPeempCedula", query = "SELECT p FROM PeempEmplea p WHERE p.peempCedula = :peempCedula")
    , @NamedQuery(name = "PeempEmplea.findByPeempPaspr", query = "SELECT p FROM PeempEmplea p WHERE p.peempPaspr = :peempPaspr")
    , @NamedQuery(name = "PeempEmplea.findByPeempRuc", query = "SELECT p FROM PeempEmplea p WHERE p.peempRuc = :peempRuc")
    , @NamedQuery(name = "PeempEmplea.findByPeempFenac", query = "SELECT p FROM PeempEmplea p WHERE p.peempFenac = :peempFenac")
    , @NamedQuery(name = "PeempEmplea.findByPeempFeing", query = "SELECT p FROM PeempEmplea p WHERE p.peempFeing = :peempFeing")
    , @NamedQuery(name = "PeempEmplea.findByPeempFesal", query = "SELECT p FROM PeempEmplea p WHERE p.peempFesal = :peempFesal")
    , @NamedQuery(name = "PeempEmplea.findByPeempDiscap", query = "SELECT p FROM PeempEmplea p WHERE p.peempDiscap = :peempDiscap")
    , @NamedQuery(name = "PeempEmplea.findByPeempCarfam", query = "SELECT p FROM PeempEmplea p WHERE p.peempCarfam = :peempCarfam")
    , @NamedQuery(name = "PeempEmplea.findByPeempTelef", query = "SELECT p FROM PeempEmplea p WHERE p.peempTelef = :peempTelef")
    , @NamedQuery(name = "PeempEmplea.findByPeempEmail", query = "SELECT p FROM PeempEmplea p WHERE p.peempEmail = :peempEmail")
    , @NamedQuery(name = "PeempEmplea.findByPeempEstado", query = "SELECT p FROM PeempEmplea p WHERE p.peempEstado = :peempEstado")
    , @NamedQuery(name = "PeempEmplea.findByPeempDirec", query = "SELECT p FROM PeempEmplea p WHERE p.peempDirec = :peempDirec")})
public class PeempEmplea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PEEMP_CODIGO")
    private String peempCodigo;
    @Basic(optional = false)
    @Column(name = "PEEMP_NOMBRE")
    private String peempNombre;
    @Basic(optional = false)
    @Column(name = "PEEMP_APELLI")
    private String peempApelli;
    @Column(name = "PEEMP_CEDULA")
    private String peempCedula;
    @Column(name = "PEEMP_PASPR")
    private String peempPaspr;
    @Column(name = "PEEMP_RUC")
    private String peempRuc;
    @Basic(optional = false)
    @Column(name = "PEEMP_FENAC")
    @Temporal(TemporalType.DATE)
    private Date peempFenac;
    @Basic(optional = false)
    @Column(name = "PEEMP_FEING")
    @Temporal(TemporalType.DATE)
    private Date peempFeing;
    @Column(name = "PEEMP_FESAL")
    @Temporal(TemporalType.DATE)
    private Date peempFesal;
    @Column(name = "PEEMP_DISCAP")
    private String peempDiscap;
    @Column(name = "PEEMP_CARFAM")
    private Short peempCarfam;
    @Column(name = "PEEMP_TELEF")
    private String peempTelef;
    @Column(name = "PEEMP_EMAIL")
    private String peempEmail;
    @Basic(optional = false)
    @Column(name = "PEEMP_ESTADO")
    private int peempEstado;
    @Column(name = "PEEMP_DIREC")
    private String peempDirec;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "peempEmplea")
    private XeusuUsua xeusuUsua;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peempCodigo")
    private Collection<FecabCabec> fecabCabecCollection;
    @OneToMany(mappedBy = "peempCodigo")
    private Collection<MeviaViaje> meviaViajeCollection;
    @JoinColumns({
        @JoinColumn(name = "PECAR_CODIGO", referencedColumnName = "PECAR_CODIGO")
        , @JoinColumn(name = "PEDEP_CODIGO", referencedColumnName = "PEDEP_CODIGO")})
    @ManyToOne(optional = false)
    private PecarCargo pecarCargo;
    @JoinColumn(name = "PEESC_CODIGO", referencedColumnName = "PEESC_CODIGO")
    @ManyToOne
    private PeescEstciv peescCodigo;
    @JoinColumn(name = "PESEX_CODIGO", referencedColumnName = "PESEX_CODIGO")
    @ManyToOne(optional = false)
    private PesexSexo pesexCodigo;

    public PeempEmplea() {
    }

    public PeempEmplea(String peempCodigo) {
        this.peempCodigo = peempCodigo;
    }
   
    public PeempEmplea(String peempCodigo,PesexSexo pesexCodigo,PeescEstciv peescCodigo, PecarCargo pecarCargo, String peempNombre, String peempApelli, String peempCedula, String peempPaspr, String peempRuc, Date peempFenac, Date peempFeing, String peempDiscap, Short peempCarfam, String peempTelef, String peempEmail, String peempDirec ) {
        this.peempCodigo = peempCodigo;
        this.peempNombre = peempNombre;
        this.peempApelli = peempApelli;
        this.peempCedula = peempCedula;
        this.peempPaspr = peempPaspr;
        this.peempRuc = peempRuc;
        this.peempFenac = peempFenac;
        this.peempFeing = peempFeing;
        this.peempDiscap = peempDiscap;
        this.peempCarfam = peempCarfam;
        this.peempTelef = peempTelef;
        this.peempEmail = peempEmail;
        this.peempDirec = peempDirec;
        this.pecarCargo = pecarCargo;
        this.peescCodigo = peescCodigo;
        this.pesexCodigo = pesexCodigo;
    }

    public PeempEmplea(String peempCodigo, String peempNombre, String peempApelli, Date peempFenac, Date peempFeing, int peempEstado) {
        this.peempCodigo = peempCodigo;
        this.peempNombre = peempNombre;
        this.peempApelli = peempApelli;
        this.peempFenac = peempFenac;
        this.peempFeing = peempFeing;
        this.peempEstado = peempEstado;
    }

   

    public String getPeempCodigo() {
        return peempCodigo;
    }

    public void setPeempCodigo(String peempCodigo) {
        this.peempCodigo = peempCodigo;
    }

    public String getPeempNombre() {
        return peempNombre;
    }

    public void setPeempNombre(String peempNombre) {
        this.peempNombre = peempNombre;
    }

    public String getPeempApelli() {
        return peempApelli;
    }

    public void setPeempApelli(String peempApelli) {
        this.peempApelli = peempApelli;
    }

    public String getPeempCedula() {
        return peempCedula;
    }

    public void setPeempCedula(String peempCedula) {
        this.peempCedula = peempCedula;
    }

    public String getPeempPaspr() {
        return peempPaspr;
    }

    public void setPeempPaspr(String peempPaspr) {
        this.peempPaspr = peempPaspr;
    }

    public String getPeempRuc() {
        return peempRuc;
    }

    public void setPeempRuc(String peempRuc) {
        this.peempRuc = peempRuc;
    }

    public Date getPeempFenac() {
        return peempFenac;
    }

    public void setPeempFenac(Date peempFenac) {
        this.peempFenac = peempFenac;
    }

    public Date getPeempFeing() {
        return peempFeing;
    }

    public void setPeempFeing(Date peempFeing) {
        this.peempFeing = peempFeing;
    }

    public Date getPeempFesal() {
        return peempFesal;
    }

    public void setPeempFesal(Date peempFesal) {
        this.peempFesal = peempFesal;
    }

    public String getPeempDiscap() {
        return peempDiscap;
    }

    public void setPeempDiscap(String peempDiscap) {
        this.peempDiscap = peempDiscap;
    }

    public Short getPeempCarfam() {
        return peempCarfam;
    }

    public void setPeempCarfam(Short peempCarfam) {
        this.peempCarfam = peempCarfam;
    }

    public String getPeempTelef() {
        return peempTelef;
    }

    public void setPeempTelef(String peempTelef) {
        this.peempTelef = peempTelef;
    }

    public String getPeempEmail() {
        return peempEmail;
    }

    public void setPeempEmail(String peempEmail) {
        this.peempEmail = peempEmail;
    }

    public int getPeempEstado() {
        return peempEstado;
    }

    public void setPeempEstado(int peempEstado) {
        this.peempEstado = peempEstado;
    }

    public String getPeempDirec() {
        return peempDirec;
    }

    public void setPeempDirec(String peempDirec) {
        this.peempDirec = peempDirec;
    }

    public XeusuUsua getXeusuUsua() {
        return xeusuUsua;
    }

    public void setXeusuUsua(XeusuUsua xeusuUsua) {
        this.xeusuUsua = xeusuUsua;
    }

    @XmlTransient
    public Collection<FecabCabec> getFecabCabecCollection() {
        return fecabCabecCollection;
    }

    public void setFecabCabecCollection(Collection<FecabCabec> fecabCabecCollection) {
        this.fecabCabecCollection = fecabCabecCollection;
    }

    @XmlTransient
    public Collection<MeviaViaje> getMeviaViajeCollection() {
        return meviaViajeCollection;
    }

    public void setMeviaViajeCollection(Collection<MeviaViaje> meviaViajeCollection) {
        this.meviaViajeCollection = meviaViajeCollection;
    }

    public PecarCargo getPecarCargo() {
        return pecarCargo;
    }

    public void setPecarCargo(PecarCargo pecarCargo) {
        this.pecarCargo = pecarCargo;
    }

    public PeescEstciv getPeescCodigo() {
        return peescCodigo;
    }

    public void setPeescCodigo(PeescEstciv peescCodigo) {
        this.peescCodigo = peescCodigo;
    }

    public PesexSexo getPesexCodigo() {
        return pesexCodigo;
    }

    public void setPesexCodigo(PesexSexo pesexCodigo) {
        this.pesexCodigo = pesexCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peempCodigo != null ? peempCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeempEmplea)) {
            return false;
        }
        PeempEmplea other = (PeempEmplea) object;
        if ((this.peempCodigo == null && other.peempCodigo != null) || (this.peempCodigo != null && !this.peempCodigo.equals(other.peempCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.controlador1.PeempEmplea[ peempCodigo=" + peempCodigo + " ]";
    }
    
}
