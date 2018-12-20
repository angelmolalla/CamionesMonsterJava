package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.MepedPedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(MealmAlmac.class)
public class MealmAlmac_ { 

    public static volatile CollectionAttribute<MealmAlmac, MepedPedido> mepedPedidoCollection;
    public static volatile SingularAttribute<MealmAlmac, String> mealmTelef;
    public static volatile SingularAttribute<MealmAlmac, String> mealmDirec;
    public static volatile SingularAttribute<MealmAlmac, Integer> mealmEstado;
    public static volatile SingularAttribute<MealmAlmac, String> mealmCodigo;

}