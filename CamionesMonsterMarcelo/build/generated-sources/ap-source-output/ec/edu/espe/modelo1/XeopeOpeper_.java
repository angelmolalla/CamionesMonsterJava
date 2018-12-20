package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.XeopcOpcion;
import ec.edu.espe.modelo1.XeopeOpeperPK;
import ec.edu.espe.modelo1.XeperPerfil;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(XeopeOpeper.class)
public class XeopeOpeper_ { 

    public static volatile SingularAttribute<XeopeOpeper, String> xeopeEstado;
    public static volatile SingularAttribute<XeopeOpeper, XeopcOpcion> xeopcOpcion;
    public static volatile SingularAttribute<XeopeOpeper, XeopeOpeperPK> xeopeOpeperPK;
    public static volatile SingularAttribute<XeopeOpeper, Date> xeopeFasign;
    public static volatile SingularAttribute<XeopeOpeper, XeperPerfil> xeperPerfil;

}