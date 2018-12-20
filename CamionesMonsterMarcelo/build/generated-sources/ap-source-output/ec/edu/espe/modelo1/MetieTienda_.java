package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.MepedPedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(MetieTienda.class)
public class MetieTienda_ { 

    public static volatile SingularAttribute<MetieTienda, String> metieTelef;
    public static volatile CollectionAttribute<MetieTienda, MepedPedido> mepedPedidoCollection;
    public static volatile SingularAttribute<MetieTienda, String> metieNombre;
    public static volatile SingularAttribute<MetieTienda, String> metieDirec;
    public static volatile SingularAttribute<MetieTienda, Integer> metieEstado;
    public static volatile SingularAttribute<MetieTienda, String> metieCodigo;

}