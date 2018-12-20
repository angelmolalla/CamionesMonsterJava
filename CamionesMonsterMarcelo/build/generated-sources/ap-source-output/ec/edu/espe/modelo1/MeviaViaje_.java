package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.MecamCamion;
import ec.edu.espe.modelo1.MepedPedido;
import ec.edu.espe.modelo1.PeempEmplea;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(MeviaViaje.class)
public class MeviaViaje_ { 

    public static volatile CollectionAttribute<MeviaViaje, MepedPedido> mepedPedidoCollection;
    public static volatile SingularAttribute<MeviaViaje, String> meviaCodigo;
    public static volatile SingularAttribute<MeviaViaje, Float> meviaPeso;
    public static volatile SingularAttribute<MeviaViaje, Integer> meviaEstado;
    public static volatile SingularAttribute<MeviaViaje, MecamCamion> mecamCodigo;
    public static volatile SingularAttribute<MeviaViaje, Date> meviaFefin;
    public static volatile SingularAttribute<MeviaViaje, Float> meviaVol;
    public static volatile SingularAttribute<MeviaViaje, Date> meviaFeprog;
    public static volatile SingularAttribute<MeviaViaje, PeempEmplea> peempCodigo;

}