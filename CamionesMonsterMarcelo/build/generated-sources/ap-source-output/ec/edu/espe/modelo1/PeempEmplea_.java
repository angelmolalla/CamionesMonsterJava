package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.FecabCabec;
import ec.edu.espe.modelo1.MeviaViaje;
import ec.edu.espe.modelo1.PecarCargo;
import ec.edu.espe.modelo1.PeescEstciv;
import ec.edu.espe.modelo1.PesexSexo;
import ec.edu.espe.modelo1.XeusuUsua;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(PeempEmplea.class)
public class PeempEmplea_ { 

    public static volatile SingularAttribute<PeempEmplea, String> peempApelli;
    public static volatile SingularAttribute<PeempEmplea, String> peempPaspr;
    public static volatile CollectionAttribute<PeempEmplea, MeviaViaje> meviaViajeCollection;
    public static volatile SingularAttribute<PeempEmplea, PesexSexo> pesexCodigo;
    public static volatile SingularAttribute<PeempEmplea, Date> peempFesal;
    public static volatile SingularAttribute<PeempEmplea, String> peempTelef;
    public static volatile SingularAttribute<PeempEmplea, PecarCargo> pecarCargo;
    public static volatile SingularAttribute<PeempEmplea, String> peempRuc;
    public static volatile SingularAttribute<PeempEmplea, String> peempCodigo;
    public static volatile SingularAttribute<PeempEmplea, XeusuUsua> xeusuUsua;
    public static volatile SingularAttribute<PeempEmplea, PeescEstciv> peescCodigo;
    public static volatile SingularAttribute<PeempEmplea, String> peempCedula;
    public static volatile SingularAttribute<PeempEmplea, Short> peempCarfam;
    public static volatile SingularAttribute<PeempEmplea, Integer> peempEstado;
    public static volatile SingularAttribute<PeempEmplea, String> peempEmail;
    public static volatile SingularAttribute<PeempEmplea, String> peempDirec;
    public static volatile SingularAttribute<PeempEmplea, String> peempNombre;
    public static volatile SingularAttribute<PeempEmplea, Date> peempFeing;
    public static volatile SingularAttribute<PeempEmplea, Date> peempFenac;
    public static volatile CollectionAttribute<PeempEmplea, FecabCabec> fecabCabecCollection;
    public static volatile SingularAttribute<PeempEmplea, String> peempDiscap;

}