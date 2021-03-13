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
        get("/",(req,res) -> inputDataPage(req, res));
        get("/result",(req,res)-> resultDataPage(req,res));
    }

    /**
     * Metodo que agrega un nuevo mensaje a la base de datos
     * @param req el request que realiza el cliente
     * @param res la respuesta que se le da al cliente
     * @return la vista de todos los datos en las base de datos
     */
    private static String inputDataPage(spark.Request req, spark.Response res) {
    	mongo.addData(req.queryParams("mensaje"));
    	System.out.println(req.queryParams("mensaje"));
        String pageContent
                = resultDataPage(req,res);
        return pageContent;
    }
    /**
     * Metodo que conecta con la base de datos y extrae sus datos
     * @param req el request que realiza el cliente
     * @param res la respuesta que se le da al cliente
     * @return Datos obtenidos de la base de datos
     */
    private static String resultDataPage(spark.Request req, spark.Response res) {
    	mongo.addData("prueba");
    	String pageContent = mongo.getData();
    	System.out.print(pageContent);
        return pageContent;
    }
    
    /**
     * Metodo que retorna el puerto por el que se va a ejecutar el servicio
     * @return el puerto por el que corre el servicio
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}