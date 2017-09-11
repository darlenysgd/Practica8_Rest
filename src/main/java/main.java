import BD.BootStrapService;
import BD.RegistroServices;
import Entidades.Registro;
import Utilidades.JsonUtilidades;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONArray;
import spark.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

/**
 * Created by darle on 9/10/2017.
 */
public class main {

    public final static String ACCEPT_TYPE = "application/json";

    public static void main(String[] args) {

        port(1234);

        staticFiles.location("/");

        BootStrapService.getInstancia().init();


        post("/listadoBD", main.ACCEPT_TYPE, ((request, response) -> {

            ArrayList<Registro>registros= new Gson().fromJson(request.body(), ArrayList.class);
            return "ok";
        }), JsonUtilidades.json());

        get("/Registros", (request, response) -> {
            return RegistroServices.getInstancia().findAll();
        }, JsonUtilidades.json());

    }


}
