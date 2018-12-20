package ec.edu.espe.modelo1;

import ec.edu.espe.modelo1.MeviaViaje;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-17T02:15:22")
@StaticMetamodel(MecamCamion.class)
public class MecamCamion_ { 

    public static volatile CollectionAttribute<MecamCamion, MeviaViaje> meviaViajeCollection;
    public static volatile SingularAttribute<MecamCamion, String> mecamPlaca;
    public static volatile SingularAttribute<MecamCamion, Float> mecamVol;
    public static volatile SingularAttribute<MecamCamion, Float> mecamPeso;
    public static volatile SingularAttribute<MecamCamion, String> mecamCodigo;
    public static volatile SingularAttribute<MecamCamion, Integer> mecamEstado;

}