package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.FecabCabec;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(FeforForpag.class)
public class FeforForpag_ { 

    public static volatile SingularAttribute<FeforForpag, String> feforCodigo;
    public static volatile SingularAttribute<FeforForpag, Integer> estadoFormapago;
    public static volatile CollectionAttribute<FeforForpag, FecabCabec> fecabCabecCollection;
    public static volatile SingularAttribute<FeforForpag, String> feforDesc;

}