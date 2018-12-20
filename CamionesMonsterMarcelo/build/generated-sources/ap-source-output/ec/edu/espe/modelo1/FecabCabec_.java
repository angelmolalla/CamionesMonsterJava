package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.FecliClien;
import ec.edu.espe.modelo1.FedetDetfac;
import ec.edu.espe.modelo1.FeforForpag;
import ec.edu.espe.modelo1.PeempEmplea;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(FecabCabec.class)
public class FecabCabec_ { 

    public static volatile SingularAttribute<FecabCabec, Date> fecabFecha;
    public static volatile SingularAttribute<FecabCabec, Float> fecabDescue;
    public static volatile SingularAttribute<FecabCabec, Integer> fecabEstado;
    public static volatile SingularAttribute<FecabCabec, FecliClien> fecliCodigo;
    public static volatile SingularAttribute<FecabCabec, FeforForpag> feforCodigo;
    public static volatile SingularAttribute<FecabCabec, String> fecabCodigo;
    public static volatile SingularAttribute<FecabCabec, Float> fecabSubtot;
    public static volatile CollectionAttribute<FecabCabec, FedetDetfac> fedetDetfacCollection;
    public static volatile SingularAttribute<FecabCabec, Float> fecabTotal;
    public static volatile SingularAttribute<FecabCabec, PeempEmplea> peempCodigo;
    public static volatile SingularAttribute<FecabCabec, Float> fecabIva;

}