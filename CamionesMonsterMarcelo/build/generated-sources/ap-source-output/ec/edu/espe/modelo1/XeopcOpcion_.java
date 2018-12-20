package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.XeopeOpeper;
import ec.edu.espe.modelo1.XesisSistem;
import ec.edu.espe.modelo1.XevenVentan;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(XeopcOpcion.class)
public class XeopcOpcion_ { 

    public static volatile CollectionAttribute<XeopcOpcion, XeopeOpeper> xeopeOpeperCollection;
    public static volatile SingularAttribute<XeopcOpcion, String> xeopcDesc;
    public static volatile SingularAttribute<XeopcOpcion, String> xeopcCodigo;
    public static volatile CollectionAttribute<XeopcOpcion, XevenVentan> xevenVentanCollection;
    public static volatile SingularAttribute<XeopcOpcion, XesisSistem> xesisCodigo;

}