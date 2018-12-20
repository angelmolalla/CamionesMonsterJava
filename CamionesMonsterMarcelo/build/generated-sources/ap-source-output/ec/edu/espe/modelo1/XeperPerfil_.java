package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.XeopeOpeper;
import ec.edu.espe.modelo1.XerolRol;
import ec.edu.espe.modelo1.XeuxpUsxper;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(XeperPerfil.class)
public class XeperPerfil_ { 

    public static volatile CollectionAttribute<XeperPerfil, XeopeOpeper> xeopeOpeperCollection;
    public static volatile SingularAttribute<XeperPerfil, String> xeperCodigo;
    public static volatile SingularAttribute<XeperPerfil, String> xeperDesc;
    public static volatile SingularAttribute<XeperPerfil, XerolRol> xerolRol;
    public static volatile SingularAttribute<XeperPerfil, String> xeperObser;
    public static volatile CollectionAttribute<XeperPerfil, XeuxpUsxper> xeuxpUsxperCollection;

}