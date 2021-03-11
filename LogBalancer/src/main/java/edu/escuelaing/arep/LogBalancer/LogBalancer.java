package edu.escuelaing.arep.LogBalancer;

import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import edu.escuelaing.arep.LogBalancer.persistence.BDConection;

/**
 * ceseg
 *
 */
public class LogBalancer{
	private static BDConection mongo = new BDConection();
    public static void main(String... args){
        port(getPort());
        get ("hello", (req,res) -> "Hello Docker!");
        post("/",(req,res) -> inputDataPage(req, res));
        get("/result",(req,res)-> resultDataPage(req,res));
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
    /**
     * Pagina de inicio donde se ingresan los datos ha calcular
     * @param req Tiene la informacion de la petición.
     * @param res Tiene la información con la respuesta del servidor.
     * @return String que contiene el codigo generado del HTML
     */
    private static String resultDataPage(spark.Request req, spark.Response res) {
        mongo.addData("holarpueba");
    	String pageContent = mongo.getData();
    	System.out.print(pageContent);
        return pageContent;
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}