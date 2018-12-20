package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.PeempEmplea;
import ec.edu.espe.modelo1.XeestEstado;
import ec.edu.espe.modelo1.XeuxpUsxper;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(XeusuUsua.class)
public class XeusuUsua_ { 

    public static volatile SingularAttribute<XeusuUsua, Date> xeusuFecrea;
    public static volatile SingularAttribute<XeusuUsua, String> xeusuPfirm;
    public static volatile SingularAttribute<XeusuUsua, XeestEstado> xeestCodigo;
    public static volatile SingularAttribute<XeusuUsua, PeempEmplea> peempEmplea;
    public static volatile SingularAttribute<XeusuUsua, String> xeusuPass;
    public static volatile SingularAttribute<XeusuUsua, String> peempCodigo;
    public static volatile CollectionAttribute<XeusuUsua, XeuxpUsxper> xeuxpUsxperCollection;
    public static volatile SingularAttribute<XeusuUsua, Date> xeusuFeucam;

}