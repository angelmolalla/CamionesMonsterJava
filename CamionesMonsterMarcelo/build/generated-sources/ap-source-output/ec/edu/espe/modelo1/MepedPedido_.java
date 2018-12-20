package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.FedetDetfac;
import ec.edu.espe.modelo1.MealmAlmac;
import ec.edu.espe.modelo1.MetieTienda;
import ec.edu.espe.modelo1.MeviaViaje;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(MepedPedido.class)
public class MepedPedido_ { 

    public static volatile SingularAttribute<MepedPedido, String> mepedCodigo;
    public static volatile CollectionAttribute<MepedPedido, MeviaViaje> meviaViajeCollection;
    public static volatile SingularAttribute<MepedPedido, Integer> mepedEstado;
    public static volatile CollectionAttribute<MepedPedido, FedetDetfac> fedetDetfacCollection;
    public static volatile SingularAttribute<MepedPedido, Float> mepedPeso;
    public static volatile SingularAttribute<MepedPedido, Float> mepedCosto;
    public static volatile SingularAttribute<MepedPedido, MetieTienda> metieCodigo;
    public static volatile SingularAttribute<MepedPedido, Float> mepedVol;
    public static volatile SingularAttribute<MepedPedido, MealmAlmac> mealmCodigo;

}