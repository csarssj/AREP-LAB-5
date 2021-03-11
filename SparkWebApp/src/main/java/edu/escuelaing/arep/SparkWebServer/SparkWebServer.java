package edu.escuelaing.arep.SparkWebServer;

import static spark.Spark.*;


import okhttp3.Request;
import okhttp3.Response;

/**
 * Ceseg
 *
 */
public class SparkWebServer
{
    public static void main(String... args){
    	HTTPClient client = new HTTPClient();
        port(getPort());
        get ("hello", (req,res) -> "Hello Docker!");
        get("/",(req,res) -> inputDataPage(req, res));

    }
    
    /**
     * Pagina de inicio donde se ingresan los datos ha calcular
     * @param req Tiene la informacion de la petición.
     * @param res Tiene la información con la respuesta del servidor.
     * @return String que contiene el codigo generado del HTML
     */
    private static String inputDataPage(spark.Request req, spark.Response res) {
        String pageContent
                = "";
        return pageContent;
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
