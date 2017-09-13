import BD.BootStrapService;
import BD.RegistroServices;
import Entidades.Registro;
import Utilidades.JsonUtilidades;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONArray;
import org.json.JSONObject;
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
            JSONArray arr = new JSONArray(request.body());
            for (int i = 0; i < arr.length(); i++)
            {
                Registro aux = new Registro(arr.getJSONObject(i).getString("nombre"),
                        arr.getJSONObject(i).getString("sector"),
                        arr.getJSONObject(i).getString("educacion"),
                        arr.getJSONObject(i).getString("lugar"));

                RegistroServices.getInstancia().crear(aux);

            }

            return "ok";
        }), JsonUtilidades.json());

        get("/Registros", (request, response) -> {
            return RegistroServices.getInstancia().findAll();
        }, JsonUtilidades.json());

    }


}
