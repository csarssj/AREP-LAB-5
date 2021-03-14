# TALLER DE MODULARIZACIÓN CON VIRTUALIZACION E INTRODUCCION A DOCKER Y AWS 

## Manual de usuario

Si se deseea hacer uso del programa lo primero que debe realizarse el clonar el repositorio almacenado en Github a través del siguiente comando:

```
git clone https://github.com/csarssj/AREP-LAB-5.git

```
O si desea puede descargarlo como archivo zip y luego descomprimirlo en la carpeta que desee.

Una vez hecho alguno de los dos pasos anteriores, nos dirigimos a la ruta de instalación y por medio de la consola digitamos el siguiente comando:

```
mvn package

```

Ejecutando el siguiente comando puede generar la documentacion:

```
mvn javadoc:javadoc

```

Ejecutando el siquiente comando en la consola y accediendo al siguiente link se puede visualizar una prueba.

```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.SparkWebServer.SparkWebServer


```


### Prerequisitos

Este proyecto necesita tener los siguientes progamas instalados en la máquina donde se deseea ejecutar:

```
  java version "1.8.0_251"
  Apache Maven 3.6.3
  git version 2.25.0.windows.1
  jdk1.8.0_251
```

El sistema, mas alla de facilitar el registro de las iniciativas e ideas de proyectos, es una valiosa base de conocimiento donde los diferentes actores pueden revisar si hay iniciativas, ideas o intereses similares y aunar esfuerzos para la materializacion.

### Reporte de pruebas

Construir la imagen con el siguiente comando:

```
  docker build --tag logservice .
  
```

![image](https://github.com/csarssj/AREP-LAB-5/blob/main/img/configlog.jpg)

Se crean las tres instancias con el siguiente comando:


```
docker run -d -p 35001:6000 --name firstdockercontainer logbalancer
docker run -d -p 35002:6000 --name firstdockercontainer2 logbalancer
docker run -d -p 35003:6000 --name firstdockercontainer3 logbalancer
  
```
![image](https://github.com/csarssj/AREP-LAB-5/blob/main/img/configlog2.jpg)

Se realiza el mismo proceso para el sparkwebserver:

![image](https://github.com/csarssj/AREP-LAB-5/blob/main/img/configlog3.jpg)

Se confirma en la app de docker:

![image](https://github.com/csarssj/AREP-LAB-5/blob/main/img/images.jpg)

Se realizan las pruebas de manera local:

![image](https://github.com/csarssj/AREP-LAB-5/blob/main/img/localhostprueba2.jpg)

Tambien con postman

(https://github.com/csarssj/AREP-LAB-5/blob/main/img/localhostprueba3.jpg)

Se realiza una peticion post desde el robinround al log service y se comprueba que funciona:

![image](https://github.com/csarssj/AREP-LAB-5/blob/main/img/docker1.jpg)

![image](https://github.com/csarssj/AREP-LAB-5/blob/main/img/docker2.jpg)

## Construido en

* [Maven](https://maven.apache.org/) - Dependency Management


## Integración continua

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/csarssj/AREP-LAB-5)

## Control de versiones 

[Github](https://github.com/) para el versionamiento.

## Authors

[César González](https://github.com/csarssj) 

_Fecha : 13 de Marzo del 2021_ 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) 