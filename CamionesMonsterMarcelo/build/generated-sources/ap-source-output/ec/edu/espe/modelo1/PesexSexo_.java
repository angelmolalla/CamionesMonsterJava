package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.PeempEmplea;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(PesexSexo.class)
public class PesexSexo_ { 

    public static volatile SingularAttribute<PesexSexo, String> pesexCodigo;
    public static volatile SingularAttribute<PesexSexo, String> pesexDesc;
    public static volatile CollectionAttribute<PesexSexo, PeempEmplea> peempEmpleaCollection;

}