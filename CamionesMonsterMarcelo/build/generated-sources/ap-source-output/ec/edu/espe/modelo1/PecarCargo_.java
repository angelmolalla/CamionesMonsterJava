package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.PecarCargoPK;
import ec.edu.espe.modelo1.PedepDepart;
import ec.edu.espe.modelo1.PeempEmplea;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(PecarCargo.class)
public class PecarCargo_ { 

    public static volatile SingularAttribute<PecarCargo, PecarCargoPK> pecarCargoPK;
    public static volatile CollectionAttribute<PecarCargo, PeempEmplea> peempEmpleaCollection;
    public static volatile SingularAttribute<PecarCargo, String> pecarDesc;
    public static volatile SingularAttribute<PecarCargo, PedepDepart> pedepDepart;

}