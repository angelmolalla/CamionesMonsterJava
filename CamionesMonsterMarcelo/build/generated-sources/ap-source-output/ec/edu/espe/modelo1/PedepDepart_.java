package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.PecarCargo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(PedepDepart.class)
public class PedepDepart_ { 

    public static volatile SingularAttribute<PedepDepart, String> pedepCodigo;
    public static volatile SingularAttribute<PedepDepart, String> pedepDesc;
    public static volatile CollectionAttribute<PedepDepart, PecarCargo> pecarCargoCollection;

}