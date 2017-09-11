package BD;

import Entidades.Registro;

/**
 * Created by darle on 9/11/2017.
 */
public class RegistroServices extends GestionDB<Registro>{


    private static RegistroServices instancia;


   public RegistroServices() {
        super(Registro.class);
    }

    public static BD.RegistroServices getInstancia() {
        if (instancia == null) {
            instancia = new BD.RegistroServices();
        }
        return instancia;
    }

}
