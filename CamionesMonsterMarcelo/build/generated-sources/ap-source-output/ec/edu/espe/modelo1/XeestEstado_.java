package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.XesisSistem;
import ec.edu.espe.modelo1.XeusuUsua;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(XeestEstado.class)
public class XeestEstado_ { 

    public static volatile SingularAttribute<XeestEstado, String> xeestCodigo;
    public static volatile SingularAttribute<XeestEstado, String> xeestDesc;
    public static volatile CollectionAttribute<XeestEstado, XeusuUsua> xeusuUsuaCollection;
    public static volatile CollectionAttribute<XeestEstado, XesisSistem> xesisSistemCollection;

}