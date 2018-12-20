package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.FecabCabec;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(FecliClien.class)
public class FecliClien_ { 

    public static volatile SingularAttribute<FecliClien, String> fecliRuc;
    public static volatile SingularAttribute<FecliClien, Integer> fecliEstado;
    public static volatile SingularAttribute<FecliClien, String> fecliCodigo;
    public static volatile SingularAttribute<FecliClien, String> fecliRazsoc;
    public static volatile SingularAttribute<FecliClien, String> fecliCedula;
    public static volatile CollectionAttribute<FecliClien, FecabCabec> fecabCabecCollection;
    public static volatile SingularAttribute<FecliClien, String> fecliDirec;
    public static volatile SingularAttribute<FecliClien, String> fecliTelef;

}